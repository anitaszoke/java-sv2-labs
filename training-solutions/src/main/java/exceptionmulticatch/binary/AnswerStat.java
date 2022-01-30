package exceptionmulticatch.binary;

public class AnswerStat {

    private BinaryStringConverter converter;

    public AnswerStat(BinaryStringConverter converter) {
        this.converter = converter;
    }

    public boolean[] convert(String text) {
        try {
            return converter.binaryStringToBooleanArray(text);
        } catch (NullPointerException | IllegalArgumentException ex) {
            throw new InvalidBinaryStringException(ex);
        }
    }

    public int answerTruePercent(String answers) {
        boolean[] values = convert(answers);
        int countTrue = 0;

        for (boolean b : values) {
            if (b) {
                countTrue++;
            }
        }
        return (int) Math.round((double) countTrue / values.length * 100);
    }
}