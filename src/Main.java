import transport.Bus;
import transport.Car;
import transport.Transport;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada","Granta",1.7, "Желтый", 2015, "Россия", 172, "Механика", "Седан","т123лм123",5, true,null);
        System.out.println(ladaGranta);
        System.out.println();

        Car audiA850LTDIQuattro = new Car("Audi","A8 50 L TDI quattro",3.0,"Черный",2020,"Германия",286,"Автомат", "Купе", "л453ло234",4,false,new Car.Key(true, true));
        System.out.println(audiA850LTDIQuattro);
        System.out.println();

        Car bmwZ8 = new Car("BMW","Z8",3.0,"Черный",2021,"Германия",250, "Автомат","Купе","т543то345",4,false,new Car.Key(true, true));
        System.out.println(bmwZ8);
        System.out.println();

        Car kiaSportage4Generation = new Car("Kia","Sportage 4 generation",2.4,"Красный",2018,"Южная Корея",186,"Механика","Кроссовер","п897ыв789",5,true,new Car.Key(false, true));
        System.out.println(kiaSportage4Generation);
        System.out.println( );

        Car hundaiAvante = new Car("Hundai", "Avante", 1.6,"Оранжевый",2016,"Южная Корея",  203,"Механика","Седан","в67па875",5,true,null);
        System.out.println(hundaiAvante);
        System.out.println( );

        for (int i = 1; i <= 3; i++) {
            Bus bus = new Bus("Bus brand " + i, "Bus Brand " + i, 2014 + i, "Россия", "Синий", 100);
            System.out.println(bus);
        }
        
    }
}