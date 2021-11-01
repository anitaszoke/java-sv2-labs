package chars;

public class Words {
    public void pushWord(String word) {
        char[] wordToPush = word.toCharArray();
        for (int i = 0; i < wordToPush.length; i++) {
            wordToPush[i] += 1;
        }
        String pushText = new String(wordToPush);
        System.out.println(pushText);

    }

    public static void main(String[] args) {
        Words words = new Words();
        words.pushWord("alma");
    }
}
