package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsElements {
    public static void main(String[] args) {
        //forrás: elemek megadása
        Stream.of("John", "Jack")

                //záró művelet - minden elemre függvény - itt konzolra kiírás
                .forEach(s -> System.out.println(s));


        //forrás: elemek megadása
        Stream.of("Hello ", "lambda")

                //záró művelet - LAMBDA
                //System.out-nak a println metódusát minden elemre
                .forEach(System.out::print);

        //forrás: elemek generálása - math osztály random metódásának hívásával

//        Stream.generate(Math::random)//
//                //végtelen ciklust generál
//                .forEach(System.out::println);

        Stream.generate(Math::random)
                //kell egy limit adás
                .limit(10)
                .forEach(System.out::println);

        //forrás: elemek kiszámolásával - megadjuk az első elemet, majd azt hogy hogyan számolja ki a többit
//        Stream.iterate(1, n-> n+2)
//                //végtelen ciklust generál
//                .forEach(System.out::println);

        Stream.iterate(1, n -> n + 2)
                //kell egy limit adás
                .limit(10)
                .forEach(System.out::println);

        //forrás: kollekció alapján, leggyakrabban használt, lista létrehozás, erre hívni a streamet
        List<String> names = Arrays.asList("John", "Jack");
        names.stream()
                .forEach(System.out::println);

//--------------------------------------------------------------
        //Integer mert primitív típus nem lehet, konvertálni kell //később
        List<Integer> numbers = Arrays.asList(5, 8, 2, 3, 10, 8, 15, 1, 18);

        //küzbülső:
        long count = numbers.stream()
                //Integer-ből int típusá konvertál - hívható rá a .min és .max lezáró művelet - Optional int
                .mapToInt(i -> i)

                //azok az elemek jutnak tovább ha kisebbek 10-nél
                .filter(n -> n < 10)

                //megszünteti a duplikációkat
                .distinct()

                //minden elemmel végez vmilyen transzformációt - minden elemhez +10
                .map(n -> n + 10)

                //sorrendbe teszi az elemeket
                .sorted()

                //lezáró: elemek számát adja vissza - long értéket ad vissza
                .count();

        System.out.println(count);
        System.out.println();

        //közbülső: peek debug - futószalagon történő dolgok nyomonkövetése

        List<Integer> numberList = Arrays.asList(5, 8, 2, 3, 10, 8, 15, 1, 18);


        long countNumber = numberList.stream()
                //.peek(System.out::println)

                .filter(n -> n < 10)
                //.peek(System.out::println)

                .distinct()
                //.peek(System.out::println)

                .map(n -> n + 10)
                //.peek(System.out::println)

                .sorted()
                //.peek(System.out::println)

                .count();

        //System.out.println(countNumber);


    }
}
