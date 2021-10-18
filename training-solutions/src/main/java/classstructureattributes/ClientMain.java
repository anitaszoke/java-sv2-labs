package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        client.name = scanner.nextLine();

        System.out.println("What is your year of birth?");
        client.year = scanner.nextInt();

        System.out.println("What is your address?");
        scanner.nextLine();
        client.address = scanner.nextLine();

        System.out.println("Your name: "+client.name+", year of birth: "+client.year+", your address: "+client.address+".");


    }
}
