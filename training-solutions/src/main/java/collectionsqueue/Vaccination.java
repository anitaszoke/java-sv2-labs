package collectionsqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {
    private List<Person> people;

    Queue<Integer> getVaccinationOrder(List<Person> people) {
        PriorityQueue<Integer> ages = new PriorityQueue<>();

        for (Person p : people) {
            if (p.getAge() >= 18 && p.getAge() <= 65) {
                ages.add(p.getAge());
            }
        }
        return ages;
    }

    public static void main(String[] args) {
        Vaccination v = new Vaccination();
        List<Person> people = new ArrayList<>();
        people.add(new Person("Erzsi", 17));
        people.add(new Person("Barna", 25));
        people.add(new Person("Kata", 18));
        people.add(new Person("Erzsi", 17));
        people.add(new Person("Sára", 65));
        people.add(new Person("Frici", 66));
        people.add(new Person("Kázmér", 50));
        people.add(new Person("Barna", 25));

        System.out.println(v.getVaccinationOrder(people));
        System.out.println();

        System.out.println(v.getVaccinationOrder(people).poll());
        System.out.println(v.getVaccinationOrder(people).peek());

        Integer agesPoll;
        agesPoll = v.getVaccinationOrder(people).poll();
        System.out.println(agesPoll);
    }
}