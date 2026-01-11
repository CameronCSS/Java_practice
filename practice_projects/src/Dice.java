import java.util.Scanner;
import java.util.Random;

public class Dice {

    static Random random = new Random();

    // JAVA DICE ROLLER PROGRAM

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOfDice;
        int total;

        System.out.println("**************************");
        System.out.println("WELCOME TO THE DICE ROLLER");
        System.out.println("**************************");
        System.out.println("Enter the # of dice to roll: ");
        numOfDice = scanner.nextInt();

        if(numOfDice <= 0){
            System.out.print("# of dice must be more than 0!");
        } else {
            int[] rolls = rollDice(numOfDice);
            total = calcTotal(rolls);
            printTotal(total);
        }

        scanner.close();
    }

    static int[] rollDice(int numOfDice){

        int[] rolls = new int[numOfDice];

        for(int i = 0; i < numOfDice; i++){
            int roll = random.nextInt(1, 7);
            rolls[i] = roll;
            printDie(roll);
            System.out.println("You rolled: " + roll);
        }

        return rolls;
    }

    static int calcTotal(int[] rolls){
        int total = 0;
        System.out.print("\nDice rolled: ");
        for(int roll : rolls){
            System.out.print("[ " + roll + " ]");
            total+= roll;
        }

        return total;
    }

    static void printDie(int roll){

            String dice1 = """
                     -------
                    |       |
                    |   ●   |
                    |       |
                     -------
                    """;

            String dice2 = """
                     -------
                    | ●     |
                    |       |
                    |     ● |
                     -------
                    """;

            String dice3 = """
                     -------
                    | ●     |
                    |   ●   |
                    |     ● |
                     -------
                    """;

            String dice4 = """
                     -------
                    | ●   ● |
                    |       |
                    | ●   ● |
                     -------
                    """;

            String dice5 = """
                     -------
                    | ●   ● |
                    |   ●   |
                    | ●   ● |
                     -------
                    """;

            String dice6 = """
                     -------
                    | ●   ● |
                    | ●   ● |
                    | ●   ● |
                     -------
                    """;

            switch (roll) {
                case 1 -> System.out.print(dice1);
                case 2 -> System.out.print(dice2);
                case 3 -> System.out.print(dice3);
                case 4 -> System.out.print(dice4);
                case 5 -> System.out.print(dice5);
                case 6 -> System.out.print(dice6);
                default -> System.out.print("Invalid roll");
            }
        }

    static void printTotal(int total){
        System.out.println("\nTotal: " + total);
    }

}
