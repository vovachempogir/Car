package transport;

public class Truck extends Transport<Driver_C> implements Competing {

    private LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, Driver_C driver,LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, driver);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("не указана грузоподъемность");
        } else {
            String loadCapacityLowerLimit = loadCapacity.getLoadCapacityLowerLimit() == null ? "" : " от " +
                    loadCapacity.getLoadCapacityLowerLimit() + " тон";
            String loadCapacityUpperLimit = loadCapacity.getLoadCapacityUpperLimit() == null ? "" : " до " +
                    loadCapacity.getLoadCapacityUpperLimit() + " тон";
            System.out.println("грузоподъемность " + loadCapacityLowerLimit + loadCapacityUpperLimit);
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
        int minBount = 120;
        int maxBount = 160;
        int maxSpeed = (int) (minBount + (maxBount - minBount) * Math.random());
        System.out.println("Максимальная скорость " + maxSpeed);
    }

}
