package Progi;

import jdk.jfr.Label;

import java.awt.*;
import java.util.Scanner;

public class Temp_test {

    public static void main(String[] args) {
        double dd=0;
        int d;
        String ss;
        Scanner scanner=new Scanner(System.in);
        d=scanner.nextInt();
        ss="((234.45+23)/2+(234.45+23)/2-(234.45+23)/2-(234.45+23)/2)";
        for (int i=1; i<=2000000;i=i+1) {
            dd=dd+calculate(ss);
        }
        System.out.println(dd);
    }


    public static double calculate(String expression) {
        String s;
        String[] Arr = new String[100];
        for (int i = 0; i < 100; i = i + 1) {Arr[i] = "";}
        int N = 0; // Кол-во найденных элементов в массиве
        int sostoyanie; // 1- ввод числа, 2- ввод математической операции, 3-скобка-(, 4-скобка-)
        int otkr;
        int zakr;
        int start_pos;
        int fin_poz;
        boolean umn_del;
        boolean vihod = false;
        int ch;
        s=expression;
        s = s.trim();
        ch = s.indexOf(" ");
        while (ch >= 0) {
            s = s.substring(0, ch) + s.substring(ch + 1, s.length());
            ch = s.indexOf(" ");
        }
        for (int i = 0; i < s.length(); i = i + 1) {
            if ((s.substring(i, i + 1).equals("-")) && (s.substring(i + 1, i + 2).equals("-"))) {
                if (i > 0) {
                    s = s.substring(0, i) + "+" + s.substring(i + 2, s.length());
                } else {
                    s = s.substring(i + 2, s.length());
                }
            }
            if ((s.substring(i, i + 1).equals("+")) && (s.substring(i + 1, i + 2).equals("-")) ||
                    (s.substring(i, i + 1).equals("-")) && (s.substring(i + 1, i + 2).equals("+"))) {
                if (i > 0) {
                    s = s.substring(0, i) + "-" + s.substring(i + 2, s.length());
                } else {
                    s = s.substring(i + 2, s.length());
                }
            }
            if ((s.substring(i, i + 1).equals("+")) && (s.substring(i + 1, i + 2).equals("+"))) {
                if (i > 0) {
                    s = s.substring(0, i) + "+" + s.substring(i + 2, s.length());
                } else {
                    s = s.substring(i + 2, s.length());
                }
            }
        }
        sostoyanie = 1;
        for (int i = 0; i < s.length(); i = i + 1) {
            if (((s.charAt(i) >= 48) && (s.charAt(i) <= 57)) ||
                    (s.charAt(i) == 46)) {
                if (sostoyanie != 1) {
                    N = N + 1;
                    sostoyanie = 1;
                }
                Arr[N] = Arr[N] + s.substring(i, i + 1);
            }
            if (s.substring(i, i + 1).equals("+")
                    || s.substring(i, i + 1).equals("*")
                    || s.substring(i, i + 1).equals("/")) {
                if (sostoyanie != 2) {
                    if (i != 0) {
                        N = N + 1;
                    }
                    sostoyanie = 2;
                }
                Arr[N] = Arr[N] + s.substring(i, i + 1);
            }
            if (s.substring(i, i + 1).equals("-")) {
                if (sostoyanie == 1) {
                    if (i == 0) {
                        Arr[N] = "0";
                        N = N + 1;
                        sostoyanie = 2;
                    } else {
                        N = N + 1;
                        sostoyanie = 2;
                    }
                }
                if (sostoyanie == 3) {
                    N = N + 1;
                    Arr[N] = "0";
                    N = N + 1;
                    sostoyanie = 1;
                }
                if (sostoyanie == 4) {
                    N = N + 1;
                    sostoyanie = 2;
                }
                Arr[N] = Arr[N] + s.substring(i, i + 1);
            }
            if (s.substring(i, i + 1).equals("(")) {
                sostoyanie = 3;
                if (i > 0) {
                    N = N + 1;
                }
                Arr[N] = Arr[N] + s.substring(i, i + 1);
            }
            if (s.substring(i, i + 1).equals(")")) {
                sostoyanie = 4;
                N = N + 1;
                Arr[N] = Arr[N] + s.substring(i, i + 1);
            }
        }


        outer:
        while (vihod == false) {
            otkr = -1;
            zakr = -1;
            for (int i = 0; i <= N; i = i + 1) {
                if (Arr[i].equals("(")) {
                    otkr = i;
                    for (int j = i + 1; j <= N; j = j + 1) {
                        if (Arr[j].equals(")")) {
                            zakr = j;
                            break;
                        }
                    }
                }
            } // for i
            if (zakr == otkr + 2) {
                for (int j = otkr; j <= N - 1; j = j + 1) {
                    Arr[j] = Arr[j + 1];
                }
                N = N - 1;
                for (int j = otkr + 1; j <= N - 1; j = j + 1) {
                    Arr[j] = Arr[j + 1];
                }
                N = N - 1;
                continue outer;
            }
            if (otkr != -1) start_pos = otkr + 1;
            else start_pos = 0;
            if (zakr != -1) fin_poz = zakr;
            else fin_poz = N;
            umn_del = false;
            for (int i = start_pos; i <= fin_poz; i = i + 1) {
                if (Arr[i].equals("*") || (Arr[i].equals("/"))) {
                    umn_del = true;
                }
            }

            for (int i = start_pos; i < fin_poz; i = i + 1) {
                if (Arr[i].equals("*") || Arr[i].equals("/")) {
                    if (Arr[i].equals("*")) {
                        Arr[i - 1] = Double.toString((Double.parseDouble(Arr[i - 1]) * Double.parseDouble(Arr[i + 1])));
                    }
                    if (Arr[i].equals("/")) {
                        Arr[i - 1] = Double.toString((Double.parseDouble(Arr[i - 1]) / Double.parseDouble(Arr[i + 1])));
                    }
                    for (int j = i; j <= N - 2; j = j + 1) {
                        Arr[j] = Arr[j + 2];
                    }
                    N = N - 2;
                    continue outer;
                }
                if ((Arr[i].equals("+") || Arr[i].equals("-")) && (umn_del == false)) {
                    if (Arr[i].equals("+")) {
                        Arr[i - 1] = Double.toString((Double.parseDouble(Arr[i - 1]) + Double.parseDouble(Arr[i + 1])));
                    }
                    if (Arr[i].equals("-")) {
                        Arr[i - 1] = Double.toString((Double.parseDouble(Arr[i - 1]) - Double.parseDouble(Arr[i + 1])));
                    }
                    for (int j = i; j <= N - 2; j = j + 1) {
                        Arr[j] = Arr[j + 2];
                    }
                    N = N - 2;
                    continue outer;
                }
            }
            if (N == 0) vihod = true;
        }
        return Double.parseDouble(Arr[0]);
    }
}
