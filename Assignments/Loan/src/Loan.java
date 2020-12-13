/**
 * This class is the same as the one in the book, except that a
 * String attribute has been added as an instance variable to keep
 * track of the borrowers name.
 * 
 * Leave this class alone!
 * @author Leave it Alone.
 *
 */
public class Loan
{
  private static final int MONTHS_IN_YEAR = 12;
  private static final int MONTHLY_DIVIDER = 1200;
  private String borrower;
  private double annualInterestRate;
  private int numberOfYears;
  private double loanAmount;
  private java.util.Date loanDate;

  /** Default constructor */
  public Loan()
  {
    this("None", 2.5, 1, 1000);
  }

  /**
   * Construct a loan with specified annual interest rate, number of years, and
   * loan amount
   */
  public Loan(String borrower, double annualInterestRate, int numberOfYears, double loanAmount)
  {
    this.borrower = borrower;
    this.annualInterestRate = annualInterestRate;
    this.numberOfYears = numberOfYears;
    this.loanAmount = loanAmount;
    loanDate = new java.util.Date();
  }
  
  public String getBorrowerName()
  {
    return borrower;
  }

  /** Return annualInterestRate */
  public double getAnnualInterestRate()
  {
    return annualInterestRate;
  }

  /** Set a new annualInterestRate */
  public void setAnnualInterestRate(double annualInterestRate)
  {
    this.annualInterestRate = annualInterestRate;
  }

  /** Return numberOfYears */
  public int getNumberOfYears()
  {
    return numberOfYears;
  }

  /** Set a new numberOfYears */
  public void setNumberOfYears(int numberOfYears)
  {
    this.numberOfYears = numberOfYears;
  }

  /** Return loanAmount */
  public double getLoanAmount()
  {
    return loanAmount;
  }

  /** Set a newloanAmount */
  public void setLoanAmount(double loanAmount)
  {
    this.loanAmount = loanAmount;
  }

  /** Find monthly payment */
  public double getMonthlyPayment()
  {
    double monthlyInterestRate = annualInterestRate / MONTHLY_DIVIDER;
    double monthlyPayment =
      loanAmount * monthlyInterestRate
        / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * MONTHS_IN_YEAR)));
    return monthlyPayment;
  }

  /** Find total payment */
  public double getTotalPayment()
  {
    double totalPayment = getMonthlyPayment() * numberOfYears * MONTHS_IN_YEAR;
    return totalPayment;
  }

  /** Return loan date */
  public java.util.Date getLoanDate()
  {
    return loanDate;
  }
}