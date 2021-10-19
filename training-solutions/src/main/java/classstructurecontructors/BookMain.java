package classstructurecontructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Douglas Adams", "The Hitchhiker's Guide to the Galaxy");
        book.register("42");

        System.out.println("Author: "+book.getAuthor()+", title: "+book.getTitle()+", regnumber: "+book.getRegNumber()+".");
    }
}
