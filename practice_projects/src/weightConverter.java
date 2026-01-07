import java.util.Scanner;

public class weightConverter {

    public static void main(String[] args) {

        // Weight conversion program
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        String choice;
        int weight;
        double converted;

        // Welcome message
        System.out.println("Welcome to the weight converter!\n");

        // Prompt for user choice
        System.out.println("Choose: ");
        System.out.println("Option 1 Lbs -> Kgs (1)");
        System.out.println("Option 2 Kgs -> Lbs (2)\n");

        choice = scanner.nextLine();

        // option 1 convert lbs tp kgs
        if (choice.equals("1")){

            // get the weight input from user
            System.out.println("Enter the weight in lbs: ");
            weight = Integer.parseInt(scanner.nextLine());

            // convert the weight and print out the result
            converted = (weight * 1.0 / 2.205);
            System.out.printf("%d lbs is %.2f kgs.", weight, converted);



        } // option 2 convert kgs to lbs
        else if(choice.equals("2")){

            // get the weight input from user
            System.out.println("Enter the weight in kgs: ");
            weight = Integer.parseInt(scanner.nextLine());

            // convert the weight and print out the result
            converted = (weight * 1.0 *  2.205);
            System.out.printf("%d kgs is %.2f lbs.", weight, converted);


        } //else print not a valid choice
        else {
            System.out.println("Not a valid choice. Try again");
        }

        scanner.close();


    }
}
