package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Kajak");

        System.out.println(book.getTitle());

        book.setTitle("Ragyogás");
        System.out.println(book.getTitle());
    }
}
