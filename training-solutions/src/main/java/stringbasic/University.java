package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public boolean areEquel(Student student,Student anotherStudent) {
        if ((student.getNeptun().equals(anotherStudent.getNeptun())) && (student.getSchoolID().equals(anotherStudent.getSchoolID()))) {
            return true;
        } else {
            return false;
        }
    }
}
