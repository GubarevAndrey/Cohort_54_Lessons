package less22.HW.task3;

public class FiguraApp {
    public static void main(String[] args) {
        Kvadrat kvadrat=new Kvadrat();
        System.out.println("Квадрат: "+kvadrat.areaCalc(2,3));
        Triangle triangle=new Triangle(3,4,5);
        System.out.println("Треугольник: "+triangle.areaCalc(3,4,5));
        Circle circle=new Circle(5);
        System.out.println("Круг: "+circle.areaCalc(3));
    }
}
