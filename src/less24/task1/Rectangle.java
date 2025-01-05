package less24.task1;

public class Rectangle extends Shape {
    private  double x1;
    private  double x2;

    public Rectangle(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
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

    @Override
    public double area() {
        if (isValid()) {
            return x1 * x2;
        }
        return Integer.MIN_VALUE;
    }


    @Override
    public double perimeter() {
        if (isValid()) {
            return 2*(x1+x2);
        }
        return Integer.MIN_VALUE;
    }


    private boolean isValid(){
        if (x1>=0 && x2>=0) {
            return true;
        } else {
            return false;
        }
    }
}
