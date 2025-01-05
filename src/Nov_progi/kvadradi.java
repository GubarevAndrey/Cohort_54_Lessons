package Nov_progi;
// https://www.codewars.com/kata/5a3af5b1ee1aaeabfe000084/train/java

public class kvadradi {

    public static void main(String[] args) {
       System.out.println(nSquaresFor(538679235));
    }
    public static int nSquaresFor(int n) {
        boolean exi=false;
        double [] arr = new double[10];
        double [] arrNew = new double[10];
        int pos=0;
        int elem=0;
        int pos_temp=0;
        double temp=0;
        double temp1=0;
        double d=0;
        int min=0;
        int t1=0;
        int t2=0;


        temp1=n;
        while (d!=n) {
            temp=(int)Math.sqrt(temp1);
            arr[elem]=temp*temp;
            temp1=temp1-arr[elem];
            d=d+arr[elem];
            elem=elem+1;
        }
        min=elem;
        for (int i=0;i<=elem;i=i+1) {
            if (arr[i]==1) {
                pos_temp=i;
                break;
            }
        }
        if (pos_temp==0 && min>1) {
                pos_temp=min;
        }
        for (int i=0;i<pos_temp;i=i+1) {
                t1=((int) Math.sqrt(arr[i])-1);
                t2=(int) Math.sqrt(t1);
                //t2=1;
                for (int j=t1;j>=t2;j=j-1) {
                    temp1 = n;
                    pos = 0;
                    d = 0;
                    for (int k=0; k<10;k=k+1) {
                        arrNew[k]=0;
                    }
                    while (d != n) {
                        if (i == pos) {
                            temp =j;
                        } else {
                            temp = (int) Math.sqrt(temp1);
                        }
                        arrNew[pos] = temp * temp;
                        temp1 = temp1 - arrNew[pos];
                        d = d + arrNew[pos];
                        pos = pos + 1;
                    }
                    if (pos < min) {
                        min = pos;
                    }
                }
        }


        return min;
    }
}
