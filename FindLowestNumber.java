/**
 * Find the lowest number in an array.
 */

public class FindLowestNumber {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 1};
        int minNum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNum) {
                minNum = numbers[i];
            }
        }
        System.out.println("The lowest number is " + minNum);
    }
}
