package less24.HW.task1;

public interface PaymentSystem {
    void  withdrawMoney(double amount);
    void depositTransfer(double amount);
    void checkBalance();

    void transfer(PaymentSystem toMany, double amount);



}
