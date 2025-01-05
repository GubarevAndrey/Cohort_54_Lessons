package less24.interfaces;

/* Интерфейс может расширять другой интерфейс с помощью
* ключевого слова extends
* Дочерний Интерфейс наследует все методы родительского Интерфейса
* и может добавить новые методы*/
public interface ColorPrintable extends Printable{
    void colorPrint();


    /*Если в Итерфейсе ColorPrintable (он наследуется от
    Интерфейса Printable) создать метод  void  defaulMethod (),
    а он был в родительском методе как default void defaulMethod ()
    то наследование default от родительского Интерфейса отменяется
    и появляется обязательная реализация в классе как обычного
    метода    */
   // void  defaulMethod ();



}
