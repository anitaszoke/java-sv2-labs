package methodoverloading.classfive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {

    ClassFiveA classFiveA = new ClassFiveA();

    @Test
    void getTodayReferringStudent() {
        assertEquals("Szabó Petra", classFiveA.getTodayReferringStudent(1));
    }

    @Test
    void testGetTodayReferringStudent() {
        assertEquals("Szabó Petra", classFiveA.getTodayReferringStudent(Number.ONE));
    }

    @Test
    void testGetTodayReferringStudent1() {
        assertEquals("Szabó Petra", classFiveA.getTodayReferringStudent("one"));
    }
}