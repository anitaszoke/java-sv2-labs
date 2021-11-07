package meetingrooms;


import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.print(meetingRoom.getName() + ", ");
        }
    }

    public void printNamesReverse() {
        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            System.out.print(meetingRooms.get(i).getName() + ", ");
        }
    }

    public void printEvenNames() {
        for (int i = 0; i < meetingRooms.size(); i++) {
            if (i != 0 || i % 2 == 0) {
                System.out.print(meetingRooms.get(i + 1).getName() + ", ");
                i++;
            }
        }
    }

    public void printArea() {
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom.getName() + " " + meetingRoom.getWidth() + " " + meetingRoom.getLength() + " " + meetingRoom.getArea(meetingRoom.getLength(), meetingRoom.getWidth()));
        }
    }

    public void printMeetingRoomsWithName(String name) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().equalsIgnoreCase(name)) {
                System.out.println(meetingRoom.getName() + " " + meetingRoom.getWidth() + " " + meetingRoom.getLength() + " " + meetingRoom.getArea(meetingRoom.getLength(), meetingRoom.getWidth()));

            }
        }
    }

    public void printMeetingRoomsContains(String part) {
        part = part.toLowerCase();
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().toLowerCase().contains(part.toLowerCase())) {
                System.out.println(meetingRoom.getName() + " " + meetingRoom.getWidth() + " " + meetingRoom.getLength() + " " + meetingRoom.getArea(meetingRoom.getLength(), meetingRoom.getWidth()));

            }
        }
    }

    public void printAreaLargerThan(int area) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getArea(meetingRoom.getLength(), meetingRoom.getWidth()) > area) {
                System.out.println(meetingRoom.getName() + " " + meetingRoom.getWidth() + " " + meetingRoom.getLength() + " " + meetingRoom.getArea(meetingRoom.getLength(), meetingRoom.getWidth()));
            }
        }
    }
}


