class Bank {
    String bankname;
    String accountNumber;
    double balance;

    public Bank(String bankname) {
        this.bankname = bankname;
    }

    public double discount(double amount) {
        return amount - (amount * 0.2);
    }
}

class Student extends Bank {
    String name;

    public Student(String name) {
        super(name);
    }

    public void purchase(double amount) {
        System.out.println("Amount after student discount: " + super.discount(amount));
    }

    public void display() {
        System.out.println("Bank name: " + super.bankname);
        System.out.println("User name: " + name);
        System.out.println("Balance: " + super.balance);
    }
}

class General extends Bank {
    String name;

    public General(String name) {
        super(name);
    }

    public void purchase(double amount) {
        System.out.println("Purchase amount: " + amount);
    }

    public void display() {
        System.out.println("Bank name: " + super.bankname);
        System.out.println("User name: " + name);
        System.out.println("Balance: " + super.balance);
    }
}