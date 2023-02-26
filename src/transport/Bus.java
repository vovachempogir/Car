package transport;

import transport.*;
import java.util.*;

public class Bus extends Transport<Driver_D> implements Competing{

    private NumberOfSeats numberOfSeats;

    public Bus(String brand, String model, double engineVolume, Driver_D driver, ArrayList<Mechanic> mechanics, NumberOfSeats numberOfSeats) {
        super(brand, model, engineVolume, driver, mechanics);
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

    public void mechanic() {
        if (mechanics == null) {
            System.out.println("нет механика");
        } else {
            System.out.println(mechanics);
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

    public void fixTheCar() {
        if (mechanics != null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getRepairSpecialization() == RepairSpecialization.SPECIALIZATION_BUS ||
                        mechanic.getRepairSpecialization() == RepairSpecialization.SPECIALIZATION_UNIVERSAL) {
                    mechanic.fixTheCar(this);
                }
            }
        }
    }

    @Override
    public void carryOutMaintenance() {
        if (mechanics != null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getRepairSpecialization() == RepairSpecialization.SPECIALIZATION_BUS||
                        mechanic.getRepairSpecialization() == RepairSpecialization.SPECIALIZATION_UNIVERSAL) {
                    mechanic.carryOutMaintenance(this);
                }
            }
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfSeats);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Bus bus = (Bus) obj;
        return numberOfSeats == bus.numberOfSeats;
    }

}
