package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {
    @Test
    public void testName() {
        Gentleman gentleman = new Gentleman();
        String helloString = gentleman.sayHello("John Doe");
        assertEquals("Hello John Doe", helloString);
        assertEquals(gentleman.sayHello(null),("Hello Anonymus"));
        //assertThat(gentleman.sayHello(null),equalTo("Hello Anonymus"));

    }
}
