package less20.transport;

public class TransportApp {
    public static void main(String[] args) {
        Bus bus = new Bus("X1", 2020, 10);
        System.out.println(bus.toString());
        bus.start();
        bus.stop();
        System.out.println(bus.getModel());
        System.out.println(bus.getCapacity());

        Train train = new Train("Train-M1", 2024, 4, 15);
        System.out.println(train.getCapacity());
        train.setCountWagons(6);
        System.out.println(train.getCapacity());
    }
}
