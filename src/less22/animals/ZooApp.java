package less22.animals;
/*
  Два вида полиморфизма:
  1. Статический полиморфизм(полиморфизм времени компиляции)
     достигается с помощью перегрузки методов. В рамках
     одного класса существует несколько методив с одинаковым
     именем но с разным набором параметров.
     (method overloading)
  2. Динамический полиморфизм-полиморфизм времени
     выполнения- достигается переопределениями методов
     (method overriding) Переопределение методов
      происходит когда подкласс (потомок)
     предоставляет специфическую реализацию метода, который уже
     переопределен в его супер-классе(родителе)
 */

/*
  В Java есть class Object
  Класс, от которого наследуются все классы Java
  Когда класс не расширяют явно в другой класс, он неявно
  наследуется от класса Object
  Например в классе Animal вместо
  public class Animal  можно написать
  public class Animal extends Object . Это будет
  то же самое
  Object является корнем иерархии классов
  Любой класс неявно наследуется от класса Object, если
  не указанно иное(когда класс не расширяет другой класс)

 */
public class ZooApp {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.eat();
        cat.voice();

        Dog dog = new Dog();
        dog.voice();
        System.out.println(dog.toString());

        Hamster hamster=new Hamster();
        hamster.voice();
        /*
        Из-за того что все обьекты созданы от главного
        класса Object (а у этого класса есть toString)
        то у всех обьектов есть метод toString
         */
        System.out.println(hamster.toString());
        System.out.println(hamster);// это то же самое
             // потому что у Object есть toString и при
             // печати Java сама вызывает этот метод
             // поэтому писать
            // System.out.println(hamster.toString());
            // это переизбыточно





    }
}
