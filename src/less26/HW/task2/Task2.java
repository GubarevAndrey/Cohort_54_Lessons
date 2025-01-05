package less26.HW.task2;

import list.MyArrayList.MyArrayList;
import list.MyArrayList.MyList;

public class Task2 {
    /*
Task 2. * Опционально
Обобщенный статический метод “Печать двух списков”
Напишите обобщенный статический метод printTwoLists,
который принимает два параметра типа MyArrayList и MyArrayList, и выводит элементы обоих списков.
Требования:
Метод должен быть обобщенным по двум типам T и U.
Элементы списков могут быть разных типов.

Пример использования:
MyArrayList<String> names = new MyArrayList<>();
names.add("Alice");
names.add("Bob");

MyArrayList<Integer> scores = new MyArrayList<>();
scores.add(85);
scores.add(92);

printTwoLists(names, scores);
 */


    public static    <T,U> void  printTwoLists  (MyList<T> list1, MyList<U> list2){
          StringBuilder str1 =new StringBuilder("[");
          StringBuilder str2 =new StringBuilder("[");
          for (int i=0;i<list1.size();i++){
              str1.append(list1.get(i).toString());
              str1.append(i<list1.size()-1 ?  " ,":"]");
          }
          System.out.println("Список1:"+str1);

          for (int i=0;i<list2.size();i++){
            str1.append(list2.get(i).toString());
            str1.append(i<list2.size()-1 ?  " ,":"]");
          }
          System.out.println("Список2:"+str2);
    }
}
