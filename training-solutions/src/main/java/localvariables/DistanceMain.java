package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(90.5, true);
        System.out.println(distance.getDistanceInKm()+" "+distance.isExact());
        int integerNumber = (int) distance.getDistanceInKm();
        System.out.println(integerNumber);

    }
}
