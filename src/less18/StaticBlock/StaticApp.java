package less18.StaticBlock;

import java.util.Arrays;

public class StaticApp {
    public static void main(String[] args) {

        System.out.println(StaticBlockDemo.counter);

        System.out.println(Arrays.toString(StaticBlockDemo.colors));

        StaticBlockDemo demo=new StaticBlockDemo("Title");
        System.out.println(demo.toString());

    }
}
