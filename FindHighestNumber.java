/**
 * Find the highest number in an array.
 */

public class FindHighestNumber {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 60, 40, 50};
        int maxNum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
            }
        }
        System.out.println("The highest number is " + maxNum);
    }
}
