package less23.paper;

public class MainPaper {
    public static void main(String[] args) {
        Paper paper=new Paper();
        Pencil pencil=new Pencil();

        // Кастинг позволяет передать любого в метод
        // drawFigure обьект любого дочернего класса
        Pen pen = new Brash();

        paper.drawFigure("Квадрат",pencil);
        paper.drawFigure("Овал", new Brash());
        paper.drawFigure("Овал", new Eraser());
        paper.drawFigure("Квадрат",new Marker());

        ColorPensil colorPensil=new ColorPensil();
        paper.drawFigure("Солнце",colorPensil);
        colorPensil.setColor("Blue");
        paper.drawFigure("Солнце",colorPensil);

        Pen[] pens=new Pen[] {pencil,new Brash(),new Eraser(), new Marker(),colorPensil};
        for (int i=0; i< pens.length;i++ ){
            paper.drawFigure("Радуга",pens[i]);
        }
    }
}
