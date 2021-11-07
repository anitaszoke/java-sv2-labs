package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {
    Office office = new Office();
    Scanner scanner = new Scanner(System.in);

    public void printMenu() {
        System.out.println("1. Tárgyaló rögzítése \n"
                + "2. Tárgyalók sorrendben \n"
                + "3. Tárgyalók visszafele sorrendben \n"
                + "4. Minden második tárgyaló \n"
                + "5. Területek \n"
                + "6. Keresés pontos név alapján \n"
                + "7. Keresés névtöredék alapján \n"
                + "8. Keresés terület alapján \n"
                + "9. Kilépés");
    }

    public void readOffice() {
        System.out.println("Kérem adja meg a tárgyaló nevét:");
        String name = scanner.nextLine();
        System.out.printf("Kérem adja meg a %s tárgyaló hosszúságát:", name);
        int length = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Kérem adja meg a %s tárgyaló szélességét:", name);
        int width = scanner.nextInt();
        scanner.nextLine();
        MeetingRoom meetingRoom = new MeetingRoom(name, length, width);
        office.addMeetingRoom(meetingRoom);
    }

    public void runMenu() {
        printMenu();
        System.out.println("Kérem válasszon egy menüpontot!");
        int menuNumber = scanner.nextInt();
        scanner.nextLine();
        switch (menuNumber) {
            case 1:
                readOffice();
                runMenu();

            case 2:
                office.printNames();
                runMenu();

            case 3:
                office.printNamesReverse();
                runMenu();

            case 4:
                office.printEvenNames();
                runMenu();

            case 5:
                office.printArea();
                runMenu();

            case 6:
                System.out.println("Kérem adja meg a tárgyaló nevét:");
                String name = scanner.nextLine();
                office.printMeetingRoomsWithName(name);
                runMenu();

            case 7:
                System.out.println("Kérem adja meg a tárgyaló nevének egy részletét:");
                String part = scanner.nextLine();
                office.printMeetingRoomsContains(part);
                runMenu();

            case 8:
                System.out.println("Kérem adjon meg egy területet, amelynél nagyobb tárgyalók adatait kéri:");
                int area = scanner.nextInt();
                scanner.nextLine();
                office.printAreaLargerThan(area);
                runMenu();

            case 9:
                System.out.println("");
                break;

            default:
                System.out.println("Ismeretlen menüpont, kérem válasszon újra!");
                runMenu();

        }
    }


    public static void main(String[] args) {
        MeetingRoomController meetingRoomController = new MeetingRoomController();
        meetingRoomController.runMenu();


    }
}
