package less22.HW.task3;

public class Figura {
    private static double PI=3.1415926;
    private double area=0;
    private double x1;
    private double x2;


    public double getX3() {
        return x3;
    }

    public static double getPI() {
        return PI;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    private double x3;

    public Figura() {
        this.x1 = 0;
        this.x2 = 0;
        this.x3 = 0;

    }

    public Figura(double x1) {
        this.x1 = x1;
        this.x2 = 0;
        this.x3 = 0;

    }

    public Figura(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = 0;
    }
    public Figura(double x1, double x2,double x3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getArea() {
        return area;
    }

    public double areaCalc(double x1){
        return 0;
    }
    public double areaCalc(double x1,double x2){
        return 0;
    }
    public double areaCalc(double x1,double x2,double x3){
        return 0;
    }
}
