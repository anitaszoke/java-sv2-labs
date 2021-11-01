package primitivetypes.exam;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private int zipcode;
    private double ratingAverage;

    public Person(String name, LocalDate dateOfBirth, int zipcode, double ratingAverage) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.zipcode = zipcode;
        this.ratingAverage = ratingAverage;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getZipcode() {
        return zipcode;
    }

    public double getRatingAverage() {
        return ratingAverage;
    }
    @Override
    public String toString() {
        return name + " " + dateOfBirth + " " + zipcode + " " + ratingAverage;
    }


}
