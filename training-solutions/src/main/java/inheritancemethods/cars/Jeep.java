package inheritancemethods.cars;

public class Jeep extends Car {
    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    @Override
    public void drive(int km) {
        if (!fuelEnoughJepp(km)) {
            throw new IllegalArgumentException("Not enough fuel");
        }
        double usedFuel = km * super.getFuelRate() / 100;
        extraFuel -= usedFuel;
        if (extraFuel < 0) {
            modifyFuelAmount(extraFuel);
            extraFuel = 0;
        }
    }

    @Override
    public void modifyFuelAmount(double fuel) {
        if (fuel > calculateRefillAmount()) {
            throw new IllegalArgumentException("Too much fuel to tank!");
        }
        if (fuel <= super.calculateRefillAmount()) {
            super.modifyFuelAmount(fuel);
        } else {
            double toTankAmount = super.calculateRefillAmount();
            super.modifyFuelAmount(toTankAmount);
            extraFuel += (fuel - toTankAmount);
        }
    }

    @Override
    public double calculateRefillAmount() {
        return (super.getTankCapacity() + extraCapacity) - (super.getFuel() + extraFuel);

    }

    private boolean fuelEnoughJepp(int km) {
        return (0 < (super.getFuel() + extraFuel) - (super.getFuelRate() * km) / 100);
    }
}