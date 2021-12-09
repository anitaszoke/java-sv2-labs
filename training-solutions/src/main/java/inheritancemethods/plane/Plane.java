package inheritancemethods.plane;

public class Plane {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("Kis Örs", 60_000);
        PriorityPassenger priorityPassenger = new PriorityPassenger("Hum Bug", 60_000, 10);
        FirstClassPassenger firstClassPassenger = new FirstClassPassenger("Nap Sugár", 60_000, 20);

        System.out.println(passenger.getName());
        System.out.println(passenger.getPriceOfPlaneTicket());
        System.out.println();

        System.out.println(priorityPassenger.getName());
        System.out.println(priorityPassenger.getPriceOfPlaneTicket());
        System.out.println(priorityPassenger.getPercent());
        System.out.println();

        System.out.println(firstClassPassenger.getName());
        System.out.println(firstClassPassenger.getPriceOfPlaneTicket());
        System.out.println(firstClassPassenger.getPercent());
        System.out.println(firstClassPassenger.getExtraCharge());
    }
}
