package statemachine.typewriter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeWriterStateTest {

    @Test
    void typeWriterStateTest() {
        assertEquals(TypeWriterState.LOWER,TypeWriterState.UPPER.next());
        assertEquals(TypeWriterState.UPPER,TypeWriterState.LOWER.next());
    }

}