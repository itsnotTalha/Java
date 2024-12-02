public class BankAccount {
   public String bankName;
   public String accountName;
   public double balance;
   public int accountNumber;

   public BankAccount(){
       System.out.println("Welcome to the Bank Account System");
   }

   public BankAccount(int accountNumber, String accountName, double balance){
       this.accountName=accountName;
       this.accountNumber=accountNumber;
       this.balance=balance;
   }

   public void Deposit(double amount){
       balance+=amount;
       System.out.println("Deposited "+amount+" Successfully");
   }

   public void Withdraw(double amount){
       if(balance<amount){
           System.out.println("Insufficient balance.");
       }else{
           balance-=amount;
           System.out.println("Withdrawn "+amount+" Successfully ");
       }
   }

   public void Display(){
       System.out.println("Bank name: "+ bankName);
       System.out.println("Account name: "+ accountName);
       System.out.println("Account number: "+ accountNumber);
       System.out.println("Current balance: "+ balance);

   }
   public void TransferMoney(BankAccount b, double amount){
       if(balance<amount){
           System.out.println("Insufficient balance.");
       }else{
           b.balance+=amount;
           this.balance-=amount;
           System.out.println("Transferred successfully");
       }
   }
}
