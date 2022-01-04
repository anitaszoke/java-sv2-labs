package interfacerules;

public class ParkingPlace implements Length, Width{

    @Override
    public double getLength() {
        return 2.2;
    }

    @Override
    public double getWidth() {
        return 5;
    }
}
