package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your email?");
        String email = scanner.nextLine();

        System.out.println("Your registration name: " + name + ", your registration email: " + email);
    }
}