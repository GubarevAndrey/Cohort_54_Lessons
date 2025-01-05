package Nov_progi;

public class tochki_kvadrata {
    // https://www.codewars.com/kata/5886e082a836a691340000c3/train/java

    public static void main(String[] args) {
        System.out.println("Точек="+rectangleRotation(2,2));
    }
    static int rectangleRotation(final int a, final int b) {
        double a_osn=0;
        double b_osn=0;
        double alfa=0;
        double x1=0;
        double y1=0;
        double x2=0;
        double y2=0;
        double x3=0;
        double y3=0;
        double x4=0;
        double y4=0;
        double x01=0;
        double x02=0;
        double x03=0;
        double x04=0;
        double x_etap1=0;
        double x_etap2=0;
        double pol_diag=0;
        int temp1=0;
        int temp2=0;
        int n_tochek_total=0;
        int y_temp1=0;
        int y_temp2=0;
        double temp=0;
        if (a>b) {
            b_osn=a;
            a_osn=b;
        } else {
            b_osn=b;
            a_osn=a;
        }
        pol_diag=Math.sqrt((a_osn*a_osn)+(b_osn*b_osn))/2;
        alfa=Math.atan(a_osn/b_osn);
        x1=pol_diag*Math.cos(((45*Math.PI)/180)-alfa);
        y1=pol_diag*Math.sin(((45*Math.PI)/180)-alfa);
        x2=y1;
        y2=x1;
        x3=-1*x1;
        y3=-1*y1;
        x4=-1*y1;
        y4=-1*x1;
        x01=(x2*y3-y2*x3)/(y3-y2);
        x02=(x1*y4-y1*x4)/(y4-y1);
        x03=x2;
        x04=x1;
        if (x02<x03) {
            x_etap1=x02;
            x_etap2=x03;
        } else {
            x_etap1=x03;
            x_etap2=x02;
        }
        if (x02<x03 && a !=b) {
            temp1=(int)x01;
            temp2=(int)x_etap1;
            n_tochek_total=n_tochek_total+(temp2-temp1)+1;
            //   for (int i=temp1; i<=temp2;i=i+1) {
            //    n_tochek_x=n_tochek_x+1;
           // }
            // проверяем точки на оси х на отрезке x01-x_etap1 выше нуля
            for (int i=temp1; i<=temp2;i=i+1) {
                y_temp1=(int) ((i * (y3 - y2) + y2 * x3 - x2 * y3) / (x3 - x2));
                n_tochek_total=n_tochek_total+2*y_temp1;
              //  for (int ii=1; ii<=y_temp1;ii=ii+1) {
               //     n_tochek_temp=n_tochek_temp+1;
               // }
            }

            // проверяем точки на оси х на отрезке x_etap1-x_etap2 выше нуля
            temp1=(int)x02+1;
            temp2=(int)x_etap2;
            for (int i = temp1; i <= temp2; i = i + 1) {
                temp=(i * (y4 - y1) + y1 * x4 - x1 * y4) / (x4 - x1);
                if (temp%1 ==0) {
                    y_temp1=(int) temp;
                } else {
                    y_temp1=(int) temp+1;
                }
                y_temp2=(int) ((i * (y3 - y2) + y2 * x3 - x2 * y3) / (x3 - x2));
                n_tochek_total=n_tochek_total+2*((y_temp2-y_temp1)+1);
            }
            temp1=(int)x_etap2+1;
            temp2=(int)x04;
            for (int i = temp1; i <= temp2; i = i + 1) {
                temp=(i * (y4 - y1) + y1 * x4 - x1 * y4) / (x4 - x1);
                if (temp%1 ==0) {
                    y_temp1=(int) temp;
                } else {
                    y_temp1=(int) temp+1;
                }
                y_temp2=(int) ((i * (y2 - y1) + y1 * x2 - x1 * y2) / (x2 - x1));
                n_tochek_total=n_tochek_total+2*((y_temp2-y_temp1)+1);
            }
        }
        if (x02>=x03 && a != b ) {
            // проверяем точки на оси х на отрезке x01-x_etap2
            temp1=(int)x01;
            temp2=(int)x_etap2;
            n_tochek_total=n_tochek_total+(temp2-temp1)+1;
            temp2=(int)x_etap1;
            // проверяем точки на оси х на отрезке x01-x_etap1 выше нуля
            for (int i=temp1; i<=temp2;i=i+1) {
                y_temp1=(int) ((i * (y3 - y2) + y2 * x3 - x2 * y3) / (x3 - x2));
                n_tochek_total=n_tochek_total+2*y_temp1;
            }

            // проверяем точки на оси х на отрезке x_etap1-x_etap2 выше нуля
            temp1=(int)x_etap1+1;
            temp2=(int)x_etap2;
            for (int i = temp1; i <= temp2; i = i + 1) {
                y_temp1=(int) ((i * (y2 - y1) + y1 * x2 - x1 * y2) / (x2 - x1));
                n_tochek_total=n_tochek_total+2*y_temp1;
            }

            // проверяем точки на оси х на отрезке x_etap2-x04 выше нуля
            temp1=(int)x_etap2+1;
            temp2=(int)x04;
            for (int i = temp1; i <= temp2; i = i + 1) {
                temp=(i * (y4 - y1) + y1 * x4 - x1 * y4) / (x4 - x1);
                if (temp%1 ==0) {
                    y_temp1=(int) temp;
                } else {
                    y_temp1=(int) temp+1;
                }
                y_temp2=(int) ((i * (y2 - y1) + y1 * x2 - x1 * y2) / (x2 - x1));
                n_tochek_total=n_tochek_total+2*((y_temp2-y_temp1)+1);
            }
        }

        if (a ==b) {
            // проверяем точки на оси х на отрезке x3-0 на оси х
            temp1=(int)x3;
            temp2=(int)x1;
            n_tochek_total=n_tochek_total+(temp2-temp1)+1;

            // проверяем точки на оси х на отрезке x3-0 выше нуля
            temp2=0;
            for (int i=temp1; i<=temp2;i=i+1) {
                y_temp1=(int) ((i * (y3 - y2) + y2 * x3 - x2 * y3) / (x3 - x2));
                n_tochek_total=n_tochek_total+2*y_temp1;
            }

            // проверяем точки на оси х на отрезке 0-x1 выше нуля
            temp1=1;
            temp2=(int)x1;
            for (int i=temp1; i<=temp2;i=i+1) {
                y_temp1=(int) ((i * (y2 - y1) + y1 * x2 - x1 * y2) / (x2 - x1));
                n_tochek_total=n_tochek_total+2*y_temp1;
            }
        }

        return n_tochek_total;
    }
}
