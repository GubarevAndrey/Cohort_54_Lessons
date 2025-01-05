package less20.transport.HW;

public class Rectangel extends Shape{
    private double wight;
    private double height;

    public Rectangel(String name, double wight, double height) {
        super(name);
        this.wight = wight;
        this.height = height;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void setDimension(double wight, double height) {
        this.wight=wight;
        this.height=height;
    }
    public double calculateArea (){
        return wight*height;
    }
}
