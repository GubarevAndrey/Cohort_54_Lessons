package less20.transport;

public class Vehicle {
    protected String model; // protected - позволяет видеть это поле в классе-наследнике
    private int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Если не вызвать конструктор родителя из потомка то поля родителя будут по умолчанию
    // то есть этот(который без параметров
    public Vehicle() {
        this.model = "Default";
        this.year = 2004;
    }

    public void start() {
        System.out.println(model+" начинает движение");
    }

    public void stop() {
        System.out.println(model+" останавливается");
    }

    public String toString() {
        return "Модель: "+model+" Год выпуска: "+year;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
