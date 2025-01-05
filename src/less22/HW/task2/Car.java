package less22.HW.task2;

public class Car extends Vechicle {
    public Car(String model) {
        super(model);
    }

    public Car(String model, String typeEngine) {
        super(model, typeEngine);
    }

    @Override
    public void startEngine(){
        System.out.println("Автомобиль "+ getModel() +" включил двигатель"+getTypeEngine());
    }
}
