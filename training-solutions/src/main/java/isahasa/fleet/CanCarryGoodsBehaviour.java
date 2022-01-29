package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods {

    private int cargoWeight;
    private final int maxCargoWeight;

    public CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight) {
        int notLoad = 0;
        if (cargoWeight > maxCargoWeight) {
            notLoad = cargoWeight - maxCargoWeight;
            this.cargoWeight = cargoWeight - notLoad;
        } else {
            this.cargoWeight = cargoWeight;
        }
        return notLoad;
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }
}