package staticattrmeth.dog;

public class Dog {
    private String name;
    private int age;
    private Enum breed;
    private long codeNumber;

    public Dog(String name, int age, Enum breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Enum getBreed() {
        return breed;
    }

    public long getCodeNumber() {
        return codeNumber;
    }

    public void setCodeNumber(long codeNumber) {
        this.codeNumber = codeNumber;
    }
}
