import java.util.Scanner;

public class Substrings {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        // .substring() is a method used to extract a portion of a string.
        // You use it by giving a start and end position.
        // Example: string.substring(start, end)

        while (true) {
            // Have user enter their email
            System.out.print("Enter an email: ");
            String email = scanner.nextLine();

            // Check if its a valid email (Contains @ symbol)
            if(email.contains("@")){
                // find the index position of the @ symbol
                int index = email.indexOf("@");

                // find the domain address of their email
                String domain = email.substring(index + 1);

                String username = email.substring(0, index);

                System.out.println("Your username is " + username);
                System.out.println("Your email domain is " + domain);
                break;

            } else {
                System.out.println("Please enter a valid email address!\n");
                continue;
            }
        }

        scanner.close();

    }
}
