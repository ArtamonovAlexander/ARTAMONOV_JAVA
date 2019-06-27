package ru.testwork;

public class TransportMoveOut extends Thread {

    private Transport transport;
    private Valet valet;

    public TransportMoveOut(Transport transport, Valet valet) {
        this.transport = transport;
        this.valet = valet;
    }

    @Override
    public synchronized void run() {
        if (transport instanceof Car){
            valet.moveOutCar(transport);
        }
        if (transport instanceof Truck){
            valet.moveOutTruck(transport);
        }
    }
}
