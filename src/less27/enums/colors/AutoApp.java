package less27.enums.colors;

public class AutoApp {
    public static void main(String[] args) {

        Color red= Color.RED;
        Auto auto=new Auto("Model1", Color.BLUE);
        System.out.println(auto);

        auto.setColor(red);
        System.out.println(auto);

        System.out.println("================");

        // В enum есть несколько методов:

        // 1. Возвращает массив значений
        Color[] colors= Color.values();
        for (Color currentColor: colors) {
            System.out.println(currentColor);
        }

        System.out.println("================");

        //2. Возвращает enum по строковому имени
        Color color1= Color.valueOf("RED");
        System.out.println(color1);

        System.out.println("================");

        //3. Получить имя константы(строку)
        String name= Color.GREEN.name();
        System.out.println(name);

        System.out.println("================");

        //4. Получить порядковый номер константы(начинаются с 0)
        int ordinal= Color.GREEN.ordinal();
        System.out.println(ordinal);

        System.out.println("================");

        switch (auto.getColor()) {
            case RED:
                System.out.println("RED");
                break;
            case GREEN:
                System.out.println("GREEN");
                break;
            case BLUE:
                System.out.println("BLUE");
                break;
        }

        System.out.println("================");

        //Enum безопасно сравнивать с помощью ==
        auto.setColor(Color.BLUE);
        if(auto.getColor()== Color.BLUE) {
            System.out.println("Цвет авто синий");
        } else {
            System.out.println("Цвет авто не синий");
        }


    }
}
