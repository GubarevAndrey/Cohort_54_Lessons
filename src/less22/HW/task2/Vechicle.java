package less22.HW.task2;

public class Vechicle {
    private String model;
    private String typeEngine;

    public Vechicle(String model) {
        this.model = model;
        this.typeEngine=null;
    }
    public Vechicle(String model,String typeEngine) {
        this.model = model;
        this.typeEngine=typeEngine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public void startEngine(){

    }
}
