package composition.realestate;

public class RealEstateDotCom {
    public static void main(String[] args) {
        Address address = new Address("Rum","8756","Rum utca",7);
        System.out.println(address.toString());

        Details details = new Details("Gyönyörő kert 30 éves örekzöldekkel és gyümölcsfákkal, 3 szobás ház",address,75,1500);
        System.out.println(details.toString());

        RealEstate realEstate = new RealEstate("Falusi házikó",8.5,details);
        System.out.println(realEstate.toString());

    }
}
