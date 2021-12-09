package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void createRoom() {
        Room room = new Room("4/2", 50);

        assertEquals("4/2", room.getLocation());
        assertEquals(50, room.getCapacity());
    }
}