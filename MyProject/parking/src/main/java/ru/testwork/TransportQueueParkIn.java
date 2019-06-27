package ru.testwork;

public class TransportQueueParkIn extends Thread {

    private Transport transport;
    private Valet valet;

    public TransportQueueParkIn(Transport transport, Valet valet) {
        this.transport = transport;
        this.valet = valet;
    }

    @Override
    public void run(){
        if(transport instanceof Car){
            valet.parkInCar(transport);
        }
        if(transport instanceof Truck){
            valet.parkInTruck(transport);
        }
    }
}
