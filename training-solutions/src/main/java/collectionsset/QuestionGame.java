package collectionsset;

import java.util.*;

public class QuestionGame {
    private List<RightAnswer> rightAnswers;

    public QuestionGame(List<RightAnswer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public Set<String> drawWinners() {
        Set<String> winnersName = new HashSet<>();
        Random random = new Random();

        while (winnersName.size() != 5) {
            if (rightAnswers.size() == 0) {
                throw new IllegalArgumentException("Not enough right answers!");
            }
            int index = random.nextInt(rightAnswers.size());
            winnersName.add(rightAnswers.get(index).getName());
            rightAnswers.remove(index);
        }

        return winnersName;
    }
}
