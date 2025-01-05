package less17.HomeWork;

public class MagicArrayAppHW17 {
    public static void main(String[] args) {
        int [] ints ={10,20,30,40};
        MagicArray17HW magicArray17HW=new MagicArray17HW(ints);
        int k=magicArray17HW.toArray().length;
        for (int i=0;i<k;i++)   {
            System.out.print(magicArray17HW.toArray()[i]+", ");
        }
        System.out.println();
    }
}
