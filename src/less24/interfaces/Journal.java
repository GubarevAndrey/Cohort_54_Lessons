package less24.interfaces;

public class Journal implements Printable {
    private String name;
    private int number;

    public Journal(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void print() {
        System.out.println("Journal "+name+", № "+number);
    }

    @Override
    public void defaulMethod() {
        System.out.println("default method from journal ");

        /*Специфика обращения к Интерфейсу в
        качестве super        */
        //  Printable.super.defaultMethod();
    }
}
