public class BankClass {
    String name;
    String id;
    String accType;
    double balance;

    public void withdraw(double amount){
        if (amount<balance){
            balance-=amount;
        System.out.println("Action Successful");
        }else {
            System.out.println("Not enough balance");
        }
    }
    public void deposit( double amount){
        balance+=amount;
        System.out.println("Added succesfully");
    }
}
