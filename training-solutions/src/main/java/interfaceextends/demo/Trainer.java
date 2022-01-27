package interfaceextends.demo;

public class Trainer implements HasNameAndAge {
    //mivel a HasNameAndAge-nek két őse van,mind a két ősnek a metódusát implementálni kell

    private String name;
    private int age;

    public Trainer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}