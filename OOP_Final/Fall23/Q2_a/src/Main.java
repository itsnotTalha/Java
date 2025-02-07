import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int count=0;
        Scanner scan = null;
        try {
            scan = new Scanner(new File("input.txt")); // Correct way to read a file
        } catch (FileNotFoundException e) {
            System.out.println("Error: input.txt not found!");
            return; // Exit program if file is missing
        }
        String s;
        if(scan!=null) {
            while (scan.hasNext()) {
                s = scan.next();
                s = s.toLowerCase();
                char str[] = s.toCharArray();
                for (int i = 0; i < s.length(); i++) {
                    if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u') {
                    }else{
                        count++;
                    }
                }
            }
        }
        PrintWriter pw = null;
        try{
            pw = new PrintWriter(new File("output.txt"));
        } catch (FileNotFoundException e) {

        }
        assert pw != null;
        pw.println(count);
        pw.close();
        scan.close();
    }
}