package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Géza");
        Student student2 = new Student("Kati");
        Student student3 = new Student("Szabi");
        Student student4 = new Student("Viki");
        Student student5 = new Student("Béla");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println(students.size());

        student1.setActive(false);
        student2.setActive(false);

        List<Student> removeStudent = new ArrayList<>();
        for (Student item : students) {
            if (!item.isActive()) {
                removeStudent.add(item);
            }
        }
        students.removeAll(removeStudent);
        System.out.println(students.size());
    }
}

