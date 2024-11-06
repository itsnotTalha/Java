import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        BankClass Newuser= new BankClass();
        Scanner input= new Scanner(System.in);
        int choice;
        double amount=0.0;
        System.out.print("Enter your name:");
        Newuser.name=input.nextLine();
        System.out.print("Enter your id:");
        Newuser.id = input.next();
        System.out.print("Enter your balance: ");
        Newuser.balance=input.nextDouble();
        System.out.print("Enter account type: ");
        Newuser.accType= input.next();

        System.out.println("Choose any one: ");
        System.out.println("1. Deposit\n2. Withdraw");
        choice= input.nextInt();

        if(choice==1){
            System.out.println("Enter amount:");
            amount=input.nextDouble();
            Newuser.deposit(amount);
        }else if(choice==2){
            System.out.println("Enter amount:");
            amount=input.nextDouble();
            Newuser.withdraw(amount);
        }

        System.out.println(Newuser.name+" your "+"Updated balance is "+Newuser.balance);
    }
}
