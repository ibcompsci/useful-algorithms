/**
 * Calculate the average number.
 */
 
public class CalculateAverage {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        double averageNum = 0;

        for (int i = 0; i < numbers.length; i++) {
            averageNum = averageNum + numbers[i];
        }
        averageNum = averageNum/numbers.length;
        System.out.println("The average number is " + averageNum);
    }    
}
