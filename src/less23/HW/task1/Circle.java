package less23.HW.task1;

public class Circle extends Shape {
      private double radius;

    public Circle(double rad) {
        this.radius=rad;
    }


    @Override
    public double area() {
        if (isValid()) {
            return radius*radius*getPI();

        }
        return Integer.MIN_VALUE;
    }

    @Override
    public double perimeter() {
        if (isValid()) {
            return 2*radius*getPI();
        }
        return Integer.MIN_VALUE;
    }

    private boolean isValid(){
        if (radius>=0) {
            return true;
        } else {
            return false;
        }
    }

}


