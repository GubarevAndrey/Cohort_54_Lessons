package less16;

public class ArrayApp {
    public static void main(String[] args) {
        MagicArray magicArray=new MagicArray();
        magicArray.addAll(100,200,300,400,500,600,700,800,900,1000,1100,1200);
        System.out.println(magicArray.toString());
    }
}
