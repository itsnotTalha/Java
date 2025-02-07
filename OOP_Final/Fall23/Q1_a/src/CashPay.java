public class CashPay extends Payment{
    public double getCharge() {
        return 0;
    }
}
class CreditCardPay extends Payment{
    @Override
    public double getCharge() {
        return super.amount*0.025;
    }
}
class CheckPay extends Payment{
    @Override
    public double getCharge() {
        return 10;
    }
}