import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A;
        double B;
        String C, D;

        System.out.print("Enter an int value: ");
        A = input.nextInt();
        System.out.print("Enter a double value: ");
        B = input.nextDouble();
        System.out.print("Enter a string:  ");
        C = input.next();
        //To eat buffer \n from previous line
        input.nextLine();
        System.out.print("Enter a string:  ");
        D = input.nextLine();

        System.out.println("Int value is: " + A);
        System.out.println("Double value is: " + B);
        System.out.println("First string: " + C);
        System.out.println("Second string: " + D);
    }
}
