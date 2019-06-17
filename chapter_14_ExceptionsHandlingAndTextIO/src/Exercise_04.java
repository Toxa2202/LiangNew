import java.util.Scanner;

/**
 * Created by anton.sviatov on 17.06.2019.
 */
public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter the number of years: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter the loan amount: ");
        double loanAmount = input.nextDouble();

        try {
            Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
            System.out.println(String.format("The loan was created on %s\n" +
                            "The monthly payment is %.2f\n" +
                            "The total payment is %.2f\n",
                    loan.getLoanDate().toString(),
                    loan.getMonthlyPaymant(),
                    loan.getTotalPayment()));

        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }

    }
}

class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    /** Default constructor */
    public Loan() {
        this(2.5, 1, 1000);
    }
    /**
     * Construct a loan with specified annual interest rate, number of years,
     * and loan amount
     */
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) throws IllegalArgumentException{
        if (annualInterestRate > 0) {
            this.annualInterestRate = annualInterestRate;
        } else {
            throw new IllegalArgumentException("Annual interest rate can't be <= 0");
        }

        if (numberOfYears > 0) {
            this.numberOfYears = numberOfYears;
        } else {
            throw new IllegalArgumentException("Number of years can't be <= 0");
        }

        if (loanAmount > 0) {
            this.loanAmount = loanAmount;
        } else {
            throw new IllegalArgumentException("Loan amount can't be <= 0");
        }

        loanDate = new java.util.Date();
    }

    /** Return annualInterestRate */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /** Return annualInterestRate */
    public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException {
        if (annualInterestRate > 0) {
            this.annualInterestRate = annualInterestRate;
        } else {
            throw new IllegalArgumentException("Can't be <= 0");
        }
    }

    /** Return numberOfYears */
    public int getNumberOfYears() {
        return numberOfYears;
    }

    /** Set a new numberOfYears */
    public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException {
        if (numberOfYears > 0) {
            this.numberOfYears = numberOfYears;
        } else {
            throw new IllegalArgumentException("Can't be <= 0");
        }
    }

    /** Return loanAmount */
    public double getLoanAmount() {
        return loanAmount;
    }

    /** Set a newloanAmount */
    public void setLoanAmount(double loanAmount) throws IllegalArgumentException {
        if (loanAmount > 0) {
            this.loanAmount = loanAmount;
        } else {
            throw new IllegalArgumentException("Can't be <= 0");
        }
    }

    /** Find monthly payment */
    public double getMonthlyPaymant() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return  monthlyPayment;
    }

    /** Find total payment */
    public double getTotalPayment() {
        double totalPayment = getMonthlyPaymant() * numberOfYears * 12;
        return totalPayment;
    }

    /** Return loan date */
    public java.util.Date getLoanDate() {
        return loanDate;
    }
}
