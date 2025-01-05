package less26.methods;

import less26.MyList;

public class UtilsGeneric {

    // Метод, возвращающий строковое представление массива

    //Параметризированный метод в обычном классе
    public static <T> String printArray(T[] array){
        if(array==null || array.length==0) {
            return "[]";
        }
        StringBuilder sb=new StringBuilder("[");
        for(int i=0;i< array.length;i++){
            sb.append(array[i]);
            sb.append(i<array.length-1 ? ", ":"]");
        }
        return sb.toString();
    }


    /* Метод, меняющий местами два элемента в массиве любого типа по индексам
    * */
    public static <T> void swap(T[] array, int idx1, int idx2) {
        T temp=array[idx2];
        array[idx2]=array[idx1];
        array[idx1]=temp;
    }


    /*Ограничение типов параметров метода
    * Написать метод, который считает сумму всех элементов массива
    *  Огрничение сверху Upper Bound
    *  Тип T должен быть либо классом Х либо его потомков
    * <T extends X>  Для чилел класс Number является родителем всех
    * числовых типов оберток */
    public static <T extends Number> double sum(T[] array){
        double sum=0;
        for (int i=0;i< array.length;i++){
            T element=array[i];
            sum=sum+element.doubleValue();
        }
        return sum;
    }



    // Метод, который принимает массив MyList только с элементами
    // типа Number или его наследника. Сам метод не будет Generic
    //(MyList<? extends Number> list)  - мы работаем с неизвестным типом
    // но который является наследником Number
    public static double listSum(MyList<? extends Number> list) {
        double sum=0;
        for(int i=0; i<list.size();i++) {
            sum=sum+list.get(i).doubleValue();
        }
        return sum;
    }



    /* Ограничения снизу  Lower Bounds   - мы работаем с неизвестным типом,
    * который является классом X или его родителем (Супер-классом)
    * (MyList<? super Integer> list) - метод принимает MyList с элементами
    * типа Integer или его предками
    * Это означает что сюда могу прийти элементы типа
    * Integer, Number или Object     */

    public static void addNumbers(MyList<? super Integer> list){
        for(int i=0;i<5;i++){
            list.add(i);
        }
    }

    /*PEGS
    Producer Extends, Consumer Super
    Производитель если мы только поставляем данные (мы их читает то extends,
    Потребитель (коллекция потребляет данные и записывает)- super.
    Extends- цель безопасно читать из нашего обьекта
    Super- цель безопасно записывать в коллекцию
     */

}
