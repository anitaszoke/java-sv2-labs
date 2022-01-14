package collectionsiterator.present;

public class ChristmasPresent {
    private String present;
    private String name;
    private int price;

    public ChristmasPresent(String present, String name, int price) {
        this.present = present;
        this.name = name;
        this.price = price;
    }

    public String getPresent() {
        return present;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
