package less21;

public class AutoPark {
    public static void main(String[] args) {

        BusDriver busDriver=new BusDriver("John","LN-6586");
        Autobus bus=new Autobus(busDriver,15);
      //  System.out.println(busDriver.toSting());
        System.out.println(bus.toString());

        BusDriver peter = new BusDriver("Peter","LN=12345");
        System.out.println(bus.toString());
        bus.setDriver(peter);
        System.out.println(bus.toString());
        System.out.println(busDriver.toString());

        BusDriver margo =new BusDriver("Margo","AE-567");
        Autobus bus1 = new Autobus(margo,24);
        System.out.println(bus1.toString());
        margo.setName("Margo-Susana");
        System.out.println(bus1.toString());

        // Если удалить обьект  то с ним удаляется и обьект который
        // с ним в жесткой связке(в композиции)
       // bus1=null;
        /*
        После этого удалится и bus1 и Autopilot внутри. Но водитель
        margo останется
         */

        System.out.println(margo.toString());
        Passenger passenger=new Passenger("Alex");
        Passenger passenger1=new Passenger("Max");
        System.out.println(passenger.toString());
        System.out.println(passenger1.toString());
        bus.takePassenger(passenger);
        System.out.println("countPassenger:"+bus.getCountPassengers());
        bus.takePassenger(passenger1);
        System.out.println("countPassenger:"+bus.getCountPassengers());
        bus.takePassenger(passenger);
        System.out.println("countPassenger:"+bus.getCountPassengers());




    }
}
