package less24.flyers;

public class Boat extends Transport implements Swimmable {

    public Boat(int capacity) {
        super(capacity);
    }

    @Override
    void takePassenger() {
        System.out.println("Boat takePassenger");
        capacity++;
    }

    @Override
    public void swimm() {
        System.out.println("Boat is swimming");
    }
}
