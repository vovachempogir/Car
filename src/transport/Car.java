package transport;

import java.time.LocalDate;

public class Car {
    public static class Key{
        private boolean remoteEngineStart;
        private boolean keylessEntry;

        public Key(boolean remoteEngineStart,boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }

        public boolean getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean getKeylessEntry() {
            return keylessEntry;
        }

    }
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean summerTires;

    public Car(String brand, String model, double engineVolume, String color, int year, String county) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = county;
    }

    public Car(){
        brand = "default";
        model = "default";
        country = "default";
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        if (color == null) {
            color = "Белый";
        }
        if (year <= 0) {
            year = 2000;
        }
    }

    public String getBrand() {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        return brand;
    }

    public String getModel() {
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        return model;
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

    public String getColor() {
        if (color == null || color.isEmpty()) {
            color = "Белый";
        }
        return color;
    }
    public void setColor( String color) {
        if (color!=null && ! color.isEmpty()&& !color.isBlank()) {
            this.color = color;
        }
    }

    public int getYear() {
        if (year <= 0) {
            year = 2000;
        }
        return year;
    }

    public String getCountry() {
        if (country == null || country.isEmpty()) {
            country = "default";
        }
        return country;
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
        if (transmission!=null && ! transmission.isEmpty()&& !transmission.isBlank()) {
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
        System.out.println();
    }
}

