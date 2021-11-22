package introexceptiontrace.random;

public class NumbersMain {
    public static void main(String[] args) {
        Change change = new Change();
        System.out.println(change.changeNumbers());
        //ArrayIndexOutOfBoundsException, RandomOperations getNumbers() for ciklusban, i > tömb max index
    }
}
