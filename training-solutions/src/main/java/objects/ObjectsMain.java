package objects;

public class ObjectsMain {
    public static void main(String[] args) {

        class Book {
        }
        new Book();
        System.out.println(new Book());
        Book emptyBook = null;
        System.out.println(emptyBook);
        if (emptyBook == null) {
            System.out.println("null");
        } else {
            System.out.println("not null");
        }

        Book book = new Book();
        book = new Book();
        System.out.println(book);
        book = null;
        System.out.println(book);
        book = new Book();
        System.out.println(book);

        Book anotherBook = new Book();
        System.out.println(anotherBook == book);

        //Gyakorlati feladat - Objektumok száma
        //A következő kód hány objektumot hoz létre? A futás végére mennyi objektumhoz lehet hozzáférni?
        //??

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book4 = book6;
        new Book();
        book5 = new Book();
        book6 = null;
        book5 = book4;



    }
}
