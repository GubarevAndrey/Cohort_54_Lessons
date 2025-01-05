package less27.enums.days;

//Enum может иметь поля, конструкторы, сеттеры и геттеры  и методы
public enum Day {
    MONHDAY("Понедельник",1),
    TUESDAY("Вторник",2),
    WEDNSDAY("Среда",3),
    THURSDAY("Четверг",4),
    FRIDAY("Пятница",5),
    SATURDAY("Суббота",6),
    SANDAY("Воскресенье",7);

    //Для каждой позиции enum  хотим создать поля с разными названиями и номером дня недели
    private String russianName;
    private int dayNumber;

    Day(String russianName, int dayNumber) {
        this.russianName = russianName;
        this.dayNumber = dayNumber;
    }
    // Конструктор может быть перегружен
    Day(String russianName) {
        this.russianName = russianName;
        this.dayNumber = 7;
    }

    public String testMethod(){
        return String.format("%s -русский перевод: %s; номер дня недели: %d",
                this.name(),this.russianName,this.dayNumber);
    }

    public String getRussianName() {
        return russianName;
    }

    public void setRussianName(String russianName) {
        this.russianName = russianName;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }
}
