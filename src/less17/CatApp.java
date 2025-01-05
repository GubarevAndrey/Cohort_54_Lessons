package less17;

public class CatApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Catty",8,5);
        System.out.println(cat.toString());
        cat.name="Barsik";
        cat.weight=1000;
        cat.age=-1000;
        System.out.println(cat.toString());
    }
}
