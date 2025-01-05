package less19.HW19_task4;

import java.util.Random;

public class Dog {
    private static int [] barier;
    private String name;
    private int hight;
    private int hightMax;
    private int jampNum=0;


    public static int[] getBarier() {
        return barier;
    }


    static {
        Random  r = new Random();
        barier = new int[6];
        for(int i=0; i<6;i++) {
             barier[i]=r.nextInt(101)+70;
        }
    }

    public Dog(String name) {
        Random  r = new Random();
        if (name.length()>0) {
            this.name=name;
        }
        this.hight=r.nextInt(51)+30;
        this.hightMax=2*this.hight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("Меня зовут: %s, " +
                "Сейчас я прыгаю на высоту: %d, " +
                "Максимально смогу прыгнуть: %d"+
                " Кол-во перепрыгнутых барьеров: %d",name,hight,hightMax,jampNum);
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
        for (int i=0; i< barier.length;i++){
            if (barier[i]<=this.hightMax) {
                while (this.hight<barier[i]) {
                    trening();
                }
                this.jampNum=this.jampNum+1;
                System.out.println("Прыгаю через барьер:"+barier[i]);
            } else {
                System.out.println("Я не смогу через барьер:"+barier[i]);
            }
        }

    }

}
