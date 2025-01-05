package less24.HW.task2;

public class Task2App {
    /*
    Создайте интерфейсы Swimmer и Runner с методами swim() и run() соответственно.
Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.
Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.


     */
    public static void main(String[] args) {
        Triathlete triathlete=new Triathlete("PITER");
        triathlete.run();
        triathlete.swimm();

    }


}
