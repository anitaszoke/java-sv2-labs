package compositionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {
    private List<String> bookTitle = new ArrayList<>();

    public List<String> getBookTitle() {
        return bookTitle;
    }

    public void addBook(String title) {
        bookTitle.add(title);
    }
    public void findBookAndSetAuthor(String title, String author) {
        if (bookTitle.contains(title)) {
            int index = bookTitle.indexOf(title);
            String bookAuthor = '"'+ author + ": "+ title +'"';
            bookTitle.set(index, bookAuthor);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Books books = new Books();

        System.out.println("Mennyi könyvet szeretne?");
        int numberTitle = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numberTitle; i++) {
            System.out.println("Kérem adja meg a(z) "+ (i + 1)+" könyv címét");
            String title = scanner.nextLine();
            books.addBook(title);
        }
        System.out.println(books.getBookTitle());
        System.out.println("Mennyi könyvhöz szeretne szerzőt is megadni?");
        int numberAuthor = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberAuthor; i++) {
            System.out.println("Kérem adja meg a(z)"+(i+1) +" könyv címét");
            String title1 = scanner.nextLine();
            System.out.println("Kérem adja meg a(z)"+(i+1)+" könyv szerzőjét");
            String author1 = scanner.nextLine();
            books.findBookAndSetAuthor(title1, author1);
            books.getBookTitle();

        }

        String listString = "";
        for (String s : books.bookTitle) {
            listString += s + "\n";
        }

        System.out.println(listString);


    }

}
