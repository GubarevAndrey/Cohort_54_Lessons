package less25.generics;

public class Wrappers {
    public static void main(String[] args) {
        /* Есть Классы-обертки, которые используются Java для
        представления примитивных типов как обьектов (ссылочных
        типов данных). Для каждого примитива есть свой тип обертки
        byte  - пит обертки -> Byte
        short - пит обертки -> Short
        int   - пит обертки ->Integer
        long -  пит обертки -> Long
        float - пит обертки ->Float
        double - пит обертки ->Double
        char- пит обертки ->Character
        boolean- пит обертки ->Boolean

        Обертки- ссылочный тип данных. Они могут быть null
        Есть автоматическое приведение типов- автоупаковка и автораспаковка
         */
        Integer wrapperInt=5;// число 5 это int. Автоупаковка примитива int в ссылочный Integer.
        System.out.println(wrapperInt);

        int primitivInt=wrapperInt; // Автораспаковка. Ссылочный тип данных распаковывается, из него вытаскивается
                                    // значение и помещается в примтитивный тип данных
        System.out.println(primitivInt);

        int maxValue=Integer.MAX_VALUE;
        int minValue=Integer.MIN_VALUE;




        /* Особенности сравнения классов-оберток */
        //ПулСтрук
        String str1="Hello";// После создания строки "Hello" в str1 передастся ссылка на нее. Если при
        String str2="Hello"; // создании str2 строка такая же то Java не будет создавать новый обьект
        // а присвоит str2 ссылку от str1
        System.out.println(str1==str2); // true
        String str3= new String("Hello"); // в этом случае будет создано новый обьект с такой же строкой
        System.out.println(str1==str3); // false

        /* Для значений в диапазоне типа Byte включительно от -128 до 127
        * применяется кэширование обьектов. Т.е. если был создан обьект с номером в этом диапазоне
        * то при создании нового обьекта с таким же значением java не создает новый обьект а
        * записывает эту же ссылку на новый обьект
        *  */


        Integer a=127;//создан новый обьект
        Integer b=127;//не создан новый обьект а записана ссылка на первый обьект
        System.out.println(a==b); // выдаст true

        Integer c=128;//создан новый обьект
        Integer d=128;//создан новый обьект
        System.out.println(c==d); // выдаст false

        Integer c1=-128;//создан новый обьект
        Integer d1=-128;//не создан новый обьект а записана ссылка на первый обьект
        System.out.println(c1==d1); // выдаст true

        // для гарантированного правильного сравнения оберточных типов нужно использовать equals()
        Integer c2=128;//создан новый обьект
        Integer d2=128;//создан новый обьект
        System.out.println(c2.equals(d2)); // выдаст false

        /* Общие (схожие) методы, которыми обладают классы обертки:*/
        // 1. valueOf()- преобразует строку или примитив в соответствующий класс-оберки
        Integer e=Integer.valueOf(124);
        Integer e1=Integer.valueOf("124");
        System.out.println(e==e1);

        Double dbl=Double.valueOf(12.2);
        Double dbl1=Double.valueOf("12.2");
        System.out.println(dbl+3);

        //2. parseXXX() - преобразует строку в соответствующий примитив
        int parseInt= Integer.parseInt("456");
        double d3=Double.parseDouble("564.6");

        // 3. toString() - возвращает строковое представление значения

        // 4. equals()

        // 5. xxxValue- Принудительная автораспаковка- возвращает значение обьекта как примитивный тип
        Double dd= Double.valueOf(134.6);// явная принудительная упаковка
        double dPrimitiv= dd.doubleValue();// явная принудительная распаковка

        /* Все числовые обертки наследуются от Абстрактного класса Number */
        double ddd=test(100.1,200.1);
        System.out.println(ddd);


    }

    public static double test(Number number1, Number number2)// Из-за того что тип Number то можно передать любое число(любую обертку)
    {
      double db1=number1.doubleValue()+number2.doubleValue();
      return  db1;
    }
}
