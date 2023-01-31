import java.util.Scanner;


public class Loan {
    public String loanOption;
    public String typeLoan;
    public String usedNew;
    public String studentLoanType;
    public double loanAmount;
    public double loanTime;
    public double loanTimeYear;
    private double intRate;
    //house
    private double intTenRate = 2.817;
    private double intFifRate = 2.717;
    private double intTwentRate = 2.919;
    private double intThirtrate = 3.120;
    //new car
    private double loanTimeNewLessThan3 = 1.99;
    private double loanTimeNewMoreThan3 = 2.99;
    //used car
    private double loanCarUsed = 2.5;
    private double loanCarUsedBig = 3.5;

    //school
    private double studentRateOne = 8.50;    // loan <= 5000: rate = 8.50%
    private double studentRateTwo = 7.50;    // loan <= 10000: rate = 7.50%
    private double studentRateThree = 6.50;  // loan <= 15000: rate = 6.50%
    private double studentRateFour = 5.50;   // loan <= 20000: rate = 5.50%
    private double studentRateFive = 5.00;   // loan <= 25000: rate = 5.00%
    private double studentRateSix = 4.5 ;    // loan > 25000: rate = 4.50%


    public void setLoanAmount(double loanAmount)
    {
        this.loanAmount = loanAmount;
    }

    public void setLoanOption(String loanOption) {
        this.loanOption = loanOption;
    }

    public void setTypeLoan(String typeLoan) {
        this.typeLoan = typeLoan;
    }

    public void setUsedNew(String usedNew) {
        this.usedNew = usedNew;
    }

    public void setStudentLoanType(String studentLoanType) {
        this.studentLoanType = studentLoanType;
    }

    public void setLoanTime(double loanTime) {
        this.loanTime = loanTime;
    }

    public void setIntRate(double intRate) {
        this.intRate = intRate;
    }

    public String getLoanOption() {
        return loanOption;
    }

    public String getTypeLoan() {
        return typeLoan;
    }

    public String getUsedNew() {
        return usedNew;
    }

    public String getStudentLoanType() {
        return studentLoanType;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getLoanTime() {
        return loanTime;
    }

    public double getIntRate() {
        return intRate;
    }

    public void setLoanTimeYear(double loanTimeYear) {
        this.loanTimeYear = loanTimeYear;
    }

    public double getIntTenRate() {
        return intTenRate;
    }

    public double getIntFifRate() {
        return intFifRate;
    }

    public double getIntTwentRate() {
        return intTwentRate;
    }

    public double getIntThirtrate() {
        return intThirtrate;
    }

    public double getLoanTimeNewLessThan3() {
        return loanTimeNewLessThan3;
    }

    public double getLoanTimeNewMoreThan3() {
        return loanTimeNewMoreThan3;
    }
    public double getLoanTimeUsed() {
        return loanCarUsed;
    }

    public double getLoanTimeUsedBig() {
        return loanCarUsedBig;
    }

    public double getStudentRateOne() {
        return studentRateOne;
    }

    public double getStudentRateTwo() {
        return studentRateTwo;
    }

    public double getStudentRateThree() {
        return studentRateThree;
    }

    public double getStudentRateFour() {
        return studentRateFour;
    }

    public double getStudentRateFive() {
        return studentRateFive;
    }

    public double getStudentRateSix() {
        return studentRateSix;
    }

    public void infoAboutLoan()
    {
        System.out.println("Rate is: " + intRate);
        System.out.println("Loan amount is: " + loanAmount);
        System.out.println("Loan time: " + loanTime + " months");
    }
}
