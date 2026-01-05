import java.util.Scanner;

public class shoppingCart {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Declare variables
        String item;
        double price;
        int quantity;
        double total;

        // Get item from User
        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        // Get price from User
        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        // Get quantity from User
        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        // Calculate total
        total = price * quantity;


        // Print out their order
        // Check if one item or more to give correct print statement
        if (quantity == 1) {
            System.out.println("\nYou have bought " + quantity + " " + item);
        }
        else {
            System.out.println("You have bought " + quantity + " " + item + "s");
        }

        // Print their total
        System.out.println("Your total is $" + total);

        scanner.close();
    }
}
