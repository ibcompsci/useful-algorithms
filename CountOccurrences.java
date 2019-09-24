/**
 * Count the number of occurrences of a number 
 */

public class CountOccurrences {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10};
        final int chosenNum = 5;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) { 
            if (numbers[i] == chosenNum) { 
                count++;
            }
        }
        System.out.println("There is " + count + " occurrences of the number " + chosenNum + " in the array.");
    }
}
