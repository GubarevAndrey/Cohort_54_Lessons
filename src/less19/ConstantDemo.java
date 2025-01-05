package less19;

public class ConstantDemo {
    private final int x; // не константа
    public static final double PI=3.1415; // константа
    public static final int [] ints=new int[10]; // с точки зрения
       // java мвссив не является константой
       // т.к его элементы могут быть изменены
    public static final String COUNTRY="Germany";
    public static final String[] colors={"red","green","yello"};// не константа
    // потому что значения массива можно перезаписать


    public ConstantDemo(int x){
        this.x=x;
    }

    public int getX() {
        return x;
    }
}
