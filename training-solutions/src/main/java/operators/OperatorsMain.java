package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators operators = new Operators();
        //Írd ki a konzolra egy általad tetszőlegesen választott egész szám kettes számrendszer-beli alakját!
        System.out.println(Integer.toBinaryString(42));

        System.out.println(operators.isEvent(42));
        System.out.println(operators.isEvent(43));

        System.out.println(operators.getResultOfDivision(16,3));

        System.out.println(operators.isNull(null));
        System.out.println(operators.isNull("null"));
        System.out.println(operators.isNull("0"));

        System.out.println(operators.isEmpty(""));
        System.out.println(operators.isEmpty(null));
        System.out.println(operators.isEmpty("0"));






    }
}
