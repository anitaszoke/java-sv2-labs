package introexceptionmoreexceptions;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Neve: " + name + ", életkor: " + age;
    }

    public static void main(String[] args) {
        Person person = new Person(null, 32);
        System.out.println(person.toString());
        System.out.println(person.name);
        //System.out.println(person.name.toLowerCase());

        System.out.println("NullPointerException -> null értéken metódus hívás");
    }
}
