package transport;

public class Truck extends Transport<Driver_C> implements Competing {

    public Truck(String brand, String model, double engineVolume, Driver_C driver) {
        super(brand, model, engineVolume, driver);
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
        int minBount = 100;
        int maxBount = 150;
        int theBestLapTimeMin = (int) (minBount + (maxBount - minBount) * Math.random());
        System.out.println("Лучшее время круга " + theBestLapTimeMin);
    }

    @Override
    public void maxSpeed() {
        int minBount = 120;
        int maxBount = 160;
        int maxSpeed = (int) (minBount + (maxBount - minBount) * Math.random());
        System.out.println("Максимальная скорость " + maxSpeed);
    }

}
