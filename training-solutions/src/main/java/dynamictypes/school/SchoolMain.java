package dynamictypes.school;

public class SchoolMain {
    public static void main(String[] args) {

        School school = new School("school", 12);
        School primary = new PrimarySchool("Kazinczy", 8);
        School secondary = new SecondarySchool("Eötvös", 4);

        System.out.println(school + "\n" + primary + "\n" + secondary);
    }
}
