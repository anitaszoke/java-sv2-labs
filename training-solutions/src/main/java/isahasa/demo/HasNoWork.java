package isahasa.demo;

public class HasNoWork implements Work {

//   ha új típust szeretnénk bevezetni, akkor így egyszerűbb,
//    hiszen csak deklarálni kell egy új osztályt, a Work-ot kell implementálni
    @Override
    public String complete() {
        return "";
    }
}
