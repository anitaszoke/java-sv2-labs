package classstructurecontructors;

public class Store {
    private String product;
    private int stock;

    public Store(String product, int stock) {
        this.product = product;
        this.stock = stock;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }

    public void store(int stockChange ) {
        stock = stockChange+ stock;
    }
    public void dispatch(int stockChange) {
        stock = stock - stockChange;
    }
}
