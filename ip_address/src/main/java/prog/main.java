package prog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IllegalIPAddressException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            IPAddress startIp = new IPAddress(reader.readLine());
            IPAddress ip = startIp;
            IPAddress endIp = new IPAddress(reader.readLine());

            while (!ip.nextIPAddress().toString().equals(endIp.toString())) {
                ip = ip.nextIPAddress();
                System.out.println(ip);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
