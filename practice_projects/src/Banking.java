import java.util.Scanner;

public class Banking {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        double balance = 0.00;
        boolean isRunning = true;

        while(isRunning) {
            System.out.println("");
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> balance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }

        System.out.println("***************");
        System.out.println("Have a nice day!");
        System.out.println("***************");

        scanner.close();


    }

    static void balance(double balance){
        System.out.println("***************");
        System.out.printf("$%.2f\n", balance);
    }

    static double deposit(){
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative! ");
            return 0;
        } else {
            return amount;
        }

    }

    static double withdraw(double balance){
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative! ");
            return 0;
        } else if (amount > balance){
            System.out.println("INSUFFICIENT FUNDS!");
            return 0;
        } else {
            return amount;
        }
    }

}
