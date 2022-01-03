package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random random;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        this.className = className;
        this.random = random;
    }

    public String getClassName() {
        return className;
    }

    public boolean addStudent(Student student) {
        boolean notOnTheList = isStudentNotOnTheList(student);

        if (notOnTheList) {
            students.add(student);
        }
        return notOnTheList;
    }

    public boolean removeStudent(Student student) {
        boolean onTheList = isStudentOnTheList(student);

        if (onTheList) {
            students.remove(student);
        }
        return onTheList;
    }

    public double calculateClassAverage() {
        checkingStudentSizeArithmetic();
        checkingCalculateAverage();

        double sum = 0.0;
        double count = 0.0;
        double average;

        for (Student s : students) {
            count++;
            sum = sum + s.calculateAverage();
        }

        average = sum / count;

        return createTwoDecimal(average);
    }

    public double calculateClassAverageBySubject(Subject subject) {
        double sum = 0.0;
        double count = 0.0;
        double average;

        for (Student s : students) {
            if (s.calculateSubjectAverage(subject) > 0.0) {
                count++;
                sum = sum + s.calculateSubjectAverage(subject);
            }
        }
        average = sum / count;

        return createTwoDecimal(average);
    }

    public Student findStudentByName(String name) {
        checkingStudentSizeIllegal("No students to search!");
        checkingStudentName(name);


        Student studentName = null;
        for (Student s : students) {
            if (s.getName().equals(name)) {
                studentName = s;
            }
        }
        checkingStudentNameOnTheList(studentName, name);

        return studentName;
    }

    public Student repetition() {
        checkingStudentSizeIllegal("No students to select for repetition!");
//        Random random = new Random();
//        return students.get(random.nextInt(students.size()));

        int randomIndex = random.nextInt(0, students.size());
        return students.get(randomIndex);
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> nameWithResults = new ArrayList<>();

        for (Student student : students) {
            nameWithResults.add(new StudyResultByName(student.getName(), student.calculateAverage()));
        }
        return nameWithResults;
    }

    public String listStudentNames() {
        List<String> nameList = new ArrayList<>();
        StringBuilder studentsNames = new StringBuilder();

        for (Student s : students) {
            nameList.add(s.getName());
        }

        for (String n : nameList) {
            studentsNames.append(n).append(", ");
        }
        return studentsNames.substring(0, studentsNames.length() - 2);

    }

    private void checkingStudentName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
    }

    private void checkingStudentNameOnTheList(Student studentName, String name) {
        if (studentName == null) {
            throw new IllegalArgumentException("Student by this name cannot be found! " + name);
        }
    }

    private void checkingStudentSizeArithmetic() {
        if (students.size() == 0) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
    }

    private void checkingStudentSizeIllegal(String text) {
        if (students.size() == 0) {
            throw new IllegalStateException(text);
        }
    }

    private void checkingCalculateAverage() {
        for (Student s : students) {
            if (s.calculateAverage() == 0.0) {
                throw new ArithmeticException("No marks present, average calculation aborted!");
            }
        }
    }

    private double createTwoDecimal(double average) {
        double result = (double) Math.round(average * 100d) / 100d;

        return result;
    }

    private boolean isStudentNotOnTheList(Student student) {
        for (Student s : students) {
            if (s.getName().equals(student.getName())) {
                return false;
            }
        }
        return true;
    }

    private boolean isStudentOnTheList(Student student) {
        for (Student s : students) {
            if (s.getName().equals(student.getName())) {
                return true;
            }
        }
        return false;
    }
}