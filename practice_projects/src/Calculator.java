import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double result;

        // take users first number
        System.out.print("Enter the first number: ");

        // grab both the number and a COPY of the number for Clean OUTPUT
        String num1Input = scanner.nextLine().trim();
        double num1 = Double.parseDouble(num1Input);

        // Get the operator from the user
        System.out.print("Enter the operator (+, -, *, /, ^): ");
        char operator = scanner.nextLine().trim().charAt(0);

        // take users second number
        System.out.print("Enter the second number: ");

        // grab both the number and a COPY of the number for Clean OUTPUT
        String num2Input = scanner.nextLine().trim();
        double num2 = Double.parseDouble(num2Input);

        // Switch to process the operator and do the appropriate math
        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '^' -> result = Math.pow(num1, num2);
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Cannot divide by zero!");
                    return;
                }
                else {
                    result = num1 / num2;
                }
            }
            // Error catch if user entered something else
            default -> {
                System.out.println("Invalid operator!");
                scanner.close();
                return;
            }
        }

        // Print out the result
        // Use the String copies of the numbers to get clean output exactly as user entered them
        System.out.printf("%s %c %s = %.2f", num1Input, operator, num2Input, result);

        scanner.close();

    }
}
