package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassRoomTest {

    @Test
    void createClassRoom() {
        ClassRoom classRoom = new ClassRoom("4/2", 50, Facility.PROJECTOR);

        assertEquals("4/2", classRoom.getLocation());
        assertEquals(50, classRoom.getCapacity());
        assertEquals(Facility.PROJECTOR, classRoom.getFacility());
    }

    @Test
    void isSuitableTest() {
        ClassRoom classRoom = new ClassRoom("4/2", 50, Facility.PROJECTOR);
        Course java = new Course(45, Facility.PROJECTOR);
        Course python = new Course(60, Facility.COMPUTERS);

        assertTrue(classRoom.isSuitable(java));
        assertFalse(classRoom.isSuitable(python));
    }
}