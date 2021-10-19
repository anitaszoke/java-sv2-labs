package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Account owner?");
        String accountOwner = scanner.nextLine();

        System.out.println("Account number?");
        String accountNumber = scanner.nextLine();

        System.out.println("Account start balance?");
        int amount = scanner.nextInt();
        scanner.nextLine();

        BankAccount account = new BankAccount(accountNumber, accountOwner, amount);
        System.out.println(account.getInfo());

        System.out.println("Deposit?");
        int depositAmount = scanner.nextInt();
        account.deposit(depositAmount);
        System.out.println(account.getInfo());


        System.out.println("Withdraw");
        int withdrawAmount = scanner.nextInt();
        account.withdraw(withdrawAmount);
        System.out.println(account.getInfo());







    }


}
