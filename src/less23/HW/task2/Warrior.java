package less23.HW.task2;

public class Warrior extends GameCharacter {

    public Warrior(String name, int power) {
        super(name, power);
    }

    @Override
    public void atac() {
        System.out.println("Воин атакует с силой " +this.getPower());
    }

}
