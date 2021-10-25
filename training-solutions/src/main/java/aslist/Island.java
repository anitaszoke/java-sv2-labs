package aslist;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Island {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Island island = new Island ();
        List<String> importantThings = Arrays.asList("túlélő könyv", "kés", "gyufa");

        System.out.println(importantThings);

        importantThings.set(2,"tűz");

        System.out.println(importantThings);

    }
}
