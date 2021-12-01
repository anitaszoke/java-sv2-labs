package algorithmstransformation.family;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {
    Family family;

    @BeforeEach
    void setUp() {
        family = new Family();
        family.addFamilyMember(new FamilyMember("Kovács Kati", 39));
        family.addFamilyMember(new FamilyMember("Szabó Kati", 49));
        family.addFamilyMember(new FamilyMember("Kovács Ágnes", 39));
        family.addFamilyMember(new FamilyMember("Hajdú Hedvig", 39));
    }

    @Test
    void getAgesOffFamilyMembesWithNameGivenTest() {
        List<Integer> familyAges = family.getAgesOffFamilyMembersWithNameGiven("Kati");
        assertEquals(2, familyAges.size());
        assertTrue(familyAges.contains(39));
    }


}