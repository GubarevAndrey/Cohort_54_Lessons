package less24.interfaces;

public class PrinterApp {
    public static void main(String[] args) {
        Printable book = new Book("Философия Java","Б.Эккель");
        book.print();
        //до метода uniqueMethod достучаться из ссылки
        // book нельзя
        // book.uniqueMethod(); Потому что она имеет тип  Printable
        // Но доступны методы Object
        System.out.println(book.toString());
        book.defaulMethod();



        Printable.staticMethod();
        /* Статическим методом интерфейса можно воспользоваться
        только от имени Интерфейса
        */

        Printable journal =new Journal("Cosmopolitan", 154);
        journal.print();
        journal.defaulMethod();
        ColorPrintable colorPrintable=new Presentation(
                "Interitance","Noname",
                "Interitance in OOP",20);
        colorPrintable.print();
        colorPrintable.colorPrint();
        colorPrintable.defaulMethod();
    }
}
