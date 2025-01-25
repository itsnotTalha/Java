import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class File {
    public static void main(String[] args) {
        PrintWriter pw;
        try{
            pw = new PrintWriter("Output.txt");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        pw.println(10);
        pw.println(10);
        pw.println(10);
        pw.println(10);
        pw.println(10);
        pw.println(10);
        pw.println(10);
        pw.println(10);
        pw.println(10);
        pw.println(10);
        pw.println(10);
        pw.println(10);

        pw.close();

        try{pw = new PrintWriter("Output.txt");}
        catch (FileNotFoundException e){

        }
        pw.println(12);
        pw.println(12);
        pw.println(12);
        pw.println(12);
        pw.println(12);

        pw.close();

    }
}
