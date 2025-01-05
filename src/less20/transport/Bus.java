package less20.transport;
//Способ  IS-A
//Способ наследования Bus IS A Vehicle
public class Bus extends Vehicle {
/*
Если есть A extends B - это значит что класс А наследуется от
класса В. При этом - потомок(наследник) В - родитель
 */
    private int capacity; // вместимость
    private int cauntPassengers; // сейчас число пассажиров


    public Bus(String model, int year,int capacity) {
        // в нашем конструкторе вызываем конструктор родителя
        // нужно сначала создать объект родителя.
        // Вызвать конструктор родительского класса
        // ключевым словом super- вызов конструктора родителя
          super (model,year); // вызов родительского класса

        //затем присваиваем полю значение
        this.capacity=capacity;

    }

    public int getCapacity() {
        return capacity;
    }

    public int getCauntPassengers() {
        return cauntPassengers;
    }

    public boolean addPassenger () { // взять на борт одного пассажира
        if (this.capacity > this.cauntPassengers) {
            this.cauntPassengers++;
            System.out.println("Пассажир вошел в автобус: "+getModel());
            return true;
        }
        System.out.printf("В автобусе: %s нет мест. Сейчас %d пассажиров ", model,cauntPassengers);
        return false;
    }
}
