package less18.HomeWork;

public class HW18_Calk {
    private static double x1;
    private static double x2;
    private static final double PI=3.141592;

    public static double add(double x1, double x2) {
        return x1+x2;
    }

    public static double subtraction(double x1, double x2) {
        return x1-x2;
    }

    public static double mult(double x1, double x2) {
        return x1*x2;
    }

    public static double div (double x1, double x2) {
            return x1 / x2; // только double разрешает делить на ноль.
                             // Если будут int то при  нуле будет ошибка
    }

    public static double lenCurcle(double r) {
        return 2*PI*r;
    }

    public static double squareCurcle(double r) {
        return (PI*r*r)/4;
    }


}
