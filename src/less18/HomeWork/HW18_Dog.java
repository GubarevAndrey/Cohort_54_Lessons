package less18.HomeWork;

public class HW18_Dog {
    private String name;
    private int hight;
    private static int tempName=0;
    private static int barier=0;
    private final int hightMax;

    public static int getBarier() {
        return barier;
    }

    public static void setBarier(int barier) {
        HW18_Dog.barier = barier;
    }
    public HW18_Dog (String name, int hight) {

        if (name !=null && name.length()>0) {
            this.name=name;
        } else {
            tempName=tempName+1;
            this.name="JACK"+tempName;
            System.out.println("Собака должна иметь имя"
            +" -Собаке присвоено имя: JACK"+tempName);
        }
        if (hight >0) {
            this.hight=hight;
            this.hightMax=2*hight;
        }else {
            this.hight=20;
            this.hightMax=2*hight;
            System.out.println("Некорректная высота прыжка"
                    +" Присвоена высота:"+this.hight+
                    " Присвоена макс высота: "+this.hightMax);
        }
    }

    public String toString() {
        return String.format("Меня зовут: %s, " +
                "Сейчас я прыгаю на высоту: %d, " +
                "Максимально смогу прыгнуть: %d",name,hight,hightMax);
    }

    public void jamp(){
          System.out.println("Я прыгаю на высоту:"+ this.hight);
    }

    public int trening() {
        if (this.hight<hightMax) {
            this.hight=this.hight+10;
            System.out.println("Я тренируюсь. Теперь я могу прыгать на высоту:"+ this.hight);
        }  else {
            System.out.println("Мне не нужна тренировка. Я выше не смогу прыгнуть");
        }
        return this.hight;
    }

    public void jampBarier() {
        if (barier<=this.hightMax) {
            while (this.hight<barier) {
                    trening();
            }
            System.out.println("Прыгаю через барьер");
        } else {
            System.out.println("Я не смогу прыгнуть высоту:"+barier);
        }
    }

}
