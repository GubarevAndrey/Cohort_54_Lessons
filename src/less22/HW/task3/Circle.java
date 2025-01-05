package less22.HW.task3;

public class Circle extends Figura {

    public Circle(double x1) {
        super(x1);
    }

    @Override
    public double areaCalc(double r){
        if (r>=0 ) {
            return getPI()*r*r;
        }
        return Integer.MIN_VALUE;
    }
}
