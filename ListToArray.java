/*
 * Lists to array
 */

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(13);
        numbers.add(28);
        numbers.add(94);
        numbers.add(43);

        int[] arrayNumbers = new int[numbers.size()];

        // Populate array with contents of List
        for(int i = 0; i < numbers.size(); i++) {
            arrayNumbers[i] = numbers.get(i);
        }

        // Output contents of array
        for (int i : arrayNumbers)
            System.out.println(i);
    }

}
