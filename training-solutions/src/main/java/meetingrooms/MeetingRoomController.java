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
                + "9. Kilépés \n"
                + "");
    }

    public void readOffice() {
        System.out.println("Kérem adja meg a tárgyaló nevét: ");
        String name = scanner.nextLine();
        System.out.printf("Kérem adja meg a(z) %s tárgyaló hosszúságát: ", name);
        int length = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Kérem adja meg a(z) %s tárgyaló szélességét: ", name);
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
        System.out.println();
        switch (menuNumber) {
            case 1:
                readOffice();
                System.out.println();
                runMenu();
                break;
            case 2:
                office.printNames();
                System.out.println("\n");
                runMenu();
                break;
            case 3:
                office.printNamesReverse();
                System.out.println();
                runMenu();
                break;
            case 4:
                office.printEvenNames();
                System.out.println();
                runMenu();
                break;
            case 5:
                office.printArea();
                System.out.println();
                runMenu();
                break;
            case 6:
                System.out.println("Kérem adja meg a keresett tárgyaló pontos nevét: ");
                String name = scanner.nextLine();
                office.printMeetingRoomsWithName(name);
                System.out.println();
                runMenu();
                break;
            case 7:
                System.out.println("Kérem adja meg a keresett tárgyaló nevének egy részletét: ");
                String part = scanner.nextLine();
                office.printMeetingRoomsContains(part);
                System.out.println();
                runMenu();
                break;
            case 8:
                System.out.println("Kérem adjon meg egy területet (egész számot), amelynél nagyobb tárgyalók adatait keresi: ");
                int area = scanner.nextInt();
                scanner.nextLine();
                office.printAreaLargerThan(area);
                System.out.println();
                runMenu();
                break;
            case 9:
                break;

            default:
                System.out.println("Ismeretlen menüpont, kérem válasszon újra!");
                System.out.println();
                runMenu();
        }
    }

    public static void main(String[] args) {
        MeetingRoomController meetingRoomController = new MeetingRoomController();
        meetingRoomController.runMenu();
    }
}
