package Nov_progi;

import java.math.BigInteger;

public class Slova {
    // https://www.codewars.com/kata/53e57dada0cb0400ba000688/train/java
    public static void main(String[] args) {
        System.out.println(listPosition("YKOCIQNLRSRHFHUCTQLPYTXZQ"));
    }

    public static BigInteger listPosition(String word) {
        int[] arr = new int[word.length()];
        char ch;
        int max = 0;
        int temp = 0;
        double temp1 = 0;
        double temp2=0;
        double opora = 0;
        BigInteger n_out= new BigInteger("0");
        String s;
        for (int i = 0; i < arr.length; i = i + 1) {
            ch = word.charAt(i);
            arr[i] = ch;
        }
        temp1 = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i < arr.length - 1) {
                temp1 = temp1 * 100;
            }
            opora = opora + temp1 * arr[i];
        }

        for (int i = 1; i < arr.length; i++) {
            max = arr[0];
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        temp2=0;
        temp1=1;

        for (int ii = arr.length - 1; ii >= 0; ii--) {
            if (ii < arr.length - 1) {
                temp1 = temp1 * 100;
            }
            temp2 = temp2 + temp1 * arr[ii];
        }
        if(opora==temp2) {
            n_out=n_out.add(BigInteger.valueOf(1));
            return n_out;
        }
        n_out=n_out.add(BigInteger.valueOf(1));
        for (int k = arr.length - 2; k >= 0; k = k - 1) {
            for (int i = k; i < arr.length; i++) {
                for (int j = k; j < arr.length - 1; j++) {
                    if(arr[j+1]>arr[j]) {
                        temp=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=temp;
                        n_out=n_out.add(BigInteger.valueOf(1));
                        temp2=0;
                        temp1=1;
                        for (int ii = arr.length - 1; ii >= 0; ii--) {
                            if (ii < arr.length - 1) {
                                temp1 = temp1 * 100;
                            }
                            temp2 = temp2 + temp1 * arr[ii];
                        }
                        if(opora==temp2) {
                            return n_out;
                        }
                    }
                }
            }
        }
        return n_out;
    }

}
