import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount(101, "Small Account", 10000);
        double deposit;
        System.out.println("Amount for Deposit:");
        deposit= scan.nextDouble();
        b2.Deposit(deposit);
        b2.Display();
        double withdraw;
        System.out.println("Amount for Withdraw:");
        withdraw= scan.nextDouble();
        b2.Withdraw(withdraw);
        b2.Display();

        double transfer=0.0 ;
        System.out.println("Amount to transfer");
        transfer= scan.nextDouble();
        b2.TransferMoney(b1, transfer);
        b2.Display();
        System.out.println("Information of b1: ");
        b1.Display();
    }
}
