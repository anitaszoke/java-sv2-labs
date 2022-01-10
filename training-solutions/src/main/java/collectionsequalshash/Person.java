package collectionsequalshash;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private final String TAJ;

    public Person(String name, int age, String TAJ) {
        this.name = name;
        this.age = age;
        this.TAJ = TAJ;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTAJ() {
        return TAJ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(this.TAJ, person.TAJ);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TAJ);
    }

    public static void main(String[] args) {
        Person harry = new Person("Harry",12,"abcd");
        Person ron = new Person("Ron",13,"abcd");

        System.out.println(harry.equals(ron));
        System.out.println(harry.hashCode());
        System.out.println(ron.hashCode());

        System.out.println(harry.getTAJ().equals(ron.getTAJ()));
    }
}

