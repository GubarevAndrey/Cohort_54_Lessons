package less24.flyers;

/*
В Интерфейсе есть поддержка множественной реализации
Это значит что класс может реализовывать любое
кол-во Интерфейсов. Это позволяет частично обойти
множественное наследование
 */
public class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swimm() {
        System.out.println("Duck is swimming");
    }
}
