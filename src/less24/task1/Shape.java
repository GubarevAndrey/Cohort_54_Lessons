package less24.task1;

public abstract class Shape {
    private static double PI=3.1415926;

    public static double getPI() {
        return PI;
    }

    public abstract double area();

    public abstract double perimeter();


}
