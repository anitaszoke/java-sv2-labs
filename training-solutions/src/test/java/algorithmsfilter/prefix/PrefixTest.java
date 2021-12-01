package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {

    @Test
    void getWordsStartWithTest() {
        Prefix prefix = new Prefix();
        List<String> words = Arrays.asList("kelkáposzta", "kelbimbó", "paprika");
        String prefix1 = "kel";
        String prefix2 = "pa";
        String prefix3 = "ha";

        assertEquals(1, prefix.getWordsStartWith(words, prefix2).size());
        assertEquals(2, prefix.getWordsStartWith(words, prefix1).size());
        assertEquals(0, prefix.getWordsStartWith(words, prefix3).size());
    }

}