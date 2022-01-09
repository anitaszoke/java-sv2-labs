package exceptionclass.course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void createCourseIntBegin() {
        String name = "Java";
        SimpleTime begin = new SimpleTime(15, 30);
        Course course = new Course(name, begin);

        assertEquals(name, course.getName());
        assertEquals(begin, course.getBegin());
    }

    @Test
    void createCourseStringBegin() {
        String name = "Java";
        SimpleTime begin = new SimpleTime("15:30");
        Course course = new Course(name, begin);

        assertEquals(name, course.getName());
        assertEquals(String.format("%s: %s", begin, name), course.toString());
    }

    @Test
    void nameTestException() {
        String name = null;
        SimpleTime begin = new SimpleTime(15, 30);

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Course(name, begin));
        assertEquals("Name is null!", ex.getMessage());
    }

    @Test
    void beginTestException() {
        String name = "Java";
        SimpleTime begin = null;

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Course(name, begin));
        assertEquals("Begin is null!", ex.getMessage());
    }
}