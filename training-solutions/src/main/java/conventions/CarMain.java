package conventions;


public class CarMain {
    public static void main(String[] args) {

        Car car = new Car("Kia","1.6",4,5);

        car.addModelName("Rio");

        System.out.println(car.getCarType());
        System.out.println(car.getEngineType());
        System.out.println(car.getDoors());
        System.out.println(car.getPersons());


        car.setCarType("Mitsubishi");
        car.setEngineType("1.5");
        car.setDoors(4);
        car.setPersons(5);

        car.addModelName("Lancer");

        System.out.println(car.getCarType());
        System.out.println(car.getEngineType());
        System.out.println(car.getDoors());
        System.out.println(car.getPersons());

    }


}
