public class Numpad {

    public static void main(String[] args){
        // This project is to show how to use 2D Arrays
        // a.k.a. Nested arrays (an array of arrays)

        // 2D arrays are useful for storing a matrix of data.


        // Remember - Characters are single quotes 'C'
        char[][] numpad = {{'1', '2', '3'},
                            {'4', '5', '6'},
                            {'7', '8', '9'},
                            {'*', '0', '#'}};

        // We need nested loops to print columns and rows
        for(char[] row : numpad){
            for(char number : row){
                System.out.print(number + " ");
            }
            // Between every row add an empty line
            System.out.println();
        }
    }
}
