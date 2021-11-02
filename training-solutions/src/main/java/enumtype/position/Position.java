package enumtype.position;

public enum Position {
    MANAGING_DIRECTOR(4_000_000, "bonus, car, phone, laptop"), MANAGER(1_000_000, "bonus, car, phone, laptop"), TECHNICAL_MANAGER(600_000, "bonus, car, phone"), MACHINE_OPERATOR(350_000,"bonus"),
    ;

    private int salary;
    private String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
