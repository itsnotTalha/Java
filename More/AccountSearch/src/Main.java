import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter number of user: ");
        n = scan.nextInt();
        BankAcc[] acc = new BankAcc[n];

        for (int i = 0; i < n; i++) {
            acc[i] = new BankAcc();
            System.out.println("Info for user " + (i + 1) + " :");
            scan.nextLine();
            System.out.print("Name: ");
            acc[i].name = scan.nextLine();
            System.out.print("User ID: ");
            acc[i].AccNum = scan.next();
            System.out.print("Balance: ");
            acc[i].balance = scan.nextDouble();
        }

        System.out.println("Displaying information using index number-");
        int id;
        System.out.println("Enter Your index number: ");
        id = scan.nextInt();

        System.out.println("Info of user " + id + " :");
        acc[id-1].display();

        System.out.println("Displaying information using account number number-");
        String aID;
        System.out.println("Enter your account number: ");
        aID = scan.next();
        for (int i = 0; i < n; i++) {
            if (aID.equals(acc[i].AccNum)) {
                acc[i].display();
            }
        }
    }
}