package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {

    List<FamilyMember> familyMemberList = new ArrayList<>();

    public Family() {
        this.familyMemberList = familyMemberList;
    }

    public void addFamilyMember(FamilyMember familyMember) {
        familyMemberList.add(familyMember);
    }

    public List<Integer> getAgesOffFamilyMembersWithNameGiven(String name) {
        List<Integer> ages = new ArrayList<>();
        for (FamilyMember f : familyMemberList) {
            if (f.getName().contains(name)) {
                ages.add(f.getAge());
            }
        }
        return ages;
    }
}