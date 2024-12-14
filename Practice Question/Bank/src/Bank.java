import java.util.Scanner;

class BankOperations {
    String accno;
    String name;
    String type;
    long balance;
    Scanner sc = new Scanner(System.in);

    //method to open new account  
    public void openAccount() {
        System.out.print("Enter Account No: ");
        accno = sc.next();
        System.out.print("Enter Account type: ");
        type = sc.next();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextLong();
    }

    //method to display account details  
    public void showAccount() {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + accno);
        System.out.println("Account type: " + type);
        System.out.println("Balance: " + balance);
    }

    //method to deposit money  
    public void deposit() {
        long amt;
        System.out.println("Enter the amount you want to deposit: ");
        amt = sc.nextLong();
        balance = balance + amt;
    }

    //method to withdraw money  
    public void withdrawal() {
        long amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );
        }
    }

    //method to search an account number  
    public boolean search(String ac_no) {
        if (accno.equals(ac_no)) {
            showAccount();
            return (true);
        }
        return (false);
    }
}

public class Bank {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many number of customers do you want to input? ");
        int n = sc.nextInt();
        BankOperations Cust[] = new BankOperations[n];
        for (int i = 0; i < Cust.length; i++) {
            Cust[i] = new BankOperations();
            Cust[i].openAccount();
        }


        int ch;
        do {
            System.out.println("\n ***Banking System Application***");
            System.out.println("1. Display all account details \n 2. Search by Account number");
            System.out.println("\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < Cust.length; i++) {
                        Cust[i].showAccount();
                    }
                    break;
                case 2:
                    System.out.print("Enter account no. you want to search: ");
                    String ac_no = sc.next();
                    boolean found = false;
                    for (int i = 0; i < Cust.length; i++) {
                        found = Cust[i].search(ac_no);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 3:
                    System.out.print("Enter Account no. : ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < Cust.length; i++) {
                        found = Cust[i].search(ac_no);
                        if (found) {
                            Cust[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account No : ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < Cust.length; i++) {
                        found = Cust[i].search(ac_no);
                        if (found) {
                            Cust[i].withdrawal();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 5:
                    System.out.println("Thank You for using !!!");
                    break;
            }
        }
        while (ch != 5);
    }
}