package collectionsclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExamTest {

    Exam exam;

    @BeforeEach
    void init() {
        List<ExamResult> results = new ArrayList<>();
        results.add(new ExamResult("Kata",6));
        results.add(new ExamResult("Pál",8));
        results.add(new ExamResult("Mária",1));
        results.add(new ExamResult("Bence",9));
        results.add(new ExamResult("Feri",10));
        exam = new Exam(results);
    }

    @Test
    void getNamesTest() {
        List<String> expectedNames = exam.getNamesOfSucceededPeople(2);

        assertEquals(2,expectedNames.size());
    }
}