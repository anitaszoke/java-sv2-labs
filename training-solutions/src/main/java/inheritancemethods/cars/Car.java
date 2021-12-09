package inheritancemethods.cars;

public class Car {
    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {
        this.fuel += fuel;
    }

    public void drive(int km) {
        if (fuelEnough(km)) {
            fuel = fuel - (km * fuelRate / 100);
        } else {
            throw new IllegalArgumentException("Not enough fuel");
        }
    }

    public double calculateRefillAmount() {
        return tankCapacity - fuel;

    }

    private boolean fuelEnough(int km) {
        return (0 < fuel - (fuelRate * km) / 100);
    }
}
