package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void setGetName() {
        Human human = new Human();
        String name = "Zonga";
        human.setName(name);

        assertEquals(name, human.getName());
    }

    @Test
    void setGetWeight() {
        Human human = new Human();
        double weight = 65.5;
        human.setWeight(weight);

        assertEquals(weight, human.getWeight());
    }

    @Test
    void setGetIq() {
        Human human = new Human();
        int iq = 130;
        human.setIq(iq);

        assertEquals(iq, human.getIq());
    }
}