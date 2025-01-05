package less22.animals;

public class Cat extends Animal{
    //переопределить родительский метод voice
    //т.е. изменить реализацию родительского метода
    @Override //@Override-Показываем свое намерение переопределить
              // родительский метод (выдает MEOW вместо
            // somthing
    public void voice() {
        System.out.println("Cat sey MEOW !");
    }
    public void eat(){
        System.out.println("Cat is eating");
    }
    //перегрузка метода
    public void eat(String food){
        System.out.println("Cat is eating "+food);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
