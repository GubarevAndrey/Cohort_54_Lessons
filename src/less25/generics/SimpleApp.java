package less25.generics;

public class SimpleApp {
    public static void main(String[] args) {
        SimpleBox box= new SimpleBox(10);
        System.out.println(box);
        SimpleBox box1= new SimpleBox(20);
        System.out.println(box1);

        int sum=(int)box.getValue()+(int)box1.getValue();
        System.out.println("sum= "+sum);

        SimpleBox[] boxes= new SimpleBox[3];
        boxes[0]=box;
        boxes[1]=box1;
        boxes[2]=new SimpleBox("30");

        int sum1=0;
        for(int i=0;i< boxes.length;i++){
            sum1=sum1+(int)boxes[i].getValue();
            /*Вызовет ClassCastExeption - при
            * попытке пивести String к int -Выдаст ошибку
            * Object принимает все что угодно, но это и слабость.
            * Нужно контроллировать
            * Generic (Дженерики) предоставляют возможность
            * создавать классы, Интерфейсы, Методы в которых
            * типы данных, которыми работают классы, интерфейсы и методы
            * задаются параметром.
            *  */

        }
        System.out.println("sum1= "+sum1);

    }
}
