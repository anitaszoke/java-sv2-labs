package stringscanner;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy több tagmondatból álló mondatot!");
        String sentence1 = scanner.nextLine();
        System.out.println("Kérem adjon meg újra egy több tagmondatból álló mondatot!");
        String sentence2 = scanner.nextLine();

        Scanner scanner1 = new Scanner(sentence1);

        while (scanner1.hasNext()) {
            System.out.println(scanner1.next());
        }
        System.out.println();
        Scanner scanner2 = new Scanner(sentence2);

        while (scanner2.hasNext()) {
            System.out.println(scanner2.next());
        }

    }
}

