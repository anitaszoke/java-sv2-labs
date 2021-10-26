package cmdarguments.verse;

public class VerseMain {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);

        for (String k : args) {
            System.out.print(k+" ");
        }

        System.out.println();

        for (int i = args.length-1; i >=0; i--){
            System.out.print(args[i] + " ");
        }
    }
}
