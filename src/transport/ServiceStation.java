package transport;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> transportsQueue;

    public ServiceStation(Queue<Transport> transportsQueue) {
        this.transportsQueue = transportsQueue;
    }

    public Queue<Transport> getTransportQueue() {
        return transportsQueue;
    }

    public void setTransportQueue(Queue<Transport> transportQueue) {
        this.transportsQueue = transportQueue;
    }

    public void Queue(Transport transportsQueue){
        Queue<Transport> transports = new LinkedList<>();
        transports.offer(transportsQueue);
        System.out.println("Авто добавлено в очередь: " + transports.peek());
        Transport transport;
        while ((transport = transports.poll()) != null) {
            System.out.println("Авто удален из очереди: " + transport);
        }
    }

    public void carryOutVehicle(Transport transport) {
        System.out.println(this.toString() + "Авто в очереди: " + transportsQueue.poll());
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportsQueue);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Queue<Transport> transportQueue = (Queue<Transport>) this.transportsQueue;
        return Objects.equals(transportQueue, transportQueue);
    }

    @Override
    public String toString() {
        return "Станция техобслуживания " + transportsQueue;
    }

}
