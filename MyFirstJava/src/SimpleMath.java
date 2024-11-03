import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, result = 0;
        double C, D, result2 = 0.0;

        System.out.println("Enter two int num: ");
        A = input.nextInt();
        B = input.nextInt();
        result = A + B;
        System.out.println("Sum of A and B is: " + result);
        result = A - B;
        System.out.println("Subtraction of A and B is: " + result);
        result = A * B;
        System.out.println("Multiplication of A and B is: " + result);
        result = A / B;
        System.out.println("Division of A and B is: " + result);

        System.out.println("Enter two double value: ");
        C = input.nextDouble();
        D = input.nextDouble();
        result2 = C + D;
        System.out.println("Sum of C and D is: " + result2);
        result2 = C - D;
        System.out.println("Sub of C and D is: " + result2);
        result2 = C * D;
        System.out.println("Multiplication of C and D is: " + result2);
        result2 = C / D;
        System.out.println("Division of C and D is: " + result2);

    }
}
