package Nov_progi;

import java.util.Scanner;

public class temp1 {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int[] arr = new int[25];
        int[] arr1 = new int[25];
        int k = 0;
        double temp1 = 0;
        double opora = 0;
        int naydeno = 0;
        System.out.print("Введите ");
        Scanner scanner = new Scanner(System.in);
        k = scanner.nextInt();
        for (int i1 = 0; i1 < arr.length; i1++) {
            arr[i1] = i1 + 50;
            arr1[i1] = i1 + 40;
        }
        temp1 = 1;
        for (i = 0; i <  200000000; i = i + 1) {
            opora = 0;
            temp1 = 1;
            for (j = 0; j < arr.length; j = j + 1) {
                temp1 = temp1 * 100;
                opora = opora + temp1 * arr[j];
                if (opora == 1234) {
                    naydeno = 1;
                }
            }
        }
        System.out.println(opora + " " + naydeno);
        System.out.print("Введите ");
        k = scanner.nextInt();
        naydeno = 1;
        for (i = 0; i < 200000000; i = i + 1) {
            opora = 0;
            temp1 = 1;
            naydeno = 1;
            for (j = 0; j < arr.length; j = j + 1) {
                for (int k1 = 0; k1 < arr.length;k1++) {

                    if (arr[j] != arr1[k1]) {
                        naydeno = 0;
                    }
                }
            }
        }
        System.out.println(naydeno);
    }
}
