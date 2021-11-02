package enumtype.university;

public enum University {
    BME("Budapesti Műszaki Egyetem"), SZTE("Szegedi Tudomány Egyetem"), DE("Debreceni Egyetem");

    private String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
