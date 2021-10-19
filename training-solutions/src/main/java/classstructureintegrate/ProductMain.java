package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {

        System.out.println("Product name?");
        Scanner scanner = new Scanner (System.in);
        String name = scanner.nextLine();

        System.out.println("Product price?");
        int price = scanner.nextInt();

        Product product = new Product(name,price);
        System.out.println("Product name: " +product.getName()+", product price: "+product.getPrice());

        product.increasePrice(1);
        System.out.println("Product name: " +product.getName()+", product price: "+product.getPrice());

        product.decreasePrice(1);
        System.out.println("Product name: " +product.getName()+", product price: "+product.getPrice());








    }
}
