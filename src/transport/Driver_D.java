package transport;

public class Driver_D extends Driver{
    public Driver_D(String name, boolean driverLicense, int practiceDriveInYears) {
        super(name, driverLicense, practiceDriveInYears);
    }

    @Override
    public void startMove() {
        System.out.println(getName() + " начал движение");
    }

    @Override
    public void stopMove() {
        System.out.println(getName() + " остановился");
    }

    @Override
    public void refillAuto() {
        System.out.println(getName() + " запраляет автомобиль");
    }
}
