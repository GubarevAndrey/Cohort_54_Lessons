package less18;

public class Car {
    public static int totalCars;
    private String model;
    private int power;

    public Car(String model, int power) {
        this.model = model;
        this.power = power;
        totalCars++;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public String toString(){
        return String.format("Auto-model: %s , power: %d, Всего создано: %d",model,power,totalCars);
    }
}
