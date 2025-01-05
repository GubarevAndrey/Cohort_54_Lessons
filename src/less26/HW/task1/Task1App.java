package less26.HW.task1;

public class Task1App {

    public static void main(String[] args) {
        Pair <String>pair=new Pair<>("Hello","World");
        System.out.println(pair.toString());
        pair.swap();
        System.out.println(pair.toString());

        Pair <Integer>pair1=new Pair<>(21,55);
        System.out.println(pair1.toString());
        pair1.swap();
        System.out.println(pair1.toString());


    }

}
