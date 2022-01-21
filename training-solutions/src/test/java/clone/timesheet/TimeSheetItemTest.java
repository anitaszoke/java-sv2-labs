package clone.timesheet;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TimeSheetItemTest {

    TimeSheetItem timeSheetItem = new TimeSheetItem("Alma","Bone",
            LocalDateTime.of(2021,2,2,10,30),LocalDateTime.of(2021,3,3,15,30));

    @Test
    void createTimeSheetItem() {
        assertEquals("Alma",timeSheetItem.getEmployee());
        assertEquals("Bone",timeSheetItem.getProject());
        assertEquals(LocalDateTime.of(2021,2,2,10,30),timeSheetItem.getFrom());
        assertEquals(LocalDateTime.of(2021,3,3,15,30),timeSheetItem.getTo());
    }

    @Test
    void createCopyTimeSheetItem() {
        TimeSheetItem another = timeSheetItem.copyWithDifferentEmployee(timeSheetItem,"Málna");

        assertEquals("Málna",another.getEmployee());
        assertEquals("Alma",timeSheetItem.getEmployee());

        assertEquals("Bone",another.getProject());
        assertEquals(LocalDateTime.of(2021,2,2,10,30),another.getFrom());
        assertEquals(LocalDateTime.of(2021,3,3,15,30),another.getTo());
    }

}