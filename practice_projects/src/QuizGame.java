import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // This is a quiz game using 2D arrays (Nested arrays)

        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");
        System.out.println();

        // Variables
        char[] answers = {'A', 'B', 'C', 'C', 'C'};
        int score = 0;
        char guess;

        String[] questions = {
                "What keyword is used to create a class in Java?",
                "Which data type is used to store true or false values?",
                "Which of the following is NOT a primitive data type in Java?",
                "Which symbol is used to end a statement in Java?",
                "Which keyword is used to inherit a class in Java?"
        };

        String[][] options = {
                {"A. class", "B. new", "C. create", "D. object"},
                {"A. int", "B. boolean", "C. String", "D. char"},
                {"A. int", "B. double", "C. String", "D. boolean"},
                {"A. :", "B. .", "C. ;", "D. ,"},
                {"A. implements", "B. inherits", "C. extends", "D. super"}
        };



        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.next().toUpperCase().charAt(0);

            if(guess == answers[i]){
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                score++;
            }
            else {
                System.out.println("********");
                System.out.println("WRONG!");
                System.out.println("********");
            }
        }

        System.out.println("Your final Score is: " + score + " out of " + questions.length);

        scanner.close();

    }
}
