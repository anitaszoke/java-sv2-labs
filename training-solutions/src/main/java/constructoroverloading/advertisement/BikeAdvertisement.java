package constructoroverloading.advertisement;

import java.util.List;

public class BikeAdvertisement {
    private String shortText;
    private int price;
    private List<String> extras;
    private String brand;
    private String serialNumber;

    public BikeAdvertisement(String shortText, int price) {
        this.shortText = shortText;
        this.price = price;
    }

    public BikeAdvertisement(String shortText, int price, String brand) {
        this(shortText, price);
        this.brand = brand;
    }

    public BikeAdvertisement(String shortText, int price, String brand, List<String> extras) {
        this(shortText, price, brand);
        this.extras = extras;
    }

    public BikeAdvertisement(String shortText, int price, String brand, List<String> extras, String serialNumber) {
        this(shortText, price, brand, extras);
        this.serialNumber = serialNumber;
    }

    public String getShortText() {
        return shortText;
    }

    public int getPrice() {
        return price;
    }

    public List<String> getExtras() {
        return extras;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}