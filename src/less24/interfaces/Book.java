package less24.interfaces;
/*
   Если класс имплементировал Интерфейс то он берет
   на себя обязательство реализовать все поведение Интерфейса
   Класс реализует(имплементирует) Интерфейс
   Если класс не реализовал все методы абстрактного класса
   то класс должен обьявить себя абстрактным
    */
public class Book implements Printable{
     private String title;
     private String autor;

    public Book(String title, String autor) {
        this.title = title;
        this.autor = autor;
    }

    @Override
    public void print() {
        System.out.printf(" Book: %s (%s)\n",title,autor);
    }

    public void uniqueMethod(){
        System.out.println("uniqueMethod");
    }

}
