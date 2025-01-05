package less22.HW.task2;

public class  Motorcycle extends Vechicle {
    public Motorcycle(String model) {
        super(model);
    }
    public Motorcycle(String model, String typeEngine) {
        super(model, typeEngine);
    }
    @Override
    public void startEngine(){
        System.out.println("Мотоцикл "+getModel()+" включил двигатель "+getTypeEngine());
    }
}
