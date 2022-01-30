package exceptions.demo;

import java.util.Scanner;

public class NumbersReader {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(NumbersReader.class.getResourceAsStream("numbers.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                int number = Integer.parseInt(line);
                System.out.println(number);
            }

        } catch (NumberFormatException nfe) {
//            System.out.println("Invalid number");
            throw new IllegalStateException("Invalid number", nfe);

        } catch (NullPointerException e) {
//            System.out.println("File not found");
            throw e;
        }
    }
}