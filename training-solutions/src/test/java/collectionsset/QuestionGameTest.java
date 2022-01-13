package collectionsset;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class QuestionGameTest {

    QuestionGame questionGame;
    List<RightAnswer> rightAnswers = new LinkedList<>();

    @BeforeEach
    void init() {
        rightAnswers.add(new RightAnswer("Elek"));
        rightAnswers.add(new RightAnswer("Elek"));
        rightAnswers.add(new RightAnswer("Elek"));
        rightAnswers.add(new RightAnswer("Elek"));
        rightAnswers.add(new RightAnswer("Elek"));
        rightAnswers.add(new RightAnswer("Elek"));
        rightAnswers.add(new RightAnswer("Etelka"));
        rightAnswers.add(new RightAnswer("Elek"));
        rightAnswers.add(new RightAnswer("Teréz"));
        rightAnswers.add(new RightAnswer("Mária"));

        questionGame = new QuestionGame(rightAnswers);
    }

    @Test
    void drawWinnersNotEnoughException() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> questionGame.drawWinners());

        assertEquals("Not enough right answers!", ex.getMessage());
    }

    @Test
    void drawWinners() {
        rightAnswers.add(new RightAnswer("Álmos"));
        rightAnswers.add(new RightAnswer("Ákos"));

        Set<String> winners = questionGame.drawWinners();

        assertEquals(5, winners.size());
    }
}