package chars;

public class WhiteSpace {
    public void makeWhitespaceToStar(String text) {
        char[] charsOfText = text.toCharArray();
        for (int i = 0; i < charsOfText.length; i++) {
            if (Character.isWhitespace(charsOfText[i])) {
                charsOfText[i] = '*';
            }
        }
        String starText = new String(charsOfText);
        System.out.println(starText);
    }

    public static void main(String[] args) {
        WhiteSpace whiteSpace = new WhiteSpace();
        whiteSpace.makeWhitespaceToStar(" Csillagok csillagok ");
    }

}
