import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        String isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Are you a student (true/false): ");
        isStudent = scanner.nextLine();

        // Check if user entered a name
        if(name.isEmpty()){
            System.out.println("You didn't enter your name! 😡");
        }
        else{
            // Capitalize their name
            name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
            System.out.println("Hello " + name + "! 😀");
        }

        // Place user into their age group and respond accordingly
        if(age >= 65){
            System.out.println("You are a senior! 👴");
        }
        else if(age >= 18){
            System.out.println("You are an adult! 🧑");
        }
        else if(age < 0){
            System.out.println("You haven't been born yet! 👼");
        }
        else if(age == 0){
            System.out.println("You are a baby! 👶");
        }
        else{
            System.out.println("You are a child! 🧒");
        }

        // normalize the student variable
        String studentInput = isStudent.trim().toLowerCase();

        // Greet user as a student or not
        if(studentInput.equals("true") || studentInput.equals("t")){
            System.out.println("You are a student! 🏫");
        }
        else{
            System.out.println("You are NOT a student 🏢");
        }

        scanner.close();
    }
}