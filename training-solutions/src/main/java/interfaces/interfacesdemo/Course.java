package interfaces.interfacesdemo;

public class Course implements HasName {

    private String name;

    @Override
    public String getName() {
        return name;
    }
}
