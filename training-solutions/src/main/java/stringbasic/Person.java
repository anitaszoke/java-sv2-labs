package stringbasic;

public class Person {
    private String name;
    private String email;
    private String TajNumber;
    private String bankNumber;
    private String phoneNUmber;

    public Person(String name, String email, String tajNumber, String bankNumber, String phoneNUmber) {
        this.name = name;
        this.email = email;
        TajNumber = tajNumber;
        this.bankNumber = bankNumber;
        this.phoneNUmber = phoneNUmber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTajNumber() {
        return TajNumber;
    }

    public void setTajNumber(String tajNumber) {
        TajNumber = tajNumber;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getPhoneNUmber() {
        return phoneNUmber;
    }

    public void setPhoneNUmber(String phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
    }
}
