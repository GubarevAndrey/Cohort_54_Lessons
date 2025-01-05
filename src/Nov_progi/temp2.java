package Nov_progi;
import java.math.BigInteger;
public class temp2 {
    public static BigInteger totalIncDec(int x){
        int [] cif=new int[x+1];
        String s="1";
        double d1=66797975756969722.0;
        double d2=66797975756969721.0;
        if(d1==d2) {
            System.out.println("RAVNO");
        }
        for (int i=1; i<=x;i=i+1) {s=s+"0";}
        BigInteger out= new BigInteger("0");
        BigInteger max= new BigInteger(s);
        BigInteger j= new BigInteger("0");
        while (max.compareTo(j)==1){
            j=j.add(BigInteger.valueOf(1));
        }



        BigInteger value = new BigInteger("231");
        int digits = 0;
        while (!value.equals(BigInteger.ZERO)) {
            value = value.divide(BigInteger.TEN);
            digits++;
        }

        return out;
    }



    public static void main(String[] args) {
        System.out.println(totalIncDec(4));

    }
}