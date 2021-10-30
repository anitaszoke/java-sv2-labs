package intromethods.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Csiga",2020,500_000);

        System.out.println(employee);
        System.out.println(employee.getName());
        System.out.println(employee.getHiringYear());
        System.out.println(employee.getSalary());
        System.out.println(employee.getName()+" új bére: "+employee.raiseSalary(50_000)+" Ft.");

    }
}
