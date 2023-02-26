package transport;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class ServiceStation {
    private final Queue<Transport<?>> transportsQueue = new LinkedList<>();

    public void addTransportQueue(Transport<?> transport) {
        if (transport instanceof Bus) {
            System.out.println("Автобусы не нуждаются в Техобслуживании");
        } else {
            transportsQueue.add(transport);
        }
    }

    public void runTO() {
        Transport<?> transport = transportsQueue.poll();

        if (transport != null) {
            transport.getMechanics().get(0).carryOutMaintenance(transport);
        }
    }


}
