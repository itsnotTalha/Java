public abstract class Payment implements Transaction{
    double amount;
    String currency ="BDT";
    @Override
    public void give(){
        amount+=getCharge();
        amount+=getTax();
        System.out.println(currency+" "+amount+" is paid");
    }
    @Override
    public void receive() {
        System.out.println("[Nothing to receive]");
    }
    public abstract double getCharge();
    public double getTax(){
        return (amount*0.156);
     }
    }