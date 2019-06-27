import org.junit.Test;
import ru.testwork.*;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class ParkingJUnitTest {

    private Random random = new Random();
    private TransportQueueParkIn transportQueueParkIn;
    private TransportMoveOut transportMoveOut;

    private Park park = new Park(2, 2);
    private Valet valet = new Valet(park);


    @Test // Проверяю вьезд для Грузовиков
    public void testIsFullParkingForTruck() {
        boolean expected = true;
        boolean actual = true;

        for (int i = 0; i < 7; i++) {
            Transport transport = new Truck(random.nextInt(1000));
            transportQueueParkIn = new TransportQueueParkIn(transport, valet);
            transportQueueParkIn.start();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Transport truck : park.trackList) {
            if (truck == null) {
                actual = false;
                break;
            }
        }

        for (int j = 0; j < park.getCarList().length; j++) {
            if (j < park.getCarList().length - 1 && park.getCarList()[j] == null && park.getCarList()[j + 1] == null) {
                actual = false;
                break;
            }
        }

        assertEquals(expected, actual);
    }

    @Test //Проверяю выезд с парковки для Грузовиков
    public void testIsEmptyForTruck() {
        boolean expected = true;
        boolean actual = true;

        for (int i = 0; i < 7; i++) {
            Transport transport = new Truck(random.nextInt(1000));
            transportQueueParkIn = new TransportQueueParkIn(transport, valet);
            transportQueueParkIn.start();
        }
        try {
            transportQueueParkIn.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 7; i++) {
            Transport transport = new Truck(random.nextInt(1000));
            transportMoveOut = new TransportMoveOut(transport, valet);
            transportMoveOut.start();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Transport truck : park.trackList) {
            if (truck != null) {
                actual = false;
                break;
            }
        }

        for (int j = 0; j < park.getCarList().length; j++) {
            if (j < park.getCarList().length - 1 && park.getCarList()[j] != null && park.getCarList()[j + 1] != null) {
                actual = false;
                break;
            }
        }

        assertEquals(expected, actual);
    }

    @Test //Проверяю выезд с парковки легковых автомобилей
    public void testIsFullParkingForCar() {
        boolean expected = true;
        boolean actual = true;

        for (int i = 0; i < 7; i++) {
            Transport transport = new Car(random.nextInt(1000));
            transportQueueParkIn = new TransportQueueParkIn(transport, valet);
            transportQueueParkIn.start();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Transport car : park.carList) {
            if (car == null) {
                actual = false;
                break;
            }
            assertEquals(expected, actual);
        }
    }

    @Test //Проверяю выезд с парковки ТОЛЬКО для легковых автомобилей
    public void testIsEmptyForCar() {
        boolean expected = true;
        boolean actual = true;

        for (int i = 0; i < 7; i++) {
            Transport transport = new Car(random.nextInt(1000));
            transportQueueParkIn = new TransportQueueParkIn(transport, valet);
            transportQueueParkIn.start();
        }
        try {
            transportQueueParkIn.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 7; i++) {
            Transport transport = new Car(random.nextInt(1000));
            transportMoveOut = new TransportMoveOut(transport, valet);
            transportMoveOut.start();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Transport car : park.carList) {
            if (car != null) {
                actual = false;
                break;
            }
        }
        assertEquals(expected, actual);
    }
}
