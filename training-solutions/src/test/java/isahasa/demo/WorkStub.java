package isahasa.demo;

public class WorkStub implements Work {
//    létrehoztunk kizárólag a teszteléshez egy test double-t, preparált osztály
//    stub

    private boolean called;

    @Override
    public String complete() {
        called = true;
        return null;
    }

    public boolean isCalled() {
        return called;
    }
}
