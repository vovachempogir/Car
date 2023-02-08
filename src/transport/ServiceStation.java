package transport;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class ServiceStation {
    private Transport transportQueue;

    public ServiceStation(Transport transportQueue) {
        this.transportQueue = transportQueue;
    }

    public void transportQueue() {
        Queue<Transport> transportQueue = new LinkedList<>();
        System.out.println("Авто в очереди" + transportQueue);

    }


    public void carryOutVehicle() {
        System.out.println(this.toString() + " проводит техосмотр компания " + transportQueue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportQueue);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Queue<Transport> transportQueue = (Queue<Transport>) this.transportQueue;
        return Objects.equals(transportQueue, transportQueue);
    }

    @Override
    public String toString() {
        return "Станция техобслуживания " + transportQueue;
    }
}
