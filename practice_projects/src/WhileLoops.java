import java.util.Scanner;

public class WhileLoops {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name = "";

        // Get users name
        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }



        // get users age
        int age = 0;

        do{
            System.out.println("Enter your age: ");
            System.out.println("(Your age can't be negative)");
            age = scanner.nextInt();

        }while(age < 0);

        // Greet them
        System.out.printf("Hello %s. You are %d years old!\n", name, age);


        // ask a user to enter a number between 1 - 10;
        int number = 0;
        do{
            System.out.print("Enter a number between 1-10: ");
            number = scanner.nextInt();


        } while(number < 1 || number > 10);

        System.out.printf("Wow %s. You picked %d", name, number);

        scanner.close();
    }
}
