package methodchain;

public class ModifiedWord {

    public String modify(String word) {
        String newWord = word.substring(0, 1).toUpperCase() + "x" + word.substring(2, 3).toUpperCase() + "y";
        return newWord;
    }

    public String modify2(String word) {
        StringBuilder sb = new StringBuilder(word);
        sb.setCharAt(1, 'x');
        sb.setCharAt(3, 'y');
        sb.setLength(4);

        return sb.toString();
    }

    public String modify3(String word) {
        String newWord = word.substring(0, 1).toUpperCase().concat("x").concat(word.substring(2, 3).toUpperCase()).concat("y");
        return newWord;

    }
}