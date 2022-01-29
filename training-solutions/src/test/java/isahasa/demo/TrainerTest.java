package isahasa.demo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    void workHasCalledTest(){
        WorkStub workStub = new WorkStub();
        Trainer trainer = new Trainer(workStub);
        trainer.doWork();

        assertTrue(workStub.isCalled());
    }
//nem unit tesztek -> csak az osztályok együttműködését teszteljük, tehát  pl.: egy trainer osztály egy hasNoWork objektummal
    @Test
    void hasNOWorkTest() {
        Trainer trainer = new Trainer(new HasNoWork());
        assertEquals(trainer.doWork(),"");

    }

    @Test
    void createMaterialsTest() {
        Trainer trainer = new Trainer(new CreateMaterials());
        assertEquals(trainer.doWork(),"Materials");
    }

    @Test
    void takeCourseTest() {
        Trainer trainer = new Trainer(new TakeCourse());
        assertEquals(trainer.doWork(),"HappyStudent");
    }

    @Test
    void complexWorkTest() {
        Trainer trainer = new Trainer(new ComplexWork(List.of(new CreateMaterials(),new TakeCourse())));
        assertEquals(trainer.doWork(), "Materials, HappyStudent");
    }

//    kompozíció előnye testelve - dinamikus, futásidőben változás
    @Test
    void changeWork() {
        Trainer trainer = new Trainer(new HasNoWork());
        assertEquals(trainer.doWork(),"");

        trainer.setWork(new CreateMaterials());
        assertEquals(trainer.doWork(),"Materials");
    }
}