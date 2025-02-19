package ba.shop;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {

    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = initialBalance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit successful ! Your new balance is : " + balance);
    }
    public void withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
            System.out.println("Withdraw successful ! Your new balance is : " + balance);
        }
        else{
            System.out.println("Not enough funds !");
        }
    }
}

