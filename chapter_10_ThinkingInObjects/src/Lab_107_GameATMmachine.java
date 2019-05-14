import java.util.Date;
import java.util.Scanner;

public class Lab_107_GameATMmachine {
    public static void main(String[] args) {
        // Create array of Account and load his 10 stacks by balance = 100
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(0, 100);
        }
        // User Input
        Scanner input = new Scanner(System.in);
        // All actions will be in statement
        while (true) {
            // initialisation id number
            int id = -1;
            // If id is wrong
            while ((id >= 10) || (id < 0)) {
                System.out.print("\nEnter an id: ");
                // Then repeat enter id
                id = input.nextInt();
            }
            // if id is right
            boolean continueThisAccount = true;
            do {
                // user choose the action
                int choise = -1;
                while ((choise >= 5) || (choise < 1)) {
                    System.out.print("\nMain menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit\nEnter a choise: ");
                    choise = input.nextInt();
                }
                // What action will be on each choosing
                switch (choise) {
                    case 1:
                        System.out.println("The balance is " + accounts[id].getBalance());
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        double amount = input.nextDouble();
                        accounts[id].withdraw(amount);
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        double deposit = input.nextDouble();
                        accounts[id].deposit(deposit);
                        break;
                    case 4:
                        continueThisAccount = false;
                }
                // Will work until :
            } while (continueThisAccount);
        }
    }
}

class Account {
    // Initialization
    private  int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated = new Date();
    // Default constructor
    public Account() {
    }
    // Reloaded constructor
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    // End of Getters end Setters

    // Method to calculate monthly interest rate
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }
    // Method to calculate monthly interest
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    // Method to calculate withdraw
    public void withdraw(double amount) {
        if ((amount > 0) && (amount <= balance)) {
            balance -= amount;
        }
    }
    // Method to calculate deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}