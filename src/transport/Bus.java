package transport;

public class Bus extends Transport{

    private int fuelTank;
    private int numberOfSeats;
    private int numberOfWheels;

    public Bus(String brand, String model, int year, String country, String color, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }

    public int getFuelTank() {
        if (fuelTank <= 0) {
            fuelTank = 100;
        }
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public int getNumberOfSeat() {
        if (numberOfSeats <= 0) {
            numberOfSeats = 20;
        }
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfWheels() {
        if (numberOfWheels <= 0) {
            numberOfWheels = 4;
        }
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void Bus() {
        System.out.println("Марка автобуса : " + getBrand());
        System.out.println("Модель: " + getModel());
        System.out.println("Год производства: " + getYear());
        System.out.println("Страна сборки: " + getCountry());
        System.out.println("Цвет кузова: " + getColor());
        System.out.println("Максимальная скорость: " + getMaxSpeed());
        System.out.println("Максимальная емкость бака: " + getFuelTank());
        System.out.println("Число сидений: " + getNumberOfSeat());
        System.out.println("Число колес: " + getNumberOfWheels());
    }
}
