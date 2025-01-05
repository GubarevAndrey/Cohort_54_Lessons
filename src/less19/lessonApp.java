package less19;

import java.util.Collection;
import java.util.Locale;

public class lessonApp {
    public static void main(String[] args) {
        ConstantDemo demo = new ConstantDemo(10);

    /* Константа- для оределения
     нужно к полу класса добавить static final
     Константа- статическое финальное поле , значение которого
     не изменяется
     Константа-переменная, которую не могут изменить ни один обьект
     класса
     Константой могут быть- примитивы, строки, неизменямые типы данных

*/
     String text="Hello";
     text=text.toUpperCase();

  //   final String text="Hello";
  //   text=text.toUpperCase(); таз переприсвоить нельзя
      System.out.println(ConstantDemo.COUNTRY);
        System.out.println(demo.COUNTRY);

    }
}
