package atmmachine;

import java.util.Scanner;

public class ATMMachine {

    public static void main(String[] args) {
        int balance = 20000, withdraw, deposite, num;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome To Atm Machine");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposite");
            System.out.println("3.check balance");
            System.out.println("4.Exit");
            num = input.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Enter Amount to be withdraw");
                    withdraw = input.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Balance Amount is:" + balance);
                        System.out.println("Please Collect Money");
                    } else {
                        System.out.println("You don't have enough money for withdraw");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Enter Amount to deposite");
                    deposite = input.nextInt();
                    balance = balance + deposite;
                    System.out.println("Balance Amount is:" + balance);
                    System.out.println("Money has been deposited successfully");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Balance Amount is:" + balance);
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);
                    System.out.println("Thank you and see you next time");

            }

        }
    }
}
