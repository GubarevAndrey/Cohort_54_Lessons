package less22.HW.task2;

public class Bicycle extends Vechicle {

    public Bicycle(String model) {
        super(model);
    }
    public Bicycle(String model,String engine) {
        super(model,engine);
    }
    @Override
    public void startEngine(){
        System.out.println("У велосипеда "+getModel()+" нет двигателя");
    }
}
