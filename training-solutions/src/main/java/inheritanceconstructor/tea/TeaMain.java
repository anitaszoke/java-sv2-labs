package inheritanceconstructor.tea;

public class TeaMain {
    public static void main(String[] args) {
        Tea tea = new Tea("orange", 500);
        System.out.println(tea.getName());
        System.out.println(tea.getPrice());

        HerbalTea herbalTea = new HerbalTea("lemon balm", 600);
        System.out.println(herbalTea.getName());
        System.out.println(herbalTea.getPrice());
    }
}
