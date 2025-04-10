import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
/**.
 * This is the BubbleSort class
 * This class sorts an array of integers using the bubble sort algorithm.
 * @author Tony Tran
 * @version 1.0
 * @since 2025-04-10
 */
final class BubbleSort {
    /**
     * This is a private constructor to satisfy style checker.
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private BubbleSort() {
        throw new IllegalStateException("Utility class");
    }
    /**
     * This is the main method to run the program.
     * @param args
     * @throws Exception
     */
    public static void main(final String[] args) throws Exception {
        // Create a Scanner object to read from the input file
        Scanner input = new Scanner(new File(args[0]));
        FileWriter writer = new FileWriter("output.txt");
        // Read the exchange rate from the first line of the input file
        int[] numArr = new int[5];
        // Read the amounts from the input file and convert them to an array
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = input.nextInt();
        }
        // Bubble sort the array
        for (int i = 0; i < numArr.length - 1; i++) {
            for (int j = 0; j < numArr.length - 1 - i; j++) {
                // Compare adjacent elements
                if (numArr[j] > numArr[j + 1]) {
                    // Swap the elements
                    int temp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < numArr.length; i++) {
            // Write the sorted amounts to the output file
            writer.write(numArr[i] + "\n");
        }
        // Close the scanner and writer
        input.close();
        writer.close();
    }
}
