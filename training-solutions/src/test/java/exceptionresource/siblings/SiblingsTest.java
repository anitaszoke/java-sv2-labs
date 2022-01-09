package exceptionresource.siblings;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class SiblingsTest {

    @Test
    void createSiblings() {
        Siblings siblings = new Siblings();
        String name = "Szabó Emese";

        assertEquals(name, siblings.getFullNames("Szabó", Paths.get("src/test/resources/siblings.txt")).get(0));
    }

    @Test
    void siblingsExceptionTest() {
        Siblings siblings = new Siblings();
        Exception ex = assertThrows(IllegalStateException.class,
                () -> siblings.getFullNames("Szabó", Paths.get("src/test/resources/txt.txt")));

        assertEquals("Can not read file", ex.getMessage());
    }
}