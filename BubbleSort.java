/**
 * Sort an unsorted array using Bubble Sort.
 */

public class BubbleSort {

    public static void main(String[] args) {

        int[] numbers = {22, 10, 91, 67, 3, 36, 115, 282, 9, 18, 1};

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 0; j < numbers.length-i-1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        // Output the contents of the sorted array
        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);

        }
    }
}
