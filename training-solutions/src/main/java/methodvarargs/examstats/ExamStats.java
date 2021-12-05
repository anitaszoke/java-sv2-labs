package methodvarargs.examstats;

public class ExamStats {

    private double maxPoints;

    public ExamStats(double maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        if (results.length == 0 || results == null) {
            throw new IllegalArgumentException("Results can not empty");
        }
        int excellent = 0;
        for (int r : results) {
            if (r > (maxPoints * (1.0 * limitInPercent / 100))) {
                excellent++;
            }
        }
        return excellent;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        if (results.length == 0 || results == null) {
            throw new IllegalArgumentException("Results can not empty");
        }
        int notExcellent = 0;
        for (int r : results) {
            if (r < (maxPoints * (1.0 * limitInPercent / 100))) {
                return true;
            }
        }
        return false;
    }
}