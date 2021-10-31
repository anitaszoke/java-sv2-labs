package composition.person;

public class PersonMain {
    public static void main(String[] args) {

        PersonMain personMain = new PersonMain();

        Person personOne = new Person("Harry Potter", "12346YX");
        Address addressOne = new Address("England", "Little Whinging", "Privet Drive 4", "965482");

        System.out.println(personOne.personToString());
        personOne.moveTo(addressOne);
        System.out.println(personOne.getAddress().addressToString());

        personOne.correctData("Harry Potter","wizard01");
        personOne.getAddress().correctData("Hogwarts","School of","Witchcraft and","Wizardry");

        System.out.println(personOne.personToString());
        System.out.println(personOne.getAddress().addressToString());
    }
}
