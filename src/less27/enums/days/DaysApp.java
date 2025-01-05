package less27.enums.days;

public class DaysApp {
    public static void main(String[] args) {

        for (Day day: Day.values()){
            System.out.println(day);
            System.out.println(day.getRussianName());
            System.out.println(day.getDayNumber());
            System.out.println(day.testMethod());
            System.out.println("=========");
        }
    }

}
