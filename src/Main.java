import transport.*;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada","Granta",1.7, new Driver_B("Sergey", true, 5),BodyType.BODY_TYPE_SEDAN);
        System.out.println(ladaGranta);
        printInfo(ladaGranta);
        ladaGranta.printType();
        System.out.println();

        Car audiA850LTDIQuattro = new Car("Audi","A8 50 L TDI quattro",3.0, new Driver_B("Mike", true, 10),BodyType.BODY_TYPE_COUPE);
        System.out.println(audiA850LTDIQuattro);
        printInfo(audiA850LTDIQuattro);
        audiA850LTDIQuattro.printType();
        System.out.println();

        Car bmwZ8 = new Car("BMW","Z8",3.0,new Driver_B("Konstantin",true,9),BodyType.BODY_TYPE_COUPE);
        System.out.println(bmwZ8);
        printInfo(bmwZ8);
        bmwZ8.printType();
        System.out.println();

        Car kiaSportage4Generation = new Car("Kia","Sportage 4 generation",2.4,new Driver_B("Vladislav",false,0),BodyType.BODY_TYPE_HATCHBACK);
        System.out.println(kiaSportage4Generation);
        printInfo(kiaSportage4Generation);
        kiaSportage4Generation.printType();
        System.out.println( );



        for (int i = 1; i <= 4; i++) {
            Driver_D driver_d = new Driver_D("Driver D " + i, true, 1 + i);
            Bus bus = new Bus("Bus brand " + i, "Bus Brand " + i, 3.5,driver_d, NumberOfSeats.NUMBER_OF_SEATS_MEDIUM);
            printInfo(bus);
            bus.printType();
            Truck truck = new Truck("Truck brand " + i, "Truck model " + i, 4 + i, new Driver_C("Driver C " + i, true, 6 + i),LoadCapacity.LOAD_CAPACITY_N1);
            printInfo(truck);
            truck.printType();

        }
//        Car hundaiAvante = new Car("Hundai", "Avante", 1.6,"Оранжевый",2016,"Южная Корея",  203,"Механика","Седан","в67па875",5,true,null);
//        System.out.println(hundaiAvante);
//        System.out.println( );
    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
    }


}