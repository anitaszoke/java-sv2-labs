package stringbasic;

public class Student {
    private Person person;
    private String neptun;
    private String schoolID;
    private String cardNumber;

    public Student(Person person, String neptun, String schoolID) {
        this.person = person;
        this.neptun = neptun;
        this.schoolID = schoolID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptun() {
        return neptun;
    }

    public void setNeptun(String neptun) {
        this.neptun = neptun;
    }

    public String getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(String schoolID) {
        this.schoolID = schoolID;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
