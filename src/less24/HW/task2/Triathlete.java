package less24.HW.task2;

public class Triathlete implements Swimmer,Runner{

    private String name;

    public Triathlete(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Спортсмен "+name+" бежит");

    }

    @Override
    public void swimm() {
        System.out.println("Спортсмен "+name+" плывет");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
