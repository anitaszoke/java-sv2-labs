package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {
    public void getMarried(Woman woman, Man man) {
        setWomanName(woman, man.getName());
        addRegisterDate(woman, man);
    }

    private void addRegisterDate(Woman woman, Man man) {
        woman.addRegisterDate(new RegisterDate("A házasságkötés ideje", LocalDate.now()));
        man.addRegisterDate(new RegisterDate("A házasságkötés ideje", LocalDate.now()));
    }

    private void setWomanName(Woman woman, String manName) {
        String[] name = manName.split(" ");
        woman.setName(name[0] + "-" + woman.getName());
    }
}