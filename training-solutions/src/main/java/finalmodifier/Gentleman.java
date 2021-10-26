package finalmodifier;

import java.util.*;

public class Gentleman {

    public static final String MESSAGE_PREFIX = "Hello ";

    public String sayHello(String name) {
        return MESSAGE_PREFIX + name;
    }

    public static void main(String[] args) {
        Gentleman gentleman = new Gentleman();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println(gentleman.sayHello(name));

        }

}
