package inheritancemethods.plane;

public class FirstClassPassenger extends PriorityPassenger {
    private final int extraCharge = 2000;

    public FirstClassPassenger(String name, int priceOfPlaneTicket, int PERCENT) {
        super(name, priceOfPlaneTicket, PERCENT);
    }

    public int getExtraCharge() {
        return extraCharge;
    }

    @Override
    public int getPriceOfPlaneTicket() {
        return super.getPriceOfPlaneTicket() + getExtraCharge();
    }
}
