package array;

public class ArrayMain {
    public static void main(String[] args) {

        String[] weekDays = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};

        System.out.println(weekDays[1]);
        System.out.println(weekDays.length);

        int [] arrayOfNumbers = new int [5];
        arrayOfNumbers[0] =1;

        for (int i = 1; arrayOfNumbers.length > i; i=i+1) {
            arrayOfNumbers[i] = arrayOfNumbers[i-1] *2;
            System.out.println(arrayOfNumbers[i] + " ");

        }

        boolean[] number = new boolean[6];

        for (int i = 1; number.length > i; i = i +1) {
            number[0] = false;
            number[i] =! number[i-1];
            System.out.println(number[i] + " ");

        }
        //System.out.println(number[0]);


    }

}
