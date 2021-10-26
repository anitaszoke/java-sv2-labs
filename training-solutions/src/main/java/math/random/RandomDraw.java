package math.random;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {


    List<String> names = new ArrayList(Arrays.asList("Pali","Sanyi","Béla","Géza","Peti","Kati","Niki","Viki","Sári","Ica"));

    Random rnd= new Random();
    int randomWin1 = rnd.nextInt(0, 5);
    int randomWin2 = rnd.nextInt(5, 10);

    System.out.println("Férfi nyereménycsomag nyertese: "+names.get(randomWin1));
    System.out.println("Női nyereménycsomag nyertese: "+names.get(randomWin2));


    }






}
