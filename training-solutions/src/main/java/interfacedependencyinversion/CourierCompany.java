package interfacedependencyinversion;

public class CourierCompany {
    public static void main(String[] args) {
        Box small = new SmallBox();
        Box medium = new MediumBox();
        Box large = new LargeBox();
        Box extraLarge = new ExtraLargeBox();

        System.out.println(small.getSize());
        System.out.println(small.getPrice());

        System.out.println(medium.getSize());
        System.out.println(medium.getPrice());

        System.out.println(large.getSize());
        System.out.println(large.getPrice());

        System.out.println(extraLarge.getSize());
        System.out.println(extraLarge.getPrice());
    }
}
