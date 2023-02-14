import exception.CarLicenceException;
import transport.*;

import java.util.*;

public class Main {
    protected Queue<ServiceStation> transportQueue;

    public static void main(String[] args) throws CarLicenceException {
        ArrayList<Mechanic> mechanics = new ArrayList<>();
        Mechanic andrey = new Mechanic("Андрей", "Авалон", RepairSpecialization.SPECIALIZATION_CAR);
        Mechanic nikolay = new Mechanic("Николай", "Компания", RepairSpecialization.SPECIALIZATION_BUS);
        Mechanic stanislav = new Mechanic("Станислав", "ТО", RepairSpecialization.SPECIALIZATION_TRUCK);
        Mechanic vladimir = new Mechanic("Владимир", "Ремонт", RepairSpecialization.SPECIALIZATION_UNIVERSAL);
        mechanics.add(andrey);
        mechanics.add(nikolay);
        mechanics.add(stanislav);
        mechanics.add(vladimir);

        ArrayList<Driver> drivers = new ArrayList<>();
        Driver_B sergey = new Driver_B("Сергей", true, 5);
        Driver_B mikhail = new Driver_B("Михаил", true, 10);
        Driver_B konstantin = new Driver_B("Константин", true, 9);
        Driver_B vladislav = new Driver_B("Владислав", true, 4);
        Driver_D evgeniy = new Driver_D("Евгений", true, 14);
        Driver_D driverD = new Driver_D("Driver D ", true, 1);
        Driver_C valeriy = new Driver_C("Валерий", true, 7);
        Driver_C driverC = new Driver_C("Driver C ", true, 6);

        drivers.add(sergey);
        drivers.add(mikhail);
        drivers.add(konstantin);
        drivers.add(valeriy);
        drivers.add(evgeniy);
        drivers.add(driverD);
        drivers.add(valeriy);
        drivers.add(driverC);

        ArrayList<Transport> transports = new ArrayList<>();

        Car ladaGranta = new Car("Lada", "Granta", 1.7, sergey, mechanics, BodyType.BODY_TYPE_SEDAN);
        System.out.println(ladaGranta);
        printInfo(ladaGranta);
        ladaGranta.printType();
        Transport.performDiagnostics(ladaGranta);
        transports.add(ladaGranta);
        System.out.println();

        Car audiA850LTDIQuattro = new Car("Audi", "A8 50 L TDI quattro", 3.0, mikhail, mechanics, BodyType.BODY_TYPE_COUPE);
        System.out.println(audiA850LTDIQuattro);
        printInfo(audiA850LTDIQuattro);
        audiA850LTDIQuattro.printType();
        System.out.println();

        Car bmwZ8 = new Car("BMW", "Z8", 3.0, konstantin, mechanics, BodyType.BODY_TYPE_COUPE);
        System.out.println(bmwZ8);
        printInfo(bmwZ8);
        bmwZ8.printType();
        System.out.println();

        Car kiaSportage4Generation = new Car("Kia", "Sportage 4 generation", 2.4, vladislav, mechanics, BodyType.BODY_TYPE_HATCHBACK);
        System.out.println(kiaSportage4Generation);
        printInfo(kiaSportage4Generation);
        kiaSportage4Generation.printType();
        System.out.println();

        Bus mercedesBenzSprinter = new Bus("Mercedes-Benz", "Sprinter", 3.0, evgeniy, mechanics, NumberOfSeats.SMALL);

        Truck ural = new Truck("Ural", "4320", 6.6, valeriy, mechanics, LoadCapacity.N2);

        transports.add(ladaGranta);
        transports.add(audiA850LTDIQuattro);
        transports.add(bmwZ8);
        transports.add(kiaSportage4Generation);
        transports.add(mercedesBenzSprinter);
        transports.add(ural);

        ladaGranta.fixTheCar();
        audiA850LTDIQuattro.fixTheCar();
        bmwZ8.fixTheCar();
        kiaSportage4Generation.fixTheCar();
        mercedesBenzSprinter.fixTheCar();
        ural.fixTheCar();
        System.out.println();

        ladaGranta.carryOutMaintenance();
        System.out.println();
        System.out.println();

        ServiceStation station = new ServiceStation();
        station.addTransportQueue(ladaGranta);
        station.addTransportQueue(audiA850LTDIQuattro);
        station.addTransportQueue(bmwZ8);
        station.addTransportQueue(kiaSportage4Generation);
        station.addTransportQueue(mercedesBenzSprinter);
        station.addTransportQueue(ural);

        station.runTO();
        station.runTO();

    }
//        Queue(ladaGranta);
//        Queue(audiA850LTDIQuattro);
//        Queue(bmwZ8);
//        Queue(kiaSportage4Generation);
//        Queue(mercedesBenzSprinter);
//        Queue(ural);
//        System.out.println();

//    public static void Queue(Transport transportsQueue){
//        Queue<Transport> transports = new LinkedList<>();
//        transports.offer(transportsQueue);
//        System.out.println("Авто добавлено в очередь: " + transports.peek());
//        Transport transport;
//        while ((transport = transports.poll()) != null) {
//            System.out.println("Авто удален из очереди: " + transport);
//        }
//    }


    private static void printInfo(Transport<?> transport) {
        System.out.println("водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
    }
}

//        Car hundaiAvante = new Car("Hundai", "Avante", 1.6,"Ораневый",2016,"Южная Корея",  203,"Механика","Седан","в67па875",5,true,null);
//        System.out.println(hundaiAvante);
//        System.out.println( );