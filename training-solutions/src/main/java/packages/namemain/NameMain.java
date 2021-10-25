package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

public class NameMain {
    public static void main(String[] args) {
        FirstName firstName = new FirstName("Anita");
        LastName lastName = new LastName("Szoke");
        Prefix prefix = new Prefix("");

        String pre = prefix.getPre();
        String last = lastName.getLast();
        String first = firstName.getFirst();

        System.out.println(pre+" "+last+" "+first);
    }
}
