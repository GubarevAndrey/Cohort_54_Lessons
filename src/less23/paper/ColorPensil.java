package less23.paper;

public class ColorPensil extends Pencil {
    private String color="red";

    @Override
    public void draw(String figureName) {
        System.out.println("Рисую цветным карандашом цвет "+color+" Фигуру:"+figureName);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
