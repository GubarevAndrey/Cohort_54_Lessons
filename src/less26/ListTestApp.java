package less26;

import java.util.Arrays;

public class ListTestApp {
    public static void main(String[] args) {

        MyArrayList<Integer> arrayList=new MyArrayList<>();
        arrayList.add(2);

        // Если не указать параметр типа по по умолчанию будет тип Object
        MyArrayList arrayList1 = new MyArrayList<>();
        arrayList1.add("ytyt");

        // Есть золотое правило- если мы имплементируем Интерфейс то переменные с
        // которыми мы будем работать обьявляются Интерфейсного типа
        MyList <Integer>  numbers = new MyArrayList<>();
        numbers.addAll(1,2,3,4,5,6);
        System.out.println(numbers);
        System.out.println(numbers.indexOf(5));
        System.out.println(numbers.remove(0));
        System.out.println(numbers);
        System.out.println(numbers.remove(Integer.valueOf(2))); // из-за перегрузки метода и того что у нас
                                                            // на входе .remove() получился тип int нужна
                                                            //принудительная упаковка
        System.out.println(numbers);

        MyList <String> strings= new MyArrayList<>();
        strings.add("Java");
        strings.addAll("Pithon","C++","Skala","Kotlin");
        System.out.println(strings);
        strings.remove(2);
        System.out.println(strings);
        strings.remove("Skala");
        System.out.println(strings);
        strings.remove("Go");
        System.out.println(strings.remove("Go"));


        numbers.addAll(10,20,30,40,50,60,70,80,90);
        System.out.println(numbers);

        Integer [] array = numbers.toArray();
        System.out.println(Arrays.toString(array));


        /*
        Стирание типов в Java
         */
         MyList <String> strings1= new MyArrayList<>();
         strings1.add("Java");
        strings1.add("Piton");
         String volue= strings1.get(0);
         System.out.println(volue.toUpperCase());

        String[] arrayStr = strings1.toArray();
        System.out.println("массив:"+Arrays.toString(arrayStr));





    }
     /* Нельзя создавать перегрузку метода у которого входной тип Дженерик
      потому что это типы Object для компилятора
    public static void test(MyList<String> list){

    }

    public static void test(MyList<Integer> list){

    }

      */
}
