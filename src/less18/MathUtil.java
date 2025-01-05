package less18;

public class MathUtil {
    private static int counter=0;
    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        MathUtil.counter = counter;
    }


    public static int SumOfIntegers(int x, int...ints) {
        int sum=x;
        for (int i=0;i<ints.length;i++) {
            sum=sum+ints[i];
        }
        return sum;
    }

}
