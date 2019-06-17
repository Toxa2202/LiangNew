import java.util.Date;

public class Lab_87_TheAccountClass {
    public static void main(String[] args) {
        Account test = new Account(1122, 20000);
        test.setAnnualInterestRate(4.5);
        test.withdraw(2500);
        test.deposit(3000);
        System.out.println("Balance = " + test.getBalance());
        System.out.println("Monthly interest = " + test.getMonthlyInterest());
        System.out.println("Created = " + test.getDateCreated());
    }
}

class Account{

    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated = new Date();

    // No args constructor
    Account(){
    }
    // Another constructor
    Account(int id, double balance){
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
            balance += amount;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
