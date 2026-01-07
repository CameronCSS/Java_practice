import java.util.Random;
import java.util.Scanner;

public class RandomNums {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number;
        boolean isHeads;
        String choice;
        int limit;

        // loop to make sure user picks valid selection
        while (true) {
            System.out.print("Random number or coin flip? (num/coin) ");
            choice = scanner.nextLine();

            // If user chose Num
            if (choice.equals("num")) {

                // Validate numeric input
                while (true) {
                    System.out.print("Random number between 1 and what? ");
                    String input = scanner.nextLine();

                    // Catch invalid number inputs
                    try {
                        limit = Integer.parseInt(input);

                        if (limit <= 0) {
                            System.out.println("❌ Please enter a number greater than 0.\n");
                            continue;
                        }

                        break;

                    } catch (NumberFormatException e) {
                        System.out.println("❌ That's not a valid number. Try again.\n");
                    }
                }

                // Pick the random number
                number = random.nextInt(limit) + 1;
                // Print out the random number
                System.out.println("\nRandom number between 1 and " + limit +": \n" + number);
                break;
            }


            // If user chose Coin
            else if (choice.equals("coin")) {
                // Flip a coin
                isHeads = random.nextBoolean();
                // Print out the result
                if (isHeads) {
                    System.out.println("\nHeads");
                } else {
                    System.out.println("\nTails");
                }
                break;
            }

            // If the user choice was invalid. Print error
            else {
                System.out.println("Invalid choice. Please type 'num' or 'coin'.\n");
            }

        }
        scanner.close();
    }

}
