package introdate;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee(2020, 10, 21, "Alma Málna");
        System.out.println(employee.getName());
        System.out.println(employee.getDateOfBirth());
        System.out.println(employee.getBeginEmployment());


    }
}
