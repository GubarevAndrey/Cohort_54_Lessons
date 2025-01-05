package less27;

import list.MyArrayList.MyArrayList;
import list.MyArrayList.MyList;

import java.util.Iterator;

public class ForEachExample {
    public static void main(String[] args) {

        MyList<String> list = new MyArrayList<>();

        list.add("Hallo");
        list.add("World");
        list.add("Java");
        list.add("Python");
        Iterator<String> iterator=list.iterator();
        while ( iterator.hasNext()) {
            String s=iterator.next();
            System.out.println(s);
        }
        /* Чтобы не писать
           while ( iterator.hasNext()) {
            String s=iterator.next();
           }
        можно тоже самое написать по другому (так называемы синтаксический сахар)
         Цикл forEach. Его синтаксис:
         коллекция- то что перебираем

          for (ТипПеременной переменная: коллекция) {
          Действия с переменной
          }
          Этот цикл при компиляции делает то же самое что и while(iterator.hasNext())
         */
        System.out.println("===========");
        for(String str:list) {
            System.out.println(str);
        }

        System.out.println("===========");
        MyList<Integer> element=new MyArrayList<>();
        element.addAll(1,2,2,3,4,5,6);
        for(Integer integer:element) {
            System.out.println(integer);
        }




    }
}
