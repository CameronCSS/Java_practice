import java.util.Scanner;

public class compoundInterest {

    public static void main(String[] args) {

        // Compound interest calculator

        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        // get inputs
        System.out.print("Enter the principal amount: ");
        principal = Double.valueOf(scanner.nextLine());

        System.out.print("Enter the interest rate (in %): ");
        rate = Double.valueOf(scanner.nextLine()) / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter the # of years: ");
        years = Integer.valueOf(scanner.nextLine());

        // Calculate the compound interest
        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        // Print out the results
        System.out.printf("\nThe amount after %d years is: $ %.2f", years, amount);



        scanner.close();


    }
}
