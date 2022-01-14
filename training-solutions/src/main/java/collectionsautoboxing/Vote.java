package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {

    private Map<VoteResult, Integer> resultIntegerMap = new HashMap<>();

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> votes) {
        int countYes = 0;
        int countNo = 0;
        int countAbstain = 0;

        for (VoteResult v : votes.values()) {
            if (v.equals(VoteResult.YES)) {
                countYes++;
            } else if (v.equals(VoteResult.NO)) {
                countNo++;
            } else if (v.equals(VoteResult.ABSTAIN)) {
                countAbstain++;
            } else {
                throw new IllegalArgumentException("Wrong votes");
            }
        }

        resultIntegerMap.put(VoteResult.YES, countYes);
        resultIntegerMap.put(VoteResult.NO, countNo);
        resultIntegerMap.put(VoteResult.ABSTAIN, countAbstain);

        return resultIntegerMap;
    }
}
