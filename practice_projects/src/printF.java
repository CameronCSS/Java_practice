public class printF {

    public static void main(String[] args){
        String name = "Spongebob";
        char firstletter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name); // %s → formats a String

        System.out.printf("Your name starts with a %c\n", firstletter); // %c → formats a single character (char)

        System.out.printf("You are %d years old\n", age); // %d → formats an integer (decimal number)

        System.out.printf("You are %f inches tall\n", height); // %f → formats a floating-point number (double / float)

        System.out.printf("Employed: %b\n", isEmployed); // %b → formats a boolean (true / false)


        // You can include multiple format specifiers in one print statement.
        System.out.printf("%s is %d years old. He is %f inches tall\n", name, age, height);
        // IMPORTANT: The values MUST be in the same order as the format specifiers.

        double price = 9.99;
        double price2 = -19.99;
        double price3 = 19999.99;


        // You can add special characters to alter how floats are shown
        // a point '.' followed by a number specifies how many decimal places are shown
        // A '+' shows a positive sign before the number
        // // ( means that negative numbers are shown enclosed in ()
        // 'space' means display a minus if negative, and a space if positive
        // a ',' will add a comma grouping separator to the thousandths place
        System.out.printf("The price for one is $% .2f, for two is $% .2f, and for 100 is $%,.2f\n", price, price2, price3);


        // width

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);


    }
}
