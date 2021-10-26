package math.math;

public class MathMethods {

    public static void main(String[] args) {
        System.out.println(Math.max(10 , 100));
        System.out.println(Math.min(10, 100));

        System.out.println(Math.PI);

        System.out.println(Math.round(Math.PI));
        System.out.println(Math.round(42.2));

        System.out.println(Math.abs(-15.5));

        System.out.println(Math.negateExact(-5));
        System.out.println(Math.negateExact(5));

        System.out.println(Math.addExact(10, 15));
        System.out.println(Math.subtractExact(15, 10));

        System.out.println(Math.multiplyExact(5, 5));

        System.out.println(Math.pow(2, 2));

        System.out.println(Math.incrementExact(42));
        System.out.println(Math.decrementExact(42));

        System.out.println((Math.random()));

    }
}
