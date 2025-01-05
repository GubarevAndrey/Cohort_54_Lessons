package less23.HW.task1;

public class Triangel extends Shape {
    private  double x1;
    private  double x2;
    private double x3;

    public Triangel(double x1, double x2, double x3) {
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

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    @Override
    public double area() {
        double p=(x1+x2+x3)/2;
        if (isValid()) {
            return Math.sqrt(p*(p-x1)*(p-x2)*(p-x3));
                   }
        return Integer.MIN_VALUE;
    }



    @Override
    public double perimeter() {
        if (isValid()) {
            return x1+x2+x3;
        }
        return Integer.MIN_VALUE;
    }
    private boolean isValid(){
        if (x1+x2>x3 && x2+x3>x1 && x1+x3>x2) {
            return true;
        } else {
            return false;
        }
    }
}
