import java.util.Scanner;

public class TrueFalse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ternary operator ! = Return 1 of 2 values if a condition is true

        // variable =(condition) ? ifTrue : ifFalse;

        // ---------------
        // Lets create a grade checker using old methods

        /*
        // declare variables

        // Get grade from student
        System.out.println("Enter your grade: ");
        int grade = Integer.parseInt(scanner.nextLine());

        // Check if grade is passing or not
        if(grade >= 60) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
        */

        // ---------------


        // ---------------
        // Lets use ternary method to do the same thing in half the lines of code


        // Get grade from student
        System.out.println("Enter your grade: ");
        int grade = Integer.parseInt(scanner.nextLine());

        String passOrFail = (grade >= 60) ? "PASS" : "FAIL";

        System.out.println(passOrFail);



        // ---------------

        // Lets use ternary to check if a number is even or odd
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

        System.out.println(evenOrOdd);


        scanner.close();
    }
}
