import java.util.Date;

public class Lab_113_SubclassesOfAccount {
    public static void main(String[] args) {
        Account account = new Account();
        SavingAccount savingAccount = new SavingAccount();
        CheckingAccount checkingAccount = new CheckingAccount();
        System.out.println(account.toString());
        System.out.println(savingAccount.toString());
        System.out.println(checkingAccount.toString());
    }
}

class Account{
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated = new Date();

    // No args constructor
    public Account(){
    }
    // Another constructor
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    // Getters
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return (annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        if ((amount > 0) && (amount <= balance)){
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

class SavingAccount extends Account{
    @Override
    public String toString() {
        return "SavingAccount";
    }
}

class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount() {
        super();
        overdraftLimit = 10000.0;
    }

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String toString() {
        return "CheckingAccount";
    }
}