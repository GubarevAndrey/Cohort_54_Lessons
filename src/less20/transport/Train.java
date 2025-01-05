package less20.transport;
//Мы не можем наследовать поезд из автобуса даже если там есть точно такие поля.
// Потому что поезд и автобус разные характеристики имеют.
// Поезд должны тоже наследовать из Vehicle
public class Train extends Vehicle{
    private int capacity;
    private int countPassangers;
    private int countWagons;
    private final int wagonCapacity;

    public Train(String model,int yaer, int countWagons,int wagonCapacity ) {
        // перед добавлением в класс-наследник дополнительных изменений
        // мы должны вызвать класс-родитель
        // в нашем конструкторе вызываем конструктор родителя
        // нужно сначала создать объект родителя.
        // Вызвать конструктор родительского класса
        // ключевым словом super- вызов конструктора родителя
        // Если не вызвать конструктор родителя то поля родителя будут по умолчанию

        this.countWagons=countWagons;
        this.wagonCapacity=wagonCapacity;
        this.capacity=countWagons*wagonCapacity;
    }

    public int getCountPassangers() {
        return countPassangers;
    }

    public void setCountPassangers(int countPassangers) {
        this.countPassangers = countPassangers;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public void setCountWagons(int countWagons) {
        this.countWagons = countWagons;
        this.capacity=this.capacity*this.countWagons;
    }

    public int getCapacity() {
        return capacity;
    }
}
