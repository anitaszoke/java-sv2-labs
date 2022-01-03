package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String name;
    private final List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        checkingName(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void grading(Mark mark) {
        checkingMark(mark);
        marks.add(mark);
    }

    @Override
    public String toString() {
        String nameAndMark = "";
        for (Mark m : marks) {
            nameAndMark = name + " marks: " + m.getSubject().getSubjectName() + ": " + m;
        }
        return nameAndMark;
    }

    public double calculateAverage() {
        double sum = 0.0;
        double average;

        if (marks.size() == 0) {
            return sum;
        } else {
            for (Mark m : marks) {
                sum += m.getMarkType().getNumber();
            }
            average = sum / marks.size();
        }

        return createTwoDecimalDouble(average);
    }

    public double calculateSubjectAverage(Subject subject) {
        double sum = 0.0;
        double count = 0.0;
        double result = 0.0;

        for (Mark m : marks) {
            if (m.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                count++;
                sum += m.getMarkType().getNumber();
            }
            result = sum / count;
        }

        return createTwoDecimalDouble(result);
    }

    private void checkingName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
    }

    private void checkingMark(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
    }

    private double createTwoDecimalDouble(double average) {
//        String stringS = String.valueOf(result).substring(0, 4);
//        stringS.replace(",", ".").formatted("%.2f");
        double result = (double) Math.round(average * 100d) / 100d;

        return result;
    }

//    private boolean checkingSubject(Subject subject) {
//        for (Mark m : marks) {
//            if (!m.getSubject().getSubjectName().equals(subject.getSubjectName())) {
//                return false;
//            }
//        }
//        return true;
//    }
}