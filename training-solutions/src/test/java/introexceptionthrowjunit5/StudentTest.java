package introexceptionthrowjunit5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class StudentTest {

    Student student = new Student();

    @Test
    public void addNoteTest() {
        student.addNote(1);
        student.addNote(5);
        student.addNote(3);

        assertEquals(1, student.getNotes().get(0).intValue());
        assertEquals(3, student.getNotes().size());
    }

    @Test
    public void addNoteAssertThrows() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> student.addNote(9));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }
}