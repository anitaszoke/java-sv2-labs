package meetingrooms;


import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        System.out.println("Tárgyaló rögzítése sikerült!");
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        System.out.println("2. Tárgyalók sorrendben");
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.print(meetingRoom.getName() + ", ");
        }
        System.out.println();
    }


    public void printNamesReverse() {
        System.out.println("3. Tárgyalók visszafele sorrendben");
        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(meetingRooms.get(i).getName() + ", ");
            } else {
                System.out.print(meetingRooms.get(i).getName());
            }
        }
        System.out.println();
    }

    public void printEvenNames() {
        System.out.println("4. Minden második tárgyaló");
        for (int i = 1; i <= meetingRooms.size(); i++) {
            if (i % 2 == 0) {
                System.out.print(meetingRooms.get(i - 1).getName() + ", ");
                i++;
            }
        }
        System.out.println();
    }

    public void printArea() {
        System.out.println("5. Területek");
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println("Tárgyaló neve: " + meetingRoom.getName() + "\n"
                    + "Tárgyaló szélessége: " + meetingRoom.getWidth() + "\n"
                    + "Tárgyaló hossza: " + meetingRoom.getLength() + "\n"
                    + "Tárgyaló területe: " + meetingRoom.getArea(meetingRoom.getLength(), meetingRoom.getWidth()) + "\n");
        }
        System.out.println();
    }

    public void printMeetingRoomsWithName(String name) {
        System.out.println("6. Keresés pontos név alapján");
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().equalsIgnoreCase(name)) {
                System.out.println("Tárgyaló neve: " + meetingRoom.getName() + "\n"
                        + "Tárgyaló szélessége: " + meetingRoom.getWidth() + "\n"
                        + "Tárgyaló hossza: " + meetingRoom.getLength() + "\n"
                        + "Tárgyaló területe: " + meetingRoom.getArea(meetingRoom.getLength(), meetingRoom.getWidth()) + "\n");

            }
        }
        System.out.println();
    }

    public void printMeetingRoomsContains(String part) {
        System.out.println("7. Keresés névtöredék alapján");
        part = part.toLowerCase();
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().toLowerCase().contains(part.toLowerCase())) {
                System.out.println("Tárgyaló neve: " + meetingRoom.getName() + "\n"
                        + "Tárgyaló szélessége: " + meetingRoom.getWidth() + "\n"
                        + "Tárgyaló hossza: " + meetingRoom.getLength() + "\n"
                        + "Tárgyaló területe: " + meetingRoom.getArea(meetingRoom.getLength(), meetingRoom.getWidth()) + "\n");

            }
        }
        System.out.println();
    }

    public void printAreaLargerThan(int area) {
        System.out.println("8. Keresés terület alapján");
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getArea(meetingRoom.getLength(), meetingRoom.getWidth()) > area) {
                System.out.println("Tárgyaló neve: " + meetingRoom.getName() + "\n"
                        + "Tárgyaló szélessége: " + meetingRoom.getWidth() + "\n"
                        + "Tárgyaló hossza: " + meetingRoom.getLength() + "\n"
                        + "Tárgyaló területe: " + meetingRoom.getArea(meetingRoom.getLength(), meetingRoom.getWidth()) + "\n");
            }
        }
        System.out.println();
    }
}


