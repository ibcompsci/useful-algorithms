/**
 * Find a name in an array and count how many times it appears.
 */

public class FindName {

    public static void main(String[] args) {

        String[] numbers = {"Breyton", "Marta", "Marco", "Luis", "Juliana", "Maria", "Marco"};
        final String chosenName = "Marco";
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].equals(chosenName)) {
                count++;
            }
        }
        System.out.println("The name " + chosenName + " has been located in the array " + count + " time(s).");
    }
}
