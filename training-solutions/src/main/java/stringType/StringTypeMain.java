package stringType;

public class StringTypeMain {

    public static void main(String[] args) {

       String prefix = "Hello ";
       String name = "John Doe";
       String message = prefix + name;
       System.out.println(prefix);
       System.out.println(name);
       System.out.println(message);

       message = message + 444;
       System.out.println(message);

       boolean b = message.equals("Hello John Doe");
       System.out.println(b);

      boolean c = message.equals("Hello John Doe444");
      System.out.println(c);

      String zero = ""+"";
      System.out.println(zero);
      System.out.println(zero.length());

      String abcde = "abcde";
      System.out.println(abcde.length());
      System.out.println(abcde.substring(0, 2));
      System.out.println(abcde.substring(0));







    }


}
