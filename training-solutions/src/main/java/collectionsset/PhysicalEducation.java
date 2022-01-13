package collectionsset;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {
    private List<Student> students;

    public Set<Integer> getOrderInLessons(List<Student> students) {
        Set<Integer> heights = new TreeSet<>();
        for (Student s : students) {
            heights.add(s.getHeight());

        }
        return heights;
    }

    public static void main(String[] args) {
        PhysicalEducation physicalEducation = new PhysicalEducation();
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kata", 120));
        students.add(new Student("Sára", 110));
        students.add(new Student("Feri", 130));
        System.out.println(physicalEducation.getOrderInLessons(students));
    }
}
