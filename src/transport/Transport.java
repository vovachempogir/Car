package transport;

import java.util.ArrayList;
import java.util.Objects;


public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    protected ArrayList<Mechanic> mechanics;

    public Transport(String brand, String model, double engineVolume, T driver, ArrayList<Mechanic> mechanics) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
        setEngineVolume(engineVolume);
        setDriver(driver);
        this.mechanics = mechanics;
    }

    public ArrayList<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setMechanics(ArrayList<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Марка автомобиля: " + brand + ", " +
                "Модель: " + model + ", " +
                "Объем двигателя: " + engineVolume;
    }

    public abstract void startMove();

    public abstract void finishMove();

    public abstract void diagnosticsPass();

    public abstract void printType();

    public abstract void mechanic();

    public abstract void fixTheCar();

    public abstract void carryOutMaintenance();


    public static void performDiagnostics(Transport... transports) {
        for (Transport transport : transports) {
            try {
                transport.diagnosticsPass();
            } catch (UnsupportedOperationException e) {
                System.out.println("ошибка");
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Transport transport = (Transport) obj;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }
}
//    private final int year;
//    private final String country;
//    private String color;
//    private int maxSpeed;

//        if (year <= 0) {
//            year = 2000;
//        }
//        this.year = year;
//        if (country == null || country.isEmpty()) {
//            country = "default";
//        }
//        this.country = country;
//        setColor(color);
//        setMaxSpeed(maxSpeed);

//    public String getColor() {
//        return color;
//    }
//
//    public void setColor( String color) {
//        if (color!=null && ! color.isEmpty() && !color.isBlank()) {
//            this.color = color;
//        }
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public int getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public void setMaxSpeed(int maxSpeed) {
//        if (maxSpeed != 0 ) {
//            this.maxSpeed = maxSpeed;
//        }
//    }

//                "Год производства: " + year + ", " +
//                "Страна сборки: " + country + ", " +
//                "Цвет кузова: " + color + ", " +
//                "Максимальная скорость: " + maxSpeed;