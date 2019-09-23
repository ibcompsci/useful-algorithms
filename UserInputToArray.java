/**
 * Store the user input into an array and then output the array's contents.
 */

import java.util.Scanner;

public class UserInputToArray {

    public static void main(String[] args) {

        int[] myArray = new int[5];
        Scanner in = new Scanner(System.in);

        // Get input from the user and store it in the array
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter a number: ");
            myArray[i] = in.nextInt();
        }

        // Output the contents of the array
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
