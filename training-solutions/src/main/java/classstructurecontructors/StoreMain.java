package classstructurecontructors;

public class StoreMain {
    public static void main(String[] args) {

        Store penStore = new Store("pen", 0);
        penStore.store(100);

        System.out.println(penStore.getProduct()+"-start: "+penStore.getStock());
        penStore.store(10);
        penStore.dispatch(0);
        System.out.println(penStore.getProduct()+"-end: "+penStore.getStock());

        Store flowerStore = new Store("flower", 0);
        flowerStore.store(100);

        System.out.println(flowerStore.getProduct()+"-start: "+flowerStore.getStock());
        flowerStore.store(0);
        flowerStore.dispatch(10);
        System.out.println(flowerStore.getProduct()+"-end: "+flowerStore.getStock());
    }
}
