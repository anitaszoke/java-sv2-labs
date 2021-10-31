package composition.person;

public class Address {
    private String country;
    private String city;
    private String streetAndNUmber;
    private String zipCode;

    public Address (String country, String city, String streetAndNUmber, String zipCode) {
        this.country = country;
        this.city = city;
        this.streetAndNUmber = streetAndNUmber;
        this.zipCode = zipCode;
    }
    public String getCountry() {
        return country;
    }
    public String getCity() {
        return city;
    }
    public String getStreetAndNUmber() {
        return streetAndNUmber;
    }
    public String getZipCode() {
        return zipCode;
    }

    public void correctData(String country, String city, String streetAndNUmber, String zipCode) {
        this.country = country;
        this.city = city;
        this.streetAndNUmber = streetAndNUmber;
        this.zipCode = zipCode;
    }
    public String addressToString() {
        return getCountry() + " " + getCity() + " " + getStreetAndNUmber() + " " + getZipCode();
    }
}
