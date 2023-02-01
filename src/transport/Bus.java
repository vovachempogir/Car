package transport;

public class Bus extends Transport<Driver_D> implements Competing{

    private NumberOfSeats numberOfSeats;

    public Bus(String brand, String model, double engineVolume, Driver_D driver, NumberOfSeats numberOfSeats) {
        super(brand, model, engineVolume, driver);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void printType() {
        if (numberOfSeats == null) {
            System.out.println("не указанно количество посадочных мест");
        } else {
            System.out.println(numberOfSeats);
        }
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
        int minBount = 100;
        int maxBount = 150;
        int maxSpeed = (int) (minBount + (maxBount - minBount) * Math.random());
        System.out.println("Максимальная скорость " + maxSpeed);
    }

    @Override
    public void diagnosticsPass() throws UnsupportedOperationException {
        throw new UnsupportedOperationException(" автобус диагностику проходить не может");
    }
}
