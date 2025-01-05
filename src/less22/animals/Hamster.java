package less22.animals;

public class Hamster extends Animal{
    //переопределяем метод voice  для класса Hamster
    // если не переопределим то  при вызове
    // в ZooApp  метода будет вызов из Animal
    @Override
    public void voice() {
        System.out.println("Хомячек хрум-хрум");
    }

    @Override
    public String toString() {
        return super.toString()+" Hamster Дополнение реализации родительского метода";
    }
}
