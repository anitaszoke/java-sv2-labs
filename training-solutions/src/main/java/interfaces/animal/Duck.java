package interfaces.animal;

public class Duck implements Animal {

    @Override
    public int getNumberOgLegs() {
        return 2;
    }

    @Override
    public String getName() {
        return "Duck";
    }
}
