package less24.task1;

public class App {
    public static void main(String[] args) {
        Circle circle=new Circle(5);
        System.out.println("Площадь круга: "+circle.area());
        System.out.println("Периметр круга: "+circle.perimeter());

        Rectangle rectangle=new Rectangle(5,6);
        System.out.println("Площадь прямоугольника: "+rectangle.area());
        System.out.println("Периметр прямоугольника: "+rectangle.perimeter());

        Triangel triangel=new Triangel(4,4,4);

        System.out.println("Площадь треугольника: "+triangel.area());
        System.out.println("Периметр треугольника: "+triangel.perimeter());

        Shape[] shapes=new Shape[3];
        shapes[0]=circle;
        shapes[1]=rectangle;
        shapes[2]=triangel;

        double areaTotal=0;
        double perimeterTotal=0;

        for(int i=0;i< shapes.length;i++){
            areaTotal=areaTotal+shapes[i].area();
            perimeterTotal=perimeterTotal+shapes[i].perimeter();
        }
        System.out.println("Total area="+areaTotal);
        System.out.println("Total perimeter="+perimeterTotal);
    }
}
