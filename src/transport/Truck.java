package transport;

import transport.*;
import java.util.*;

public class Truck extends Transport<Driver_C> implements Competing {

    private LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, Driver_C driver,ArrayList<Mechanic> mechanics,LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, driver, mechanics);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("не указана грузоподъемность");
        }else{
            System.out.println(loadCapacity);
        }
    }

    @Override
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
        int minBount = 120;
        int maxBount = 160;
        int maxSpeed = (int) (minBount + (maxBount - minBount) * Math.random());
        System.out.println("Максимальная скорость " + maxSpeed);
    }

    @Override
    public void diagnosticsPass() {
        System.out.println("машина " + getBrand() + " " + getModel() + " проходит диагностику ");

    }

    public void fixTheCar() {
        if (mechanics != null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getRepairSpecialization() == RepairSpecialization.SPECIALIZATION_TRUCK ||
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
                if (mechanic.getRepairSpecialization() == RepairSpecialization.SPECIALIZATION_TRUCK||
                        mechanic.getRepairSpecialization() == RepairSpecialization.SPECIALIZATION_UNIVERSAL) {
                    mechanic.carryOutMaintenance(this);
                }
            }
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Truck truck = (Truck) obj;
        return loadCapacity == truck.loadCapacity;
    }

}
