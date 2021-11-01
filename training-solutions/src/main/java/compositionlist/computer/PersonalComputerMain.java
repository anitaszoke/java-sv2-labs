package compositionlist.computer;

public class PersonalComputerMain {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("Intel i5-6900KF",3.70);

        PersonalComputer personalComputer = new PersonalComputer(cpu);

        Hardware mouse = new Hardware("mouse","steelseries rival 3");
        Hardware keyboard = new Hardware("keyboard","DELL KB216t");

        Software operatingSystem = new Software("Windows",10);

        personalComputer.addHardware(mouse);
        personalComputer.addHardware(keyboard);
        personalComputer.addSoftware(operatingSystem);

        System.out.println(personalComputer.getCpu()+" "+personalComputer.getHardwares()+" "+personalComputer.getSoftwares());


    }
}
