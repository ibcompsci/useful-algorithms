/*
 * A program to read the contents of a CSV file.
 * Note: This feature could be used to increase the complexity of your IA solution.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static void main(String[] args) {

        String csvFile = "/Users/username/Desktop/file.csv";          // set the path of the CSV file
        String line = "";                                             // place to hold each line
        String splitBy = ",";                                         // set the delimiter (comma)

        /* Your program should be able catch the IO error if the CSV file doesn't exist. */
        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {

                String[] item = line.split(splitBy);                // Split each line using the comma

                System.out.println(item[0] + " " + item[1] + " is " + item[2] +  " years old.");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
