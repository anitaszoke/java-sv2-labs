package optional;

import java.util.Optional;

public class OptionalDemo {

    // optional - doboz, aminek érték adható, de lehet üres is, értéket ellenőrizhetünk, kivételt dobhatunk
    // létrehozás  - Optional.empty() - .of()
    //metódusok - isPresent(), orElse(), orElseThrow()

    public static void main(String[] args) {
//       optional.empty() -  üres példány létrehozása
        Optional<String> unknown = Optional.empty();
        System.out.println(unknown);

//       optional.of() -  értéket tartalmazó példány létrehozása
        Optional<String> john = Optional.of("John");
        System.out.println(john);

//       isPresent() - érték lekérdezése mindig vizsgálattal,
//       érték kérdezése .get()
        if (john.isPresent()) {
            System.out.println(john.get());
        }
//        isPresent() - shorter
        john.ifPresent(System.out::println);
//        isPresent() - ha nincs érték akkor false
//        ha nincs vizsgálat akkor kivételt dob - .NoSuchElementException
//        unknown.get();

//       orElse() - üres változónál, az új értéket veszi fel, egyébként változatlan
        String name = unknown.orElse("Jack");
        System.out.println(name);

//        orElseThrow() -üres -> kivételt dob
        String throwName = unknown.orElseThrow(() -> new IllegalArgumentException("unknow"));


    }
}
