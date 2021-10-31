package references.parameters;

public class ReferencesName {
    public static void main(String[] args) {
        Person person = new Person("Csaba", 42);
        Person personTwo = person;
        personTwo.setName("Sanyi");

        System.out.println(person.getName() + " " + person.getAge());
        System.out.println(personTwo.getName() + " " + personTwo.getAge());

        int numberOne = 24;
        int numberTwo = numberOne;
        numberTwo = numberTwo + 2;

        System.out.println(numberOne +" " +numberTwo);

        personTwo = new Person("Béla", 24);
        System.out.println(person.getName()+ " " + person.getAge());
        System.out.println(personTwo.getName()+ " " + personTwo.getAge());






    }
}
