package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SchoolTest {
    School school = new School();
    List<Integer> headcounts = Arrays.asList(28,25,30,32);

    @Test
    void getNumberOfStudentsTest(){
        assertEquals(115,school.getNumberOfStudents(headcounts));
    }
}
