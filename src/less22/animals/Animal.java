package less22.animals;

public class Animal {
    public void voice (){
        System.out.println("Animal say somthing");
    }

    // Переопределение родительского класса - Object
@Override
    public String toString(){
        return "Animal to String";
    }
}
