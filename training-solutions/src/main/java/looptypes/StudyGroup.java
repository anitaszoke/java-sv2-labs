package looptypes;

import java.util.Arrays;
import java.util.List;

public class StudyGroup {

    public void printStudyGroups(List<String> students) {
        for (String item : students) {
            if (item.length() <= 10) {
                System.out.println("1-es csoport: " + item);
            } else {
                System.out.println("2-es csoport: " + item);

            }
        }
    }

    public static void main(String[] args) {
        List<String> students = Arrays.asList("Cserepes Virág", "Kukor Ica", "Harry Potter", "Alma Málna", "Kis Peti");
        StudyGroup studyGroup = new StudyGroup();
        studyGroup.printStudyGroups(students);


    }
}
