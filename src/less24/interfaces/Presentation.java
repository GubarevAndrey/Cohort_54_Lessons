package less24.interfaces;

public class Presentation implements ColorPrintable{
    private String title;
    private String author;
    private String theme;
    private int pages;

    public Presentation(String title, String author, String theme, int pages) {
        this.title = title;
        this.author = author;
        this.theme = theme;
        this.pages = pages;
    }

    @Override
    public void colorPrint() {
        System.out.println("Отправляю презентацию в типографию");
        System.out.println("Presentation by author: "+author+"; title: "+title);
    }

    @Override
    public void print() {
        System.out.println("Presentation title: "+title+"; pages:"+pages);

    }
}
