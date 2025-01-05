package less25.HW.task1;

public class MagicArrayGenApp {
    public static void main(String[] args) {
        String [] ints ={"a","b","c","d"};
        String [] ints1 =new String[]{"1","2","3","4"};
        MagicArrayGen <String> magicArrayGen=new MagicArrayGen<>(ints);
    //    int k= magicArrayGen.toArray().length;
     //   for (int i=0;i<k;i++)   {
  //          System.out.print( magicArrayGen.toArray()[i]+", ");
   //     }
        magicArrayGen.toString();
        System.out.println(magicArrayGen.toString());
        System.out.println(magicArrayGen.get(2));
        System.out.println(magicArrayGen.set(2,"56"));
        System.out.println(magicArrayGen.toString());
        magicArrayGen.remove(2);
        System.out.println(magicArrayGen.toString());
        magicArrayGen.addAll(ints1);
        System.out.println(magicArrayGen.toString());
        magicArrayGen.removeByValue("a");
        System.out.println(magicArrayGen.toString());
        System.out.println(magicArrayGen.size());
        System.out.println("mag:"+magicArrayGen);
        System.out.println("mag.Arra:"+magicArrayGen.toArray().length);

        int g=(Integer)magicArrayGen.toArray().length;
        System.out.println(g);






    }
}
