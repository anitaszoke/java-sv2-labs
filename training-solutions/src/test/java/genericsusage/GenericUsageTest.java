package genericsusage;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericUsageTest {

    @Test
    void genericsUsageTest() {
//        bármilyen objektumot képes tárolni
        List l = new ArrayList();
        l.add("John Doe");
        l.add("Jane Doe");
// a visszatérési érték ebben az esetben object típusú,
// így objectként kell változót deklarálni
        Object object = l.get(0);
        System.out.println(object);
// ha ezt használni szeretném és tudom, hogy string van benne, akkor castolni (típuskényszeríteni) kell
// ebben az esetben már String típusú változót is használhatok

        String s = (String) l.get(0);
        System.out.println(s);

//ha a már Stringeket tartalmazó listához adok egy int típusú változót,akkor lefordul, de ClassCastException-t dob
//       l.add(10);
//<> meg van adva, hogy <String> akkor már fordítás közben ellenőrzés van, tehát le sem fordul


        List<String> l2 = new ArrayList<>();
//nem fordul le, nem leszármazottja az egyik a másiknak, más a típus paramétere, a szülő gyermek viszony nem hat vissza magára a listára
        //List<Object> l3 = l2;

//lefordul, csak akkor működik a polimorfizmus, ha a típus az, aminél az egyik leszármazottja a másiknak
        Collection<String> l3 = l2;
    }
}