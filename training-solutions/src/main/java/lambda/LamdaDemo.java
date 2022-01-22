package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LamdaDemo {

    public static void main(String[] args) {
        new LamdaDemo().useStreams();
    }

    private void useStreams() {
        List<String> names = new ArrayList<>(Arrays.asList("John Doe", "Jack Doe", "Jane Doe"));
//            for each loop
//        for (String name : names) {
//            System.out.println(name);
//        }

//        forEach - Consumer típus
//        for each  - no method name
//        names.forEach((String name) -> {
//            System.out.println(name);
//        });

//        for each  - no type, no {}
//        names.forEach(name -> System.out.println(name));

//        change then put back
//        names.replaceAll((String name) -> {return name.toUpperCase();});
//        System.out.println(names);

//        replaceAll - UnaryOperator kell átadni, egy paraméter típus, ugyanazt a típust adja vissza
//        change then put back - no type, no {}
//        names.replaceAll(name -> name.toUpperCase());
//        System.out.println(names);

//        change then put back - only tpe and method
//        names.replaceAll(String::toUpperCase);
//        System.out.println(names);

//        use OWN method1 - no type, no {}
//        names.replaceAll(name -> toFirstCharacters(name));
//        System.out.println(names);

//        use OWN method2
//        names.replaceAll(this::toFirstCharacters);
//        System.out.println(names);

//        removeIf - Predicate típus - vár valamilyen értéket és egy booleant ad vissza
//        remove true -long
//        names.removeIf((String name) -> {
//            return name.startsWith("Jane");
//        });
//        System.out.println(names);

//        remove true -short
        names.removeIf(name -> name.startsWith("Jane"));
        System.out.println(names);
    }

    //    create your own method
    public String toFirstCharacters(String text) {
        return text.substring(0, 2);

    }
}
