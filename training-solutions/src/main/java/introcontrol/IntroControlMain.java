package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();

        //nagyobb, mint tíz
        System.out.println(introControl.subtractTenIfGreaterThanTen(5));
        System.out.println(introControl.subtractTenIfGreaterThanTen(10));
        System.out.println(introControl.subtractTenIfGreaterThanTen(100));

        //0 vagy nem 0
        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.describeNumber(1));

        //Hello Joe
        System.out.println(introControl.greetingToJoe("Alma"));
        System.out.println(introControl.greetingToJoe("Joe"));

        //értékesítő bónusz
        System.out.println(introControl.calculateBonus(2000000));
        System.out.println(introControl.calculateBonus(200000));

        //mérőállások consumption
        System.out.println(introControl.calculateConsumption(9995, 5));

        //poz egész számok
        introControl.printNumbers(-10);
        introControl.printNumbers(10);

        // beetween poz egész szánok
        introControl.printNumberBetween(1, 10);

        // b nagyobb-e AnyDir
        introControl.printNumberBetweenAnyDirection(2, 4);
        introControl.printNumberBetweenAnyDirection(4, 2);

        //oddnumbers
        introControl.printOddNumbers(7);
        introControl.printOddNumbers(8);



    }
}
