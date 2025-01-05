package less26.HW.task2;

import less26.MyArrayList;
import less26.MyList;

public class task2App {
    public static void main (String[] args) {


        MyList <String> name = new MyArrayList<>();
        name.addAll("Peter","Alice","John","Bob");

        MyList <Integer> score = new MyArrayList<>();
        score.addAll(23,24,25,26);

  //      Task2.printTwoLists(name,score);

     //   task2.printTwoLists(name,score);

    }


  /*  public static  void  printTwoLists (MyList<?> list1,MyList<?> list2){
        StringBuilder str1 =new StringBuilder("[");
        StringBuilder str2 =new StringBuilder("[");
        for (int i=0;i<list1.size();i++){
            str1.append(list1.get(i).toString());
            str1.append(i<list1.size()-1 ?  " ,":"]");
        }
        System.out.println("Список1:"+str1);

        for (int i=0;i<list2.size();i++){
            str2.append(list2.get(i).toString());
            str2.append(i<list2.size()-1 ?  " ,":"]");
        }
        System.out.println("Список2:"+str2);
    }*/
}
