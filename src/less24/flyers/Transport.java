package less24.flyers;

public abstract class Transport {
    protected int capacity;

    public Transport(int capacity) {
        this.capacity = capacity;
    }
    abstract void takePassenger();

    public int countPassengers(){
        return capacity;
    }
}
