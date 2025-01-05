package less25.generics;

public class GenericApp {
    public static void main(String[] args) {

        /*
        При создании обьекта в скобках <> указывается
        конкретный тип 
         */
        GenericBox <String> box=new GenericBox<>("Hello");

        String getValue=box.getValue();

        /*Generic (дженерики) работают только с сылочными типами
        * данных- не работают с примитивами */
        //GenericBox <int> boxInt = new GenericBox<int>(2);
    }
}
