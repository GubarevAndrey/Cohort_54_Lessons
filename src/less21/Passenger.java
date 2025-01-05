package less21;

public class Passenger {
    private static int counter;
    private final int id;
    private String name;

    public Passenger(String name) {
        this.name = name;
        this.id=counter++;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
