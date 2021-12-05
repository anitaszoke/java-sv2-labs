package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedWordTest {

    @Test
    void modify3Test() {
        assertEquals("AxMy", new ModifiedWord().modify3("alma"));
    }

    @Test
    void modify1Test() {
        assertEquals("AxMy", new ModifiedWord().modify("alma"));
    }

    @Test
    void modify2Test() {
        assertNotEquals("AxMy", new ModifiedWord().modify2("alma"));
    }
}