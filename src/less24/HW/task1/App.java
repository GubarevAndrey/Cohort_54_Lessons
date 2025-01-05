package less24.HW.task1;

public class App {
    public static void main(String[] args) {
        /*
        Платежные системы
Создайте интерфейс PaymentSystem с методами:
withdrawMoney(double amount) (снятие со счета) - списываются деньги со счета
depositTransfer(double amount) (поступление денег на счет);
checkBalance() (остаток на счете).
Напишите классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.
Банк предоставляет счета, например, в евро, а электронный кошелек в другой валюте
Убедитесь, что каждый класс корректно выполняет каждую из операций.

        Опционально:
        Добавить в Интерфейс метод (перевод средств на другой счет)
        Должна быть возможность перевода между классами:
        Банк-Банк
        Банк-Кошелек
        Кошелек-Банк
        Кошелек-Кошелек
*/

    //    ElectronicWallet electronicWallet=new ElectronicWallet(20,0,"DOLLAR");
        BankAccount bankAccount = new BankAccount("EURO");
        ElectronicWallet electronicWallet = new ElectronicWallet("DOLLAR");
        PaymentSystem[] paymentSystem = new PaymentSystem[2];
        paymentSystem[0]=bankAccount;
        paymentSystem[1]=electronicWallet;

        paymentSystem[0].checkBalance();
        paymentSystem[1].checkBalance();

        paymentSystem[0].depositTransfer(100);
        paymentSystem[1].depositTransfer(250);

        paymentSystem[0].withdrawMoney(10);
        paymentSystem[1].withdrawMoney(20);

        paymentSystem[0].checkBalance();
        paymentSystem[1].checkBalance();
        paymentSystem[0].transfer(paymentSystem[1],50);
        paymentSystem[0].checkBalance();
        paymentSystem[1].checkBalance();
        paymentSystem[1].transfer(paymentSystem[0],30);
        paymentSystem[0].checkBalance();
        paymentSystem[1].checkBalance();



    }
}
