package polymorphism.demo;

public class Human implements HasName {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}