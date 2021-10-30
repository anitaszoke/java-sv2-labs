package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {

    public String fullName(String lastName,String firstName) {
        return lastName + " " + firstName;
    }

    public LocalDate fullDateOfBirth(int year, int month, int day){
        return LocalDate.of(year,month,day);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Registration registration = new Registration();



        System.out.println("Kérem adja meg a vezetéknevét!");
        String lastName = scanner.nextLine();
        System.out.println("Kérem adja meg a keresztnevét!");
        String firstName = scanner.nextLine();



        System.out.println("Kérem adja meg a születési évét!");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem adja meg a születési hónapját!");
        int month = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem adja meg a születési napját!");
        int day = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem adja meg az email címét!");
        String email = scanner.nextLine();

        String name = registration.fullName(lastName,firstName);
        LocalDate dateOfBirth = registration.fullDateOfBirth(year,month,day);

        Person newPerson = new Person(name, dateOfBirth, email);
        System.out.println(newPerson);

    }
}
