package less20.transport.HW;

public class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public char displayInfo() {
        System.out.println("Название фигуры: "+this.name);
        return 0;
    }

}
