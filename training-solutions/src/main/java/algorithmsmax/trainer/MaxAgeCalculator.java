package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {

    public Trainer getTrainerWithMaxAge(List<Trainer> trainers) {
        Trainer trainerWithMaxAge = null;
        for (Trainer t : trainers) {
            if (trainerWithMaxAge == null || t.getAge() > trainerWithMaxAge.getAge()) {
                trainerWithMaxAge = t;
            }
        }
        return trainerWithMaxAge;
    }
}