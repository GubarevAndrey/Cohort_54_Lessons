package less27.HW.task1;

public enum Year {
    SPRING (3,10,15),
    SUMMER(20,25,22),
    AUTUMN(20,15,8),
    WINTER(-10,-15,-12);
    private double temperature1;
    private double temperature2;
    private double temperature3;

    Year(int temperature1, int temperature2, int temperature3) {
        this.temperature1 = temperature1;
        this.temperature2 = temperature2;
        this.temperature3 = temperature3;
    }


    public String outTemperatura() {
        double average =(this.temperature1+this.temperature2+this.temperature3)/3;

        return "Время года: "+this.name()+" - средняя температура: "+average;
    }
}
