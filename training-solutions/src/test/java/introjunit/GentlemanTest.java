package introjunit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GentlemanTest {

    @Test
    public void testName() {
        //Given
        Gentleman gentleman = new Gentleman();
        //When
        String name = gentleman.sayHello("John Doe");
        //Then
        assertThat(name, equalTo("Hello John Doe"));

        assertThat(gentleman.sayHello(null),equalTo("Hello Anonymus"));

    }

}
