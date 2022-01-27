package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine{

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {

        registrated.stream()
                .filter(p -> p.getPregnant().equals(Pregnancy.NO))
                .filter(p -> p.getChronic().equals(ChronicDisease.NO))
                .filter(person -> person.getAge() <=65)
                .forEach(p -> vaccinationList.add(p));

        registrated.stream()
                .filter(p -> p.getPregnant().equals(Pregnancy.NO))
                .filter(p -> p.getChronic().equals(ChronicDisease.NO))
                .filter(person -> person.getAge() > 65)
                .forEach(p -> vaccinationList.add(p));
    }
}