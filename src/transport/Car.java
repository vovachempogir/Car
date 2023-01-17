package transport;

import java.time.LocalDate;

public class Car extends Transport {

    private double engineVolume;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean summerTires;

    public Car(String brand, String model, int year, String country, String color, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }


    public double getEngineVolume() {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        return engineVolume;
    }

    public void setEngineVolume( double engineVolume) {
        if (engineVolume!=0 ) {
            this.engineVolume = engineVolume;
        }
    }

    public String getBodyType() {
        if (bodyType == null || bodyType.isEmpty()) {
            bodyType = "default";
        }
        return bodyType;
    }
    public String getTransmission() {
        if (transmission == null || transmission.isEmpty()) {
            transmission = "default";
        }
        return transmission;
    }
    public void setTransmission(String transmission) {
        if (transmission!=null && ! transmission.isEmpty() && !transmission.isBlank()) {
            this.transmission = transmission;
        }
    }
    public String getRegistrationNumber() {
        if (registrationNumber == null || registrationNumber.length() != 9) {
            registrationNumber = "х000хх000";
        }
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && registrationNumber.length() == 9 && registrationNumber.isBlank()) {
            this.registrationNumber = registrationNumber;
        }

    }

    public int getNumberOfSeats() {
        if (numberOfSeats <= 0) {
            numberOfSeats = 4;
        }
        return numberOfSeats;
    }

    public boolean getSummerTires() {
        return summerTires;
    }

    public void seasonalTireCheck(Car car) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        if (( month>4 || month<10) && getSummerTires() == true) {
            System.out.println ("Менять резину не надо");
        }
        else {
            System.out.println ("Сменить шины на сезонные");
        }

    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public void Car() {
        System.out.println("Марка автомобиля: " + getBrand());
        System.out.println("Модель: " + getModel());
        System.out.println("Объем двигателя в литрах: " + getEngineVolume());
        System.out.println("Цвет кузова: " + getColor());
        System.out.println("Год производства: " + getYear());
        System.out.println("Страна сборки: " + getCountry());
        System.out.println("Трансмиссия: " + getTransmission());
        System.out.println("Тип кузова: " + getBodyType());
        System.out.println("Регистрационный номер: " + getRegistrationNumber());
        System.out.println("Число сидений: " + getNumberOfSeats());
    }
}

