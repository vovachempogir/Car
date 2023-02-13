package transport;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> transportQueue;

    public ServiceStation(Queue<Transport> transportQueue) {
        this.transportQueue = transportQueue;
    }

    public Queue<Transport> getTransportQueue() {
        return transportQueue;
    }

    public void setTransportQueue(Queue<Transport> transportQueue) {
        this.transportQueue = transportQueue;
    }

    public Queue<Transport> transportsQueue(){
        Queue<Transport> transportsQueue = new LinkedList<>();
        for (Transport transport : transportQueue)
        System.out.println("Авто в очереди" + transportQueue);
        return transportsQueue();
    }


    public void carryOutVehicle(Transport transport) {
        System.out.println(this.toString() + "Авто в очереди: " + transportQueue);
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
