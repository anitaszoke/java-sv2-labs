package streams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("John Doe", 1970),
                new Employee("Jack Doe", 1988),
                new Employee("Jane Doe", 1998));

        //Összegezd az alkalmazottak születési éveit!

        int sumBirthYears = employees.stream()
                .mapToInt(Employee::getYearOfBirth)
                .sum();
        System.out.println(sumBirthYears);


//      Összegezd az alkalmazottak életkorát!
        int dateNow = LocalDate.now().getYear();

        int sumAges = employees.stream()
                .mapToInt(Employee::getYearOfBirth)
                .map(n -> dateNow - n)
                .sum();
        System.out.println(sumAges);


//      Add vissza streammel, hány alkalmazott van a listában!
        long countEmployee = employees.stream()
                .count();
        System.out.println(countEmployee);


//      Add vissza, hány alkalmazott született 1990-nél korábban!
        long employeeBirthBefore = employees.stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .count();
        System.out.println(employeeBirthBefore);


//      Add vissza a legkorábban született alkalmazott születési évét!
        int oldestEmployee = employees.stream()
                .map(Employee::getYearOfBirth)
                .sorted()
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Empty"));
        System.out.println(oldestEmployee);


//      Add vissza a legkorábban született alkalmazott nevét! (Itt szükség lesz a findFirst() záróműveletre.)
        String oldestEmployeeName = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getYearOfBirth))
                .map(Employee::getName)
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Empty"));
        System.out.println(oldestEmployeeName);


//      Add vissza, hogy igaz-e, hogy minden alkalmazott 1980 előtt született-e?
        boolean birthBefore = employees.stream()
                .allMatch(employee -> employee.getYearOfBirth() < 1980);

        System.out.println(birthBefore);


//      Add vissza egy listában az összes, 1990-nél korábban született alkalmazottat!
        List<Employee> employeesBirthBefore = employees.stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .collect(Collectors.toList());
        System.out.println(employeesBirthBefore);


//      Add vissza egy listában az összes alkalmazott nevét!
        List<String> employeesNames = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(employeesNames);

//      Az előző két feladat kombinációja: Add vissza egy listában az összes, 1990-nél korábban született alkalmazott nevét!
        List<String> employeesNameBirthBefore = employees.stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(employeesNameBirthBefore);
    }
}