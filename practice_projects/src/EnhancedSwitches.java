import java.util.Scanner;

public class EnhancedSwitches {

    public static void main(String[] args){

        // Enhanced swich = A replacement to using multiple else if statements
        //          (Introduced in Java14)

        // Lets make a simple day checker that reports if it is a weekend or a weekday

        Scanner scanner = new Scanner(System.in);

        // Ask user for day of the week
        System.out.println("What day is it today?? (Mon, Tue, etc.)?? ");

        // normalize the input so we can test it easier
        String day = scanner.nextLine().trim().toLowerCase().substring(0, 3);

        //
        switch(day){
            case "mon", "tue", "wed", "thu", "fri" -> System.out.println("It is a weekday 😫");
            case "sat", "sun" -> System.out.println("It is a weekend 😁!");
            default -> System.out.println("Invalid day");
        }




        scanner.close();
    }
}
