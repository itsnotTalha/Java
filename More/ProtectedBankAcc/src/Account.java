import java.util.Scanner;

public class Account {
    private String name;
    private String id;
    private String password;
    private double balance;

    public boolean checkPass() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your password: ");
        String pass = scan.next();
        if (pass.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        if (checkPass()) {
            return balance;
        } else {
            throw new SecurityException("Access denied: Incorrect password.");
        }
    }

    public void setAccount(String name, String id, String password, double balance) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.balance = balance;
        System.out.println("Account created successfully.");
    }

    public void withdraw(double amount) {
        if (checkPass()) {
            if (amount < balance) {
                balance -= amount;
                System.out.println("Action Successful");
            } else {
                System.out.println("Not enough balance");
            }
        }
    }

    public void deposit(double amount) {
        if (checkPass()) {
            balance += amount;
            System.out.println("Added succesfully");
        }
    }
}
