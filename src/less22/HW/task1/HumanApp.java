package less22.HW.task1;

public class HumanApp {
    public static void main(String[] args) {
        Human human=new Human("Peter",10,15);
        Human_lite hLite=new Human_lite("Vasia",15,10);
        Human_profi hProfi=new Human_profi("Tolik",25,5);
        human.run();
        hLite.run();
        hProfi.run();
        System.out.println(human.getName());
    }



}
