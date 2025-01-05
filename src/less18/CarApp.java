package less18;

public class CarApp {
    public static void main(String[] args) {
         Car car = new Car("BMW",200);
        System.out.println(car.toString());
         Car vw= new Car("VW",300);
         System.out.println(car.toString());
        System.out.println(vw.toString());
    }
}
