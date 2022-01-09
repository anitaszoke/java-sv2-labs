package interfaces.animal;

public class Lion implements Animal {
    @Override
    public int getNumberOgLegs() {
        return 4;
    }

    @Override
    public String getName() {
        return "Lion";
    }
}
