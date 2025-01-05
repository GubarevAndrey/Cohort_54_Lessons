package less23.HW.task2;

public class Mage extends GameCharacter {
    public Mage(String name, int power) {
        super(name, power);
    }

    @Override
    public void atac() {
        System.out.println("Маг атакует с силой " +this.getPower());
    }
}
