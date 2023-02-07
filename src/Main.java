import exception.CarLicenceException;
import transport.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
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
        System.out.println( );

        Bus mercedesBenzSprinter = new Bus("Meredes-Benz", "Sprinter",3.0, evgeniy, mechanics, NumberOfSeats.SMALL);
        Truck ural = new Truck("ural", "4320", 6.6,valeriy, mechanics, LoadCapacity.N2);

        for (int i = 1; i <= 4; i++) {
            Driver_D driver_d = new Driver_D("Driver D " + i, true, 1 + i);
            Bus bus = new Bus("Bus brand " + i, "Bus Brand " + i, 3.5,driverD, mechanics, NumberOfSeats.MEDIUM);
            printInfo(bus);
            bus.printType();
            System.out.println();
            Truck truck = new Truck("Truck brand " + i, "Truck model " + i, 4 + i,driverC, mechanics,LoadCapacity.N1);
            printInfo(truck);
            truck.printType();
            System.out.println();
        }

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

        System.out.println(transports);
        System.out.println();
        System.out.println();

        ladaGranta.carryOutMaintenance();
        System.out.println();
        ladaGranta.carryOutVehicle();
        System.out.println();


        Queue<Transport> transportQueue = new LinkedList<>();
        transportQueue.offer(ladaGranta);
        transportQueue.offer(audiA850LTDIQuattro);
        transportQueue.offer(bmwZ8);
        transportQueue.offer(kiaSportage4Generation);
        transportQueue.offer(mercedesBenzSprinter);
        transportQueue.offer(ural);
        System.out.println("Очередь " + transportQueue);


    }


    private static void printInfo(Transport<?> transport) {
        System.out.println("водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
    }
}

//        Car hundaiAvante = new Car("Hundai", "Avante", 1.6,"Ораневый",2016,"Южная Корея",  203,"Механика","Седан","в67па875",5,true,null);
//        System.out.println(hundaiAvante);
//        System.out.println( );