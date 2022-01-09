package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {
    private int amount;

    public Aid(int amount) {
        this.amount = amount;
    }

    public List<String> countAmountsOfAid(Path path) {
        List<String> amountOfAidPeople = new ArrayList<>();

        try {
            List<String> cityAndPeople = Files.readAllLines(path);
            for (String s : cityAndPeople) {
                String[] temp = s.split(" ");
                int people = Integer.parseInt(temp[1]);
                String city = temp[0];
                int personAmount = amount / people;
                amountOfAidPeople.add(city + " " + personAmount);
            }
        } catch (IOException | NullPointerException | IndexOutOfBoundsException | NumberFormatException | ArithmeticException ex) {
            throw new IllegalStateException("Something went wrong while counting.", ex);
        }
        return amountOfAidPeople;
    }
}
