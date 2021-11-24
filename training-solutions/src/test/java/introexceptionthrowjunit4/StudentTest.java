package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class StudentTest {
    private Student student = new Student();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void addNoteTest() {
        student.addNote(1);
        student.addNote(5);
        student.addNote(4);

        assertEquals(1, student.getNotes().get(0).intValue());
        assertEquals(3, student.getNotes().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void AddNoteException() {
        student.addNote(9);
    }

    @Test
    public void addNoteExpectedException() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Note must be between 1 and 5!");
        student.addNote(9);
    }

    @Test
    public void AddNoteAssertThrows() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> student.addNote(9));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }
}
