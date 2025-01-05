package less22.HW.task3;

public class Triangle extends Figura{

   public  Triangle(double x1,double x2,double x3){
       super(x1,x2,x3);
   }
    @Override
    public double areaCalc(double x1,double x2,double x3){
       double p=x1+x2+x3;
        if ((x1+x2 >x3)&& (x2+x3>x1)&&(x1+x3>x2) && x1>=0 && x2>=0 && x3>=0) {
            return Math.sqrt(p*(p-x1)*(p-x2)*(p-x3));
        }
        return Integer.MIN_VALUE;
    }
}
