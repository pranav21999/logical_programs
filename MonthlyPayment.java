package logical_programs;

public class MonthlyPayment {

    //main method
    public static void main(String[] args) {

        System.out.println("Enter the Principal Amount : ");
        double principalAmount = Utility.getuserDouble();

        System.out.println("Enter the number of Years : ");
        double numberOfYears = Utility.getuserDouble();

        System.out.println("Enter the rate of interest : ");
        double rateOfInterest = Utility.getuserDouble();

        double amount = monthlyPayment(principalAmount, numberOfYears, rateOfInterest);
        System.out.println("The monthly payment is of Rs " + amount + " /-");
    }

    // returns monthly payment to pay for 'y' years
    public static double monthlyPayment(double p, double y, double R) {

        //formula for compounding the monthly amount
        double n = 12 * y;
        double r = R / (12 * 100);
        double payment = (p * r) / (1 - Math.pow(1 + r, -n));

        return payment;
    }
}