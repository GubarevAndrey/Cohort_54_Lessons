package less18.StaticBlock;

public class StaticBlockDemo {
    static String[] colors;
    static int counter=5;
    private String title;
    private int capacity=10;



    /*Статический блок инициализации статических полей
     для того чтобы
     инициализировать поля без или до создания объекта
     Вызывается этот блок только один раз в момент
     загрузки класса
     */
    static {
        System.out.println("Static block run");
        colors = new String[3];
        colors[0]="red";
        colors[1]="yellow";
        colors[2]="green";
        counter=10; // переприсваивается
    }

   //НЕ статический блок инициализации
   // Выполняется при каждом при каждом создании обьекта
   // Вызывается ДО конструктора
    {
        System.out.println("NON Static block run");
        this.title="NON Static title";
    }



    public StaticBlockDemo(String title) {
        System.out.println("Construktor  run");
        this.title = title;
        this.capacity=50;
    }
    public String toString() {
        return String.format("Titel: %s , capacity: %d, counter: %d",
                title,capacity,counter);
    }
}
