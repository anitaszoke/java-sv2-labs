package introjunit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest {

    @Test
    public void testName() {
        //Given
        Gentleman gentleman = new Gentleman();
        //When
        String name = gentleman.sayHello("John Doe");
        //Then
        assertThat(name, equalTo("Hello John Doe!"));

    }

}
