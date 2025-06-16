import java.io.*;
import java.util.*;

public class FileTest {

    public static void main(String[] args) {
        File inputFile = new File("src/input.txt");
        File outputFile = new File("src/output.txt");

        try (
                Scanner fileReader = new Scanner(inputFile);
                PrintWriter fileWriter = new PrintWriter(outputFile)
        ) {

            int minNumber = Integer.MAX_VALUE;

            while (fileReader.hasNext()) {
                try {
                    if (fileReader.hasNextInt()) {
                        int currentNumber = fileReader.nextInt();
                        if (currentNumber < minNumber) {
                            minNumber = currentNumber;
                        }
                    } else {
                        String s = fileReader.next();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("InputMismatchException");
                    fileReader.next();
                }
            }
            fileWriter.println(minNumber);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
