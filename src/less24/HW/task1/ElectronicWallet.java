package less24.HW.task1;

public class ElectronicWallet implements PaymentSystem{
    private double sum=0;
    private String currency;
    private Calc calk;
    private PaymentSystem toMany=null;
    private String name="КОШЕЛЕК";


    public ElectronicWallet(String currency) {
        this.currency = currency;
        calk=new Calc(0,0,currency,name);
    }

    @Override
    public void withdrawMoney(double amount) {
        calk.withdrawMoney(sum,amount);
        sum=calk.getSum();
    }

    @Override
    public void depositTransfer(double amount) {
        calk.depositTransfer(sum,amount);
        sum=calk.getSum();
    }

    @Override
    public void checkBalance() {
        calk.checkBalance(this.sum);
    }

    @Override
    public void transfer(PaymentSystem toMany, double amount){
        calk.transfer(toMany,amount,sum);
        sum=calk.getSum();
    }

    public double getSum() {
        return sum;
    }

    public String getName() {
        return name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Calc getCalk() {
        return calk;
    }
}
