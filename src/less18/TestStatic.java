package less18;

import java.util.Arrays;

public class TestStatic {
    int x;
    static int staticY;
    public static void staticMethod(){
        //статические методы видят только статические члены класса (поля и методы)
        // нельзя написать
        //x=x+1;

        //можно написать
        staticY=staticY+1;
    }
    public void nonStaticMethod(){
        //не статические методы видят все члены класса- как статические так и нестатические
        x++;
        staticY++;
        staticMethod();
    }
    // в классе может находиться метод main
    public static void main(String[] args) {
         // нельзя обращаться к нестатической переменной
         //x++;

        // можно обращаться к статической переменной
        staticY++;

        staticMethod(); //можно вызвать напрямую, потому что находимся в классе
        TestStatic.staticMethod(); // можно и так вызвать-от имени класса

        // нельзя обращаться к нестатическому методу без создания обьеков
        //nonStaticMethod();
        // после создания можно
        TestStatic testStatic =new TestStatic();
        testStatic.nonStaticMethod();


        int sum=MathUtil.SumOfIntegers(2,5,7,8,9);
        System.out.println(sum);

        MathUtil.setCounter(5);
        System.out.println(MathUtil.getCounter());


    }
}
