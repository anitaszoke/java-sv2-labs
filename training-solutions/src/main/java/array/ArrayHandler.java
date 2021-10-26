package array;

public class ArrayHandler {
    public void addIndexToNumber(int[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = i + 1;
        }
    }

    public void concatenateIndexToWord(String[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = i + source[i];
        }
    }

    public static void main(String[] args) {
        String[] words = {"kettő", "négy", "öt", "hat", "nyolc"};
        int[] numbers = {2, 4, 5, 6, 8};

        ArrayHandler arrayHandler = new ArrayHandler();

        arrayHandler.addIndexToNumber(numbers);
        arrayHandler.concatenateIndexToWord(words);

        for (int i : numbers) {
            System.out.println(i);
        }
        for (int i : numbers) {
            System.out.print(i + ",");

        }
        System.out.println();

        for (String k : words) {
            System.out.println(k);
        }
        for (String k : words) {
            System.out.print(k + ",");

        }
    }
}

