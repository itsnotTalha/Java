package Q1_b;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n,x=0;
        System.out.println("Enter Array Size: ");
        n= scan.nextInt();
        scan.nextLine();
    int [] myArray = new int[n];
        System.out.println("Enter Index Position: ");
        try{
        x = scan.nextInt();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Occurred!");
        }
        finally {
            System.out.println("Exception Handling is amazing");
        }
        try{
            myArray[x]= scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException occurred!");
        } catch (Exception e){
            System.out.println("Generic exception occurred!");
        } finally {
            System.out.println("Exception Handling is amazing");
        }

    }
}
