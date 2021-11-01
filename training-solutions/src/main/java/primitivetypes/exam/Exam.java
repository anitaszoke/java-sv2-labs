package primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    List<Person> personAdded = new ArrayList<>();

    public List<Person> getPersonAdded() {
        return personAdded;
    }

    public void addPerson(Person person) {
        personAdded.add(person);
    }
}
