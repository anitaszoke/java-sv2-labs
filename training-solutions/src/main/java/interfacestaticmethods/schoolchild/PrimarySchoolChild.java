package interfacestaticmethods.schoolchild;

public interface PrimarySchoolChild {

    static PrimarySchoolChild of(int age) {
        if (age < 6 || age > 14) {
            throw new IllegalArgumentException("Age must be between 6 and 14!");
        }
        if (age >= 6 && age <= 10) {
            return new LowerClassSchoolChild(age);
        } else {
            return new UpperClassSchoolChild(age);
        }
    }
}
