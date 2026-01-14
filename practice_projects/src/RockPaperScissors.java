import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args){

        // This is a Rock Paper Scissors game
        // User VS the Computer
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        String playerChoice;
        String cpuChoice;
        boolean playing = true;
        int wins =0;
        int losses =0;
        int ties = 0;

        while(playing){
            System.out.println("Enter your move (Rock, Paper, Scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();
            cpuChoice = choices[random.nextInt(3)];

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors") ){
                System.out.println("Invalid choice");
                continue;
            }
            else{
                System.out.println("Computer chose: " + cpuChoice);
            }

            if(cpuChoice.equals(playerChoice)){
                System.out.println("Tie");
                ties += 1;
            }
            else if((cpuChoice.equals("rock") && playerChoice.equals("paper")) ||
                    (cpuChoice.equals("paper") && playerChoice.equals("scissors")) ||
                    (cpuChoice.equals("scissors") && playerChoice.equals("rock"))) {

                System.out.println("\nYou win!");
                wins += 1;
            }
            else {
                System.out.println("\nYou LOSE!");
                losses += 1;
            }

            System.out.println("\nPlay again!? (yes/no)");
            String input = scanner.nextLine().toLowerCase();

            // Takes any input as yes. only a direct "no" exits
            if(input.equals("no")){
                playing = false;
            }
        }

        System.out.println("***************");
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Ties: " + ties);
        System.out.println("***************");
        System.out.println("Thanks for playing!!");


        scanner.close();
    }
}
