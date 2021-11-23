package introexceptionthrow;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Validation validation = new Validation();
        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adja meg a nevét: ");
        String name = scanner.nextLine();
        boolean registrationSuccess = true;
        try {
            validation.validateName(name);
        } catch (IllegalArgumentException iae) {
            registrationSuccess = false;
            //validation.registrationSuccess();
            System.out.println(iae.getMessage());
        }
        System.out.println("Kérem adjam meg az életkorát: ");
        String ageString = scanner.nextLine();
        try {
            validation.validateAge(ageString);
        } catch (IllegalArgumentException iae) {
            registrationSuccess = false;
            System.out.println(iae.getMessage());
        }

        if (registrationSuccess) {
            System.out.println("Sikeres regisztráció!");
        } else {
            System.out.println("Sikertelen regisztráció!");
        }
        System.out.println("A regisztrációs adatai: \n"
                + "Név: " + name + "\n" + "Életkor: " + ageString);

    }
}