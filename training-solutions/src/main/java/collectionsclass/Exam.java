package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exam {

    private final List<ExamResult> examResultList;

    public Exam(List<ExamResult> examResultList) {
        this.examResultList = examResultList;
    }

    public List<String> getNamesOfSucceededPeople(int places) {
        if (examResultList.size() < places) {
            places = examResultList.size();
        }
        List<ExamResult> results = new ArrayList<>(examResultList);
        results.sort(Comparator.comparingInt(ExamResult::getResult));
        Collections.reverse(results);

        List<String> onlyNames = new ArrayList<>();
        for (ExamResult result : results) {
            if (onlyNames.size() < places) {
                onlyNames.add(result.getName());
            }
        }
        return onlyNames;
    }
}
