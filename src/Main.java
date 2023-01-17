import transport.Bus;
import transport.Car;
import transport.Transport;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada","Granta",2015,"Россия","Желтый",172);
        ladaGranta.setTransmission("Автомат");
        ladaGranta.setColor("Серебрянный");
        ladaGranta.setMaxSpeed(0);
        ladaGranta.Car();
        System.out.println(ladaGranta.getMaxSpeed());

        ladaGranta.seasonalTireCheck(ladaGranta);
        System.out.println();

        Car audiA850LTDIQuattro = new Car("Audi","A8 50 L TDI quattro",2020,"Германия","Черный",286);
        audiA850LTDIQuattro.Car();
        System.out.println();

        Car bmwZ8 = new Car("BMW","Z8",2021,"Германия","Черный",250);
        bmwZ8.Car();
        System.out.println();

        Car kiaSportage4Generation = new Car("Kia","Sportage 4 generation",2018,"Южная Корея","Красный",186);
        kiaSportage4Generation.Car();
        System.out.println( );

        Car hundaiAvante = new Car("Hundai", "Avante", 2016, "Южная Корея", "Оранжевый", 203);
        hundaiAvante.Car();
        System.out.println( );

        Bus bus = new Bus("", "", 0, "", "", 0);
        bus.Bus();
    }
}