package algorithmstransformation.family;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyMemberTest {

    @Test
    void createFamilyMember() {
        FamilyMember f = new FamilyMember("Kiss Zoltán", 56);

        assertEquals(56, f.getAge());
        assertEquals("Kiss Zoltán", f.getName());
    }
}