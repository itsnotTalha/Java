import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int wheel = 1;
        Account[] user = new Account[100];
        do {
            Scanner scan = new Scanner(System.in);
            int choice;
            System.out.println("1. Create an Account");
            System.out.println("2. Search your Account");
            System.out.print("0. Exit\n :");
            choice = scan.nextInt();
            switch (choice) {
                case 0:
                    wheel = 0;
                    break;
                case 1:
                    createAcc(user, wheel - 1);
                    wheel++;
                    break;
                case 2:
                    String accID;
                    System.out.print("Enter your Account number: ");
                    accID = scan.next();
                    accSearch(user, accID);
                    break;
            }
        } while (wheel != 0);
    }

    public static void accSearch(Account[] user, String accNumber) {
        Scanner scan = new Scanner(System.in);
        int choice;
        double amount;
        for (Account x : user) {
            if (x != null && x.getID().equals(accNumber)) {
                System.out.println("Hello " + x.getName());
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Current Balance");
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter your amount: ");
                        amount = scan.nextDouble();
                        x.withdraw(amount);
                        break;
                    case 2:
                        System.out.print("Enter your amount: ");
                        amount = scan.nextDouble();
                        x.deposit(amount);
                        break;
                    case 3:
                        System.out.println("Your balance is " + x.getBalance());
                        break;
                    default:
                        System.out.println("Invalid Input");
                }
            }
        }
    }

    public static void createAcc(Account[] user, int i) {
        user[i] = new Account();
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Account number: ");
        String AccNum = scan.next();
        System.out.print("User Password: ");
        String pass = scan.next();
        System.out.print("Balance: ");
        double balance = scan.nextDouble();
        user[i].setAccount(name, AccNum, pass, balance);
    }
}