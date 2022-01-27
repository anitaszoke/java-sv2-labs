package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine {

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        registrated.stream()
                .filter(person -> person.getPregnant() == (Pregnancy.YES))
                .forEach(person -> vaccinationList.add(person));

        registrated.stream()
                .filter(person -> person.getAge() > 65 && person.getPregnant() == Pregnancy.NO)
                .forEach(person -> vaccinationList.add(person));

        registrated.stream()
                .filter(person -> person.getAge() <= 65 && person.getPregnant() == Pregnancy.NO)
                .forEach(person -> vaccinationList.add(person));
    }
}