package transport;

public abstract class Transport {
    private String brand;
    private String model;
    private int year;
    private String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.maxSpeed = maxSpeed;
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

    public String getColor() {
        if (color == null || color.isEmpty()) {
            color = "Белый";
        }
        return color;
    }

    public void setColor( String color) {
        if (color!=null && ! color.isEmpty() && !color.isBlank()) {
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

    public int getMaxSpeed() {
        if (maxSpeed <= 0) {
            maxSpeed = 100;
        }
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed != 0 ) {
            this.maxSpeed = maxSpeed;
        }
    }

}
