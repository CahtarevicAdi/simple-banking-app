package ba.shop;

import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bank Setup
        BankAccount account = new BankAccount("23","Michael Jordan", 1000.00);

        // User interface
        while(true){
            System.out.println("Welcome! Choose an option: ");
            System.out.println("1. Check account balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

        switch (choice){
            case 1 :
                System.out.println("Your current account balance is : " + account.getBalance());
                break;
            case 2 :
                System.out.println("Enter the amount you want to deposit : ");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
                break;
            case 3 :
                System.out.println("Enter the amount you want to withdraw : ");
                double withdrawAmount = scanner.nextDouble();
                account.withdraw(withdrawAmount);
                break;
            case 4 :
                System.out.println("Thank you for using our services !");
                System.exit(0);
                break;
            default :
                System.out.println("Invalid option ! Try again.");
            }
        }
    }
}
