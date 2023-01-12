public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, double engineVolume, String color, int year, String county) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = county;
    }

    Car(){
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

    void Car() {
        System.out.println("Марка автомобиля: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Объем двигателя в литрах: " + engineVolume);
        System.out.println("Цвет кузова: " + color);
        System.out.println("Год производства: " + year);
        System.out.println("Страна сборки: " + country);
    }


}
