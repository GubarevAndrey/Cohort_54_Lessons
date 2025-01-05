package less23.HW.task2;

public class Archer extends GameCharacter {
    public Archer(String name, int power) {
        super(name, power);
    }

    @Override
    public void atac() {
        System.out.println("Лучник атакует с силой " +this.getPower());
    }
}
