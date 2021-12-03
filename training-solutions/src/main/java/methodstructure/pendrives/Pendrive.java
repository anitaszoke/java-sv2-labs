package methodstructure.pendrives;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", capacity: " + capacity + ", price: " + price;
    }

    public void risePrice(int percent) {
        this.price = (this.price / 100) * (100 + percent);
    }

    public int comparePricePerCapacity(Pendrive other) {
        if (priceCapacity() > other.priceCapacity()) {
            return 1;
        } else if (priceCapacity() < other.priceCapacity()) {
            return -1;
        }
        return 0;
    }

    public boolean isCheaperThan(Pendrive other) {
        return this.price < other.price;
    }

    private int priceCapacity() {
        return price / capacity;
    }
}