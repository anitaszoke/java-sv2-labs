package interfaceextends.demo;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    void createTest() {
        HasName hasName = new Trainer("John Doe", 30);
        HasNameAndAge hasNameAndAge = new Trainer("John Doe", 30);
    }

}