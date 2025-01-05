package less24.HW.task1;

public class Calc{
    private double sum;
    private String currency;
    private double amount;
  //  private PaymentSystem fromMany=null;
    private PaymentSystem toMany=null;
    private String name;

    public Calc(double sum, double amount,String currency,String name) {
        this.sum = sum;
        this.currency = currency;
        this.amount=amount;
        this.name=name;
    }


    public void withdrawMoney(double sum,double amount) {
        if (amount>0) {
            if (sum - amount >= 0) {
                this.sum=sum-amount;
                System.out.println("Со счета ("+name+") снята сумма: " + amount + " " + currency+ "   Сейчас на счету: "+this.sum+" "+currency);
            }else {
                System.out.println("Недостаточно денег на счету ("+name+") для снятия суммы-"+amount+" "+currency+"  У вас на счету"+this.sum+" "+currency);
            }
        } else {
            System.out.println("Некорректная сумма для снятия денег");
        }
    }


    public void depositTransfer(double sum,double amount) {
        if (amount>0) {
            this.sum=sum+amount;
            System.out.println("На счет ("+name+") внесена сумма: " + amount + " " + currency+ "   Сейчас на счету ("+name+"): "+this.sum+" "+currency);
        }else {
            System.out.println("Некорректная сумма для внесения денег");
        }
    }


    public void checkBalance(double sum) {
      //  this.sum=sum;
        System.out.println("У Вас на счету ("+name+"): "+this.sum+" "+currency);
    }

    public double getSum() {
        return this.sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public String getCurrency() {
        return this.currency;
    }

    public double getAmount() {
        return amount;
    }

    public void transfer(PaymentSystem toMany, double amount, double sum) {
        this.sum=sum-amount;
        if (toMany.getClass().getSimpleName().equals("ElectronicWallet")) {
            ElectronicWallet el = (ElectronicWallet) toMany;
            double temp=el.getSum();
            el.setSum(temp + amount);
            el.getCalk().sum=temp + amount;
            System.out.println("Со счета ("+name+") переведено на счет ("+el.getName()+") сумма:"+amount+" "+currency);
        }
        if (toMany.getClass().getSimpleName().equals("BankAccount")) {
            BankAccount ba =(BankAccount) toMany;
            double temp=ba.getSum();
            ba.setSum(temp + amount);
            ba.getCalk().sum=temp + amount;
            System.out.println("Со счета ("+name+") переведено на счет ("+ba.getName()+") сумма:"+amount+" "+currency);
        }

    }

}

