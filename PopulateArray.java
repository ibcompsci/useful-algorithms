/**
 * Program that populates an array with random numbers
 */

import java.util.*;

public class PopulateArray {

    public static void main(String[] args) {

        int[] myArray = new int[10];
        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
            System.out.println(myArray[i]);
        }
    }
}
