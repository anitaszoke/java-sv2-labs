package polymorphism.demo;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    void createTest() {
        Trainer trainer = new Trainer("John Doe", Arrays.asList(new Course("Course1")));

        assertInstanceOf(Trainer.class, trainer);
        assertInstanceOf(Human.class, trainer);
        assertInstanceOf(Object.class, trainer);
        assertInstanceOf(HasName.class, trainer);

        Object object = new Trainer("John Doe", Arrays.asList(new Course("Course1")));

        assertInstanceOf(Trainer.class, object);
        assertInstanceOf(Human.class, object);
        assertInstanceOf(Object.class, object);
        assertInstanceOf(HasName.class, object);

        Human human = new Trainer("John Doe", Arrays.asList(new Course("Course1")));

        assertInstanceOf(Trainer.class, human);
        assertInstanceOf(Human.class, human);
        assertInstanceOf(Object.class, human);
        assertInstanceOf(HasName.class, human);

        HasName hasName = new Trainer("John Doe", Arrays.asList(new Course("Course1")));

        assertInstanceOf(Trainer.class, hasName);
        assertInstanceOf(Human.class, hasName);
        assertInstanceOf(Object.class, hasName);
        assertInstanceOf(HasName.class, hasName);
    }

//    automatikus konverzió - leszármazásihierarchiában Felfelé lépünk - nem kell típuskonverzió aut
//    az adott objektum értékül adható az összes ősosztálynak, összes interfacenak is
    @Test
    void convertTest(){
        Trainer trainer = new Trainer("John Doe", Arrays.asList(new Course("Course1")));

        Human human = trainer; //adott objektum osztálya
        Object object = trainer; //ősosztály
        HasName hasName = trainer; // interface
    }
//    Típuskényszerítés, explicit - leszármazásihierarchiában lefelé lépünk (object ősosztály)
//    kerekzárójelek között kell megadni a céltípust, amivé szeretnénk konvertálni
    @Test
    void explicitConvertTest() {
        Object object = new Trainer("John Doe", Arrays.asList(new Course("Course1")));

        Trainer trainer = (Trainer) object;
    }

    @Test
    void explicitConvertCannotWorkTest(){
        expectedException.expect(ClassCastException.class);
        Human human = new Human("John Doe");
        //Trainer trainer = (Trainer) human; //ClassCastExceptiont dob
//        ok: human magasabban van a hierarchiában, sokkal általánosabb fogalom, mint a trainer
        // bogár == trainer, rovar == human, minden trainernek van kitinpáncélja
    }

}