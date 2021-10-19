package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();

        client.setName("Alma Malna");
        client.setYear(2020);
        client.setAddress("5540 Szarvas");

        System.out.println("Name: " + client.getName());
        System.out.println("Birth: " + client.getYear());
        System.out.println("Address: " + client.getAddress());

        client.migrate("9700 Szombathely");

        System.out.println("New Address: " + client.getAddress());


    }
}
