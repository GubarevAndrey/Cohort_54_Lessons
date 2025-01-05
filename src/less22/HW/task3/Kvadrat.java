package less22.HW.task3;

public class Kvadrat extends Figura {


    public Kvadrat() {
        super(0, 0);
    }
    public Kvadrat(double x1, double x2) {
        super(x1, x2);
    }
    @Override
    public double areaCalc(double x1,double x2){
        if (x1>=0 && x2>=0) {
            return x1*x2;
        }
        return Integer.MIN_VALUE;
    }

}
