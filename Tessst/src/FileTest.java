import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileTest {

    public static void main(String[] args) {
        File inputFile = new File("src/input.txt");
        File outputFile = new File("src/output.txt");

        try (
                Scanner fileReader = new Scanner(inputFile);
                PrintWriter fileWriter = new PrintWriter(outputFile)
        ) {

            int minNumber = Integer.MAX_VALUE;
            boolean foundNumber = false;

            while (fileReader.hasNext()) {
                try {
                    if (fileReader.hasNextInt()) {
                        int currentNumber = fileReader.nextInt();
                        foundNumber = true;

                        if (currentNumber < minNumber) {
                            minNumber = currentNumber;
                        }
                    } else {
                        String nonIntToken = fileReader.next();
                        System.out.println("Skipping non-integer data: '" + nonIntToken + "'");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error reading an integer (InputMismatchException): " + e.getMessage());
                    fileReader.next();
                }
            }

            if (foundNumber) {
                fileWriter.println(minNumber);
                System.out.println("Successfully found the minimum number and wrote to output.txt.");
                System.out.println("The minimum number found is: " + minNumber);
            } else {
                System.out.println("No integers were found in input.txt. output.txt will be empty.");
            }

        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
