package prog;

import org.junit.*;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class IPAddressTest {
    private IPAddress ipAddress;
    private String[] listIp;

    @Before
    public void setUp() throws Exception {
        ipAddress = new IPAddress();
        listIp = new String[]{"255.255.255.255", "0.0.0.0", "255.0.0.255"};
    }

    @Test
    public void isValidIPAddress() {
        for (String list : listIp) {
            boolean expected = ipAddress.isValidIPAddress(list);
            assertTrue(expected);
        }
    }

    @Test
    public void calcByteorder() {
        long[] actual = {4294967295L, 0L, 4278190335L};
        long [] expected = new long[3];
        for (int i = 0; i < listIp.length; i++) {
            expected[i] = ipAddress.calcByteorder(listIp[i]);
        }
        assertArrayEquals(expected, actual);
    }

    @Test
    public void nextIPAddress() {
        try {
        IPAddress ipAddress1 = new IPAddress("192.13.0.0");
        IPAddress ipAddress2 = new IPAddress("192.12.255.12");
        IPAddress ipAddress3 = new IPAddress("193.0.0.0");
        ArrayList actual = new ArrayList();
        actual.add(ipAddress1);
        actual.add(ipAddress2);
        actual.add(ipAddress3);
        IPAddress ipAddress4 = new IPAddress("192.12.255.255");
        IPAddress ipAddress5 = new IPAddress("192.12.255.11");
        IPAddress ipAddress6 = new IPAddress("192.255.255.255");
        ArrayList expected = new ArrayList();
        expected.add(ipAddress4.nextIPAddress());
        expected.add(ipAddress5.nextIPAddress());
        expected.add(ipAddress6.nextIPAddress());

            for (int i = 0; i < expected.size(); i++) {
                assertEquals(expected.get(i).toString(), actual.get(i).toString());
            }

        } catch (IllegalIPAddressException e) {
            e.printStackTrace();
        }
    }
 }