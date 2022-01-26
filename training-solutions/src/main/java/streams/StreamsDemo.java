package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

//    mint egy futószalag
//    fluent interface - metódusok egymás után hívhatóak
//    források :
//        Stream.of("John", "Jack") - elemek megadása
//        Stream.generate(Math::random) - elemek generálása
//        Stream.iterate(1, n -> n + 2) - elemek kiszámolása
//        Arrays.asList("a","b","c").stream() - kollekció alapján
//    közbülső műveletek:
//        filter() - kiszűri az elemeket
//        distinct() - kiszűri az ismétlődéseket
//        map() - átalakítja az elemeket
//        sorted() - rendezi az elemeket

//        Peek:
//              peek() metódussal nyomon követhető
//
//    lezáró műveletek
//        count() - elemek számát számolja
//        min () max() - szélsőértékek
//        forEach() - mindegyik elemre meghív egy fügvényt

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("John Doe", 1970),
                new Employee("Jack Doe", 1988),
                new Employee("Jane Doe", 1998));

//        Adjuk vissza az 1998-nál régebben született alkalmazottak nevét nagybetűkkel
//      foreach loop :
        List<String> names = new ArrayList<>();

        for (Employee e : employees) {
            if (e.getYearOfBirth() < 1990) {
                names.add(e.getName().toUpperCase());
            }
        }

//        streamekkel:
        List <String> namesUpperCase = employees.stream()
                //szűrés azokra, akik születési éve 1990-nél kisebb
                .filter(employee -> employee.getYearOfBirth() < 1990)

                //employee objektumot áttranszformálva, az employee nevét lekérdezve, csak a nevek mennek tovább, nem employee objektumok
                .map(employee -> employee.getName())

                //a neveket átkonvertáljuk nagybetűsre
                .map(name -> name.toUpperCase())

                // lezáró művelet, összegyűjti egy listába a neveket
                .collect(Collectors.toList());

        System.out.println(names);
        System.out.println(namesUpperCase);
    }
}
