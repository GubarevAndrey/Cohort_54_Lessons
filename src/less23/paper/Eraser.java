package less23.paper;

public class Eraser extends Pen{

    @Override
    public void draw(String figureName) {
        System.out.println("Стираю фигуру "+figureName);
    }
}
