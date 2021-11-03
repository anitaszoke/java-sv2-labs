package stringconcat.nameconcat;


public class NameMain {
    public static void main(String[] args) {
        Name name = new Name("Kis","Géza","Aladár",Title.DR);
        Name name2 = new Name("Kis","Géza","Aladár",null);
        Name name3 = new Name("Kis",null,"Aladár",null);

        System.out.println(name.concatNameHungarianStyle());
        System.out.println(name2.concatNameHungarianStyle());
        System.out.println(name3.concatNameHungarianStyle());

        System.out.println(name.concatNameWesternStyle());
        System.out.println(name2.concatNameWesternStyle());
        System.out.println(name3.concatNameWesternStyle());
    }
}
