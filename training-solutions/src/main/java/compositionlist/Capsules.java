package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> colours = new ArrayList<>();

    public void addLast(String colour) {
        colours.add(colour);
    }
    public void removeFirst() {
        colours.remove(0);
    }
    public void addFirst(String colour) {
        colours.add(0,colour);
    }
    public void removeLast() {
        colours.remove(colours.size() - 1);
    }
    public List<String> getColours() {
        return colours;
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addLast("fehér");
        capsules.addLast("piros");
        capsules.addFirst("zöld");
        capsules.addFirst("sárga");
        capsules.addFirst("kék");
        System.out.println(capsules.getColours());

        capsules.removeFirst();
        capsules.removeLast();
        System.out.println(capsules.getColours());

    }

}
