package transport;

public abstract class Transport<T extends Driver > implements Competing{
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
//    private final int year;
//    private final String country;
//    private String color;
//    private int maxSpeed;

    public Transport(String brand, String model, double engineVolume, T driver) {
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
    }

    public abstract void printType();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume( double engineVolume) {
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

    public abstract void startMove();

    public abstract void finishMove();

    @Override
    public String toString() {
        return "Марка автомобиля: " + brand + ", " +
                "Модель: " + model + ", " +
                "Объем двигателя: " + engineVolume;
//                "Год производства: " + year + ", " +
//                "Страна сборки: " + country + ", " +
//                "Цвет кузова: " + color + ", " +
//                "Максимальная скорость: " + maxSpeed;
    }
}
