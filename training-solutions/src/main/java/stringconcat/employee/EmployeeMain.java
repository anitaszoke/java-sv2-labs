package stringconcat.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Kis Géza","minőségellenőr",520_000);
        employee.getName();
        employee.getProfession();
        employee.getSalary();

        System.out.println(employee.toString());

        Employee employee2 = new Employee("Kis Gizi","minőségellenőr",520_000);
        System.out.println(employee2.getName());
        System.out.println(employee2.getSalary());
        System.out.println(employee2.getProfession());

        System.out.println(employee2.toString());

    }
}
