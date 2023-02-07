package transport;

import transport.*;
import java.util.*;

public class Car extends Transport<Driver_B> implements Competing {

    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, Driver_B driver, ArrayList<Mechanic> mechanics, BodyType bodyType) {
        super(brand, model, engineVolume, driver, mechanics);
        this.bodyType = bodyType;
    }



    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("не введен тип кузова");
        } else {
            System.out.println(bodyType);
        }
    }

    @Override
    public void mechanic() {
        if (mechanics == null) {
            System.out.println("нет механика");
        } else {
            System.out.println(mechanics);
        }
    }

    public void fixTheCar() {
        if (mechanics != null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getRepairSpecialization() == RepairSpecialization.SPECIALIZATION_CAR ||
                        mechanic.getRepairSpecialization() == RepairSpecialization.SPECIALIZATION_UNIVERSAL) {
                    mechanic.fixTheCar(this);
                }
            }
        }
    }

    @Override
    public void carryOutMaintenance() {
        if (mechanics != null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getRepairSpecialization() == RepairSpecialization.SPECIALIZATION_CAR||
                        mechanic.getRepairSpecialization() == RepairSpecialization.SPECIALIZATION_UNIVERSAL) {
                    mechanic.carryOutMaintenance(this);
                }
            }
        }
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public double getEngineVolume() {
        return super.getEngineVolume();
    }

    @Override
    public void setEngineVolume(double engineVolume) {
        super.setEngineVolume(engineVolume);
    }

    @Override
    public void startMove() {
        System.out.println(getBrand() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println(getBrand() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп");
    }

    @Override
    public void bestLapTime() {
        int minBount = 50;
        int maxBount = 80;
        int theBestLapTimeMin = (int) (minBount + (maxBount - minBount) * Math.random());
        System.out.println("Лучшее время круга " + theBestLapTimeMin);
    }

    @Override
    public void maxSpeed() {
        int minBount = 140;
        int maxBount = 200;
        int maxSpeed = (int) (minBount + (maxBount - minBount) * Math.random());
        System.out.println("Максимальная скорость " + maxSpeed);
    }

    @Override
    public void diagnosticsPass() {
        System.out.println("машина " + getBrand() + " " + getModel() + " проходит диагностику ");

    }



    //    private double engineVolume;
//    private String transmission;
//    private String bodyType;
//    private String registrationNumber;
//    private int numberOfSeats;
//    private boolean summerTires;
//    private Key key;
//
//    public static class Key {
//        private final boolean remoteRun;
//        private final boolean withoutAccess;
//
//        public Key(boolean remoteRun, boolean withoutAccess) {
//            this.remoteRun = remoteRun;
//            this.withoutAccess = withoutAccess;
//        }
//
//        public boolean isRemoteRun() {
//            return remoteRun;
//        }
//
//        public boolean isWithoutAccess() {
//            return withoutAccess;
//        }
//
//        @Override
//        public String toString() {
//            return (remoteRun ? "удаленный запуск " : "без удаленного запуска двигателя ") +
//                    (withoutAccess ? "бесключевой доступ " : "бесключевой доступ отсутствует ");
//        }
//    }
//
//    public Car(String brand, String model, double engineVolume, String color, int year, String country, int maxSpeed, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean summerTires, Key key) {
//        super(brand, model, year, country, color, maxSpeed);
//        setEngineVolume(engineVolume);
//        setTransmission(transmission);
//        if (bodyType == null || bodyType.isEmpty()) {
//            bodyType = "default";
//        }
//        this.bodyType = bodyType;
//        setRegistrationNumber(registrationNumber);
//        if (numberOfSeats <= 0) {
//            numberOfSeats = 4;
//        }
//        this.numberOfSeats = numberOfSeats;
//        this.summerTires = summerTires;
//        setKey(key);
//
//    }
//
//
//    public double getEngineVolume() {
//        return engineVolume;
//    }
//
//    public void setEngineVolume( double engineVolume) {
//        if (engineVolume <= 0) {
//            engineVolume = 1.5;
//        }
//        this.engineVolume = engineVolume;
//    }
//
//    public String getBodyType() {
//        return bodyType;
//    }
//    public String getTransmission() {
//        return transmission;
//    }
//    public void setTransmission(String transmission) {
//        if (transmission == null || transmission.isEmpty()) {
//            transmission = "Механика";
//        }
//        this.transmission = transmission;
//    }
//    public String getRegistrationNumber() {
//        return registrationNumber;
//    }
//
//    public void setRegistrationNumber(String registrationNumber) {
//        if (registrationNumber == null || registrationNumber.isEmpty()) {
//            registrationNumber = "х000хх000";
//        }
//        this.registrationNumber = registrationNumber;
//    }
//
//    public int getNumberOfSeats() {
//        return numberOfSeats;
//    }
//
//    public boolean isSummerTires() {
//        return summerTires;
//    }
//
//    public void setSummerTires(boolean summerTires) {
//        this.summerTires = summerTires;
//    }
//
//    public void changeTires(int mouth) {
//        if ((mouth >= 11 && mouth <= 12) || (mouth >= 1 && mouth <= 3)) {
//            summerTires = false;
//        }
//        if (mouth >= 4 && mouth <= 10) {
//            summerTires = true;
//        }
//    }
//    public Key getKey() {
//        return key;
//    }
//
//    public void setKey(Key key) {
//        if (key == null) {
//            key = new Key(false,false);
//        }
//        this.key = key;
//    }
//
//
//    public String toString() {
//        return super.toString() + ", " +
//                "Объем двигателя в литрах: " + engineVolume + ", " +
//                "Трансмиссия: " + transmission + ", " +
//                "Тип кузова: " + bodyType + ", " +
//                "Регистрационный номер: " + registrationNumber + ", " +
//                "Число сидений: " + numberOfSeats + ", " +
//                (summerTires ? "летняя" : "зимняя") + " резина" + ", " +
//                key;
//    }
}

