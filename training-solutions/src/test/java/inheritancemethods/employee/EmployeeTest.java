package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void createEmployeeTest() {
        Employee employee = new Employee("Hum Bug", "Humbugfalva", 1000);

        assertEquals("Hum Bug", employee.getName());
        assertEquals("Humbugfalva", employee.getAddress());
        assertEquals(1000, employee.getSalary());
    }

    @Test
    void raiseSalaryTest() {
        Employee employee = new Employee("Hum Bug", "Humbugfalva", 1000);

        assertEquals(1100, employee.raiseSalary(10));
    }
}