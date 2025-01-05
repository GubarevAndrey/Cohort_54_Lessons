package less21;


/*
   Для создания связи типа HAS-A мы определяем поле класса, в
   которой будет храниться ссылка на объект другого класса.
   Ассоциация ( в том числе агрегация и композиция ) организуется через создание  ссылок
   на другие объекты внутри класса.
   Отношение где один класс использует другой класс в качестве одного из своих полей.
   Класс содержит поле которое ссылается на оьекты другого класса
 */

public class BusDriver {
    private static int idCounter=100;
    private final int id;
    private String name;
    private String licenseNumer;// номер лицензии прав водителя

    public BusDriver(String name, String licenseNumer) {
        this.id=idCounter++;
        this.name = name;
        this.licenseNumer = licenseNumer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumer() {
        return licenseNumer;
    }

    public void setLicenseNumer(String licenseNumer) {
        this.licenseNumer = licenseNumer;
    }
    public String toString() {
        StringBuilder sb=new StringBuilder("BusDriver: {");
        sb.append("id: ").append(id);
        sb.append(", Name: ").append(name).append("}");
        return sb.toString();
    }

}
