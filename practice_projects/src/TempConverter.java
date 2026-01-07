import java.util.Scanner;

 public class TempConverter {

     // Define methods to convert each temperature

     // Celsius to Fahrenheit
     static double celToFar(double c) { return (c * 9.0 / 5.0) + 32; }

     // Fahrenheit to Celsius
     static double farToCel(double f) { return (f - 32) * 5.0 / 9.0; }

     public static void main(String[] args){

         //  Initialize scanner to take input
         Scanner scanner = new Scanner(System.in);

         // Styled header just to make things pretty
         System.out.println("=== Welcome to the Temperature Converter ===");


         // Create a loop so we can build in error checking
         while(true) {
             // Ask user which option they want to convert
             System.out.print("Which do you want to convert? (C) or (F): ");

             // trim and convert to lower to make sure grab answer whether capitalized or not
             String choice = scanner.nextLine().trim().toLowerCase();

             if(!choice.equals("c") && !choice.equals("f") ){
                 System.out.println("Invalid Choice. Please enter C or F.");
                 continue;
             }
             // Check which option the user entered
             boolean isCelsius = choice.equals("c");
             String fromUnit = isCelsius ? "C" : "F";
             String toUnit = isCelsius ? "F" : "C";

             // Ask for a temperature to convert
             System.out.printf("Enter a temperature in %s: ", fromUnit);

             double temperature;

             // make sure a valid number is input
             try {
                 temperature = Double.parseDouble(scanner.nextLine());
             }
             catch  (NumberFormatException e) {
                 System.out.println("Invalid Temperature. Please enter a number");
                 continue;
             }

             // use ternary to convert temperature ine one line
             double newTemp = isCelsius ? celToFar(temperature) : farToCel(temperature);

             // Print out the resulting converted temperature
             System.out.printf("%.1f°%s is %.1f°%s\n", temperature, fromUnit, newTemp, toUnit);

             // Check if user wants to convert another
             System.out.print("Convert another? (y/n): ");

             // Treat anything other than a "y" as a No.
             if(!scanner.nextLine().trim().equalsIgnoreCase("y")){
                 System.out.println("\n--- Thanks for using the Temperature Converter!! ---");
                 break;
             }

         }

         // Close scanner so we dont leave resources open
        scanner.close();

     }
}
