package collectionscomp;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Building implements Comparable<Building>{

    private String address;
    private int area;
    private int level;

    public Building(String address, int area, int level) {
        this.address = address;
        this.area = area;
        this.level = level;
    }

    public String getAddress() {
        return address;
    }

    public int getArea() {
        return area;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public int compareTo(Building o) {
        return Integer.valueOf(level).compareTo(o.level);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return level == building.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(level);
    }

    @Override
    public String toString() {
        return "Building levels = " + level;
    }

    public static void main(String[] args) {
        Set<Building> buildings = new TreeSet<>();
        buildings.add(new Building("Egy utca",10,10));
        buildings.add(new Building("Két utca",20,2));
        buildings.add(new Building("Három utca",30,3));
        buildings.add(new Building("Négy utca",40,1));

        System.out.println(buildings);
    }
}
