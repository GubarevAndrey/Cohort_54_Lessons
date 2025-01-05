package less22.HW.task1;

public class Human {
    private String name;
    private int speed;
    private int time;
    public Human(String name,int speed, int time) {
        this.name = name;
        this.speed=speed;
        this.time=time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }


    public void run(){
        System.out.println("Меня зовут " + this.name+"я бегу "+this.speed+" км/ч");
        pause();
    }
    public void pause(){
        System.out.println("я отдыхаю "+this.time+" минут");
    }
}
