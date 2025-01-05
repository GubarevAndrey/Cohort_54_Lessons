package less17;

public class ArrayApp {
    public static void main(String[] args) {
        int[] ints = {10, 20, 50, -25, 35, 45, 100, -1, 50};
        MagicArray17 magicArray17 = new MagicArray17(ints);
        System.out.println(magicArray17);
        System.out.println(magicArray17.indexOf(10));
        System.out.println(magicArray17.indexOf(500));
        System.out.println(magicArray17.removeByValue(66));
        System.out.println(magicArray17.toString());
        System.out.println(magicArray17.set(0,44));
        System.out.println(magicArray17.toString());
    }
}
