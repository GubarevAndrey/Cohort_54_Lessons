package less24.task1;

public class TriangeSingle extends Shape {
    private double x1;
    private double x2;
    private double x3;

    /*
    Для того чтобы был создан только один обьект класса делаю Сингл-тон
     */
    // Создаем приватную статическую переменную, типа класса. Принято давать переменной имя instance
    private static TriangeSingle instance;
    //создаем приватный  конструктор
    private TriangeSingle (double x1, double x2, double x3) {
        this.x1=x1;
        this.x2=x2;
        this.x3=x3;
    }
    public   static TriangeSingle getInstance(double x1, double x2, double x3) {
        if (isValid(x1,x2,x3)==true ) {
            instance= new TriangeSingle(x1,x2,x3);
            return   instance;
        } else {
            System.out.println("Стороны не правильные");
            return null;
        }

    }
    /*
    При создании обьекта triangeSingle мы не можем
    вызвать конструктор, потому что он приватный
     и статический , поэтому можем вызвать только
     статический метод getInstance(), который проверяет
     переменную instance. Если она равно null
     то создается обьект один раз и в переменную заностится
     его  адрес
     */
    @Override
    public double area() {
        double p=(x1+x2+x3)/2;
        return Math.sqrt(p*(p-x1)*(p-x2)*(p-x3));
    }



    @Override
    public double perimeter() {
        return x1 + x2 + x3;
    }
    private static  boolean isValid(double x1,double x2, double x3){
        if (x1+x2>x3 && x2+x3>x1 && x1+x3>x2) {
            return true;
        } else {
            return false;
        }
    }
}
