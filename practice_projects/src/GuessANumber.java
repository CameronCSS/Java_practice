import java.util.Scanner;
import java.util.Random;

public class GuessANumber {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Intro at top of screen
        System.out.println("=== !! NUMBER GUESSING GAME !! ===");
        System.out.println("Guess a number between 1-100");
        System.out.println("--- You have 10 guesses --- ");

        // have computer pick a random number 1-100
        Random random = new Random();
        int number = random.nextInt(1, 101); // end range is not included. so we use 101

        // Declare guess so we can use it for our while loop
        int guess = 0;
        int chances = 10; // Only give them 10 chances to guess it

        // While logic to process guesses
        while(guess != number){
            System.out.print("\nEnter a guess: ");
            guess = scanner.nextInt();

            // because of how I structured the counting when the user reaches 1 chance left they lost.
            if(chances == 1){
                System.out.println("\n####### YOU LOSE!!! #######");
                System.out.println("--- The number was [ " + number + " ] ---");
                break;
            } else if(guess > number){
                System.out.println("\nTOO HIGH. Try again");
                chances--;
                System.out.println("-- " + chances + " guesses remaining. --");
                continue;
            } else if(guess < number){
                System.out.println("\nTOO LOW. Try again");
                chances--;
                System.out.println("-- " + chances + " guesses remaining. --");
                continue;
            } else {
                // Winner message with the correct number
                System.out.println("---------------------------------------");
                System.out.println("\n***** WINNER * WINNER * WINNER *****");
                System.out.println("********* YOU GUESSED IT! ********* \n");
                System.out.println("\n-----  The number was [ " + number + " ] -----");
                System.out.println(" -- You had " + chances + " guesses remaining --");
            }
        }




        scanner.close();

    }
}
