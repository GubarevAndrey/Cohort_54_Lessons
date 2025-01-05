package less23.HW.task2;

public abstract class GameCharacter {
    private String name;
    private int power;

    public GameCharacter(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public abstract void atac();

}
