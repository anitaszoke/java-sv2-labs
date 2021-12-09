package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void createCourse() {
        Course course = new Course(45, Facility.PROJECTOR);

        assertEquals(45, course.getParticipants());
        assertEquals(Facility.PROJECTOR, course.getFacilityNeeded());
    }
}