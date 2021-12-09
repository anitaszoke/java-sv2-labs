package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void createPersonMoveTest() {
        Person person = new Person("Hum Bug", "Humbugfalva");

        assertEquals("Hum Bug", person.getName());
        assertEquals("Humbugfalva", person.getAddress());

        person.migrate("Rum");

        assertEquals("Rum", person.getAddress());
    }
}