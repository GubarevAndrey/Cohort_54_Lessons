package less22.HW.task2;

public class transportApp {
    public static void main(String[] args) {
         Bicycle bicycle=new Bicycle("Conandoel");
         Car car=new Car("BMV","AT-89");
         Motorcycle motorcycle=new Motorcycle("Honda","Honda-20");
         Vechicle vechicles[] = new Vechicle[3];
         vechicles[0]=bicycle;
         vechicles[1]=car;
         vechicles[2]=motorcycle;
         for (int i=0; i< vechicles.length;i++){
             vechicles[i].startEngine();
        }

    }
}
