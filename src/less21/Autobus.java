package less21;
/*
   Для создания связи типа HAS-A мы определяем поле класса, в
   которой будет храниться ссылка на объект другого класса.
   Ассоциация ( в том числе агрегация и композиция ) организуется через создание  ссылок
   на другие объекты внутри класса.
   Отношение где один класс использует другой класс в качестве одного из своих полей.
   Класс содержит поле которое ссылается на оьекты другого класса

   Важные аспекты ассоциации:
   -Направленность связи -бывает однонаправленная и двунаправленная
   - Кардинальность связи-определяет сколько обьектов одного класса
       может ассоциировано с обьектом другого класса
       One-to-One(Один к одному), One-to-Many(Один ко многим),
       Manu-to-Many(многие ко многим)
       1. One-to-One -Пример-Автобус и двигатель-каждый автобус будет иметь
          один двигатель. Так же на каждый двигатель- один автобус
       2. One-to-Many. Пример- Автобус и список пассажиров. Один автобус
          может перевозить множество пассажиров. Каждый пассажир находится
          в одном автобусе.
       3. Many-to-Many. Например Массив автобусов и список автобусных остановок
          Каждый автобус может останавливаться на множестве остановок, а каждая
          остановка может обслужить множество автобусов
 */
public class Autobus {
    private static int count;// счетчик
    private final int id; // ввели поле идентификатор объекта
    private final int capacity;// вместимость автобуса

    //Подя хранящие ссылки на BusDriver  и Autopilot
    private BusDriver driver;// делаем агрегацию -поле, хранящее ссылку на объект BusDriver - для создания связи
    private AutoPilot autoPilot;//будем делать композицию(жесткую связь)

    //агрегация однонаправленная One-to Many
    private final Passenger[] passengers;// список пассажиров
    private int countPassengers; // кол-во пассажиров текущее

    public Autobus(BusDriver busDriver, int capacity) {
        this.id=count++;
        this.capacity = capacity;

        ////в конструкторе присваиваем ссылку
        this.driver=busDriver; // в конструкторе присваиваем ссылку

        //в конструкторе создаем объект autoPilot прямо внутри
        // при создании обьекта Autobus
        this.autoPilot=new AutoPilot("AP-001");
        //чтобы авторилот знал каком он автобусе (для двунаправленной
        this.autoPilot.setAutobus(this);//this ссылка на текущий обьек
                                     /*   мы находимся внутри класса Автобус
                                       поэтому передастся ссылка на текущий
                                       обьект-Авытобус*/
        this.passengers=new Passenger[capacity];

    }

    // если создана композиция- жесткая связь то принято вводить изменения
    // (в Autipilot) из Autobus с помощью метода
    // Объект автобуса будет управлять версией автопилота
    public void updateAutopilotVersion(String version) {
        this.autoPilot.setSoftwareVersion(version);
    }

    public boolean takePassenger(Passenger passenger){
        /*
        Надо проверить:
        1. Есть ли свободные места
        2. Есть ли этот пассажир уже в автобусе
        3. Если проверки прошли то садим пассажира на борт
           3.1 Добавляем его в список пассажиров
           3.2 Увеличиваем кол-во пассажиров в автобусе
           3.3 Вернуть true
        4. Если чтото пошло не так выводим сообщение
           об ошибке и сообщаем false
         */
        if (countPassengers<capacity) {
            if (isPassengerInBus(passenger)) {
                System.out.printf("Пассажир c id:%d уже в автобусе %d ",
                        passenger.getId(),this.id);
                return false;
            }
            // садим на борт
            passengers[countPassengers]=passenger;
            countPassengers++;
            System.out.printf("Пассажир c id:%d завершил посадку в автобус %d\n",
                    passenger.getId(),this.id);
            return true;
        }
        System.out.printf("В атобусе %d мест нет\n", this.id);
        return false;
    }

    private boolean isPassengerInBus(Passenger passenger) {
        for (int i=0;i<countPassengers;i++) {
            if (passengers[i].getId()==passenger.getId()){
                return true;
            }
        }
        return false;
    }

    // если вообще хотим новую программу автопилота
    public void instalAutopilotVersion(String softwareVersion) {
        /* Если двунаправленная связь то нужно следить
        за ссылками между обьектами
         */
        this.autoPilot=new AutoPilot(softwareVersion);
        this.autoPilot.setAutobus(this);
    }
    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "id=" + id +
                ", capacity=" + capacity +
                ", driver=" + driver.toString()+
                ", autopilot=" + autoPilot.toString()+
                '}';
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }


}
