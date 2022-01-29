package virtualmethod.demo;

public class Human implements HasName {

    private String name;
    private static final int DEFAULT_FREE_TIME = 4;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getDefaultFreeTime() {
        return DEFAULT_FREE_TIME;
    }
}