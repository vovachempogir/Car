package transport;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation extends Mechanic {

    private ArrayList<Mechanic> mechanics;

    public ServiceStation(String name, String company, RepairSpecialization repairSpecialization) {
        super(name, company, repairSpecialization);
    }


    public void carryOutVehicle(ArrayList<Mechanic> mechanics) {
        System.out.println(this.toString() + " проводит техосмотр компания " + getCompany());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Проводит техосмотр " + Mechanic.class;
    }
}
