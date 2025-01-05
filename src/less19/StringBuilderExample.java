package less19;

public class StringBuilderExample {
    public static void main(String[] args) {
        /* String - не изменяемый обьект.
        Если написать
        String s="Java"+" " + "is"+" "+"the"+" "+"best" то для его создания будум в памяти созданы объекты
        Java-> Java -> Java the->  Java the ->  Java the best   То есть в памяти создастся несколько
        обьетов а потом уже переменной s будет присвоена ссылка на последний созданный

        Класс StringBuilder создан для решения этой проблемы.
        StringBuilder-специальный класс, предназначенный для эффективного создания и
        модификации изменяемой последовательности символов
        В отличае от класса String, обьекты StringBuilder могут изменятся без создания дополнительных
        обьектов в памяти, что повышает производительность при частом работе со строками

         */
        StringBuilder sb= new StringBuilder();
        StringBuilder sb1=new StringBuilder("Hello");

        sb1.append(" ");
        sb1.append("world").append("!");// аналог конкатенации но без создания дополнительного обьекта в памяти.
        //Можно ставить append сколько угодно

        String string = sb1.toString();

        System.out.println(string);

    }
}
