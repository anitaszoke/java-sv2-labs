package enumtype.solarsystem;

public class SolarSystemMain {
    public static void main(String[] args) {
        System.out.println(SolarSystem.EARTH+": "+SolarSystem.EARTH.getMoon());
        System.out.println(SolarSystem.JUPITER+": "+SolarSystem.JUPITER.getMoon());
    }
}
