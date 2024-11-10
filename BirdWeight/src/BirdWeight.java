import java.util.*;

public class BirdWeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter birds amount: ");
        int n = input.nextInt();
        Bird[] bird = new Bird[n];

        for (int i = 0; i < n; i++) {
            bird[i] = new Bird();
            System.out.print("Enter bird " + (i + 1) + " type: ");
            bird[i].type = input.next();
            System.out.print("Enter bird " + (i + 1) + " age: ");
            bird[i].age = input.nextDouble();
            System.out.print("Enter the value of C and D for Bird " + (i + 1) + " :");
            bird[i].getWeight(input.nextDouble(), input.nextDouble());
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Info of Bird " + (i + 1) + " :");
            System.out.println("Name: " + bird[i].type);
            System.out.println("Age: " + bird[i].age);
            System.out.println("Weight: " + bird[i].weight);

        }
    }
}
