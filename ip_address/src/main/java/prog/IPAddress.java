package prog;

public class IPAddress {

    private String ipaddress;
    private long byteorder;

    public IPAddress() {
        ipaddress = "0.0.0.0";
        byteorder = calcByteorder(ipaddress);
    }

    public IPAddress(String ipaddress) throws IllegalIPAddressException {
        if (isValidIPAddress(ipaddress)) {
            this.ipaddress = ipaddress;
            this.byteorder = calcByteorder(this.ipaddress);
        } else {
            throw new IllegalIPAddressException();
        }
    }

    protected IPAddress(String ipaddress, long byteorder) {
        this.ipaddress = ipaddress;
        this.byteorder = byteorder;
    }

    //Метод проверяет IP на соответствие
    final protected boolean isValidIPAddress(final String ip) {
        boolean returnValue = true;
        if (ip.matches("^[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}$")) {    //от 1 до 3 цифр в каждой октете
            String[] segments = ip.split("\\.");    //создаем массив из октет
            for (String segment : segments) {
                short octet = Short.valueOf(segment);   // каждую октету переводим в short
                if (octet > 255 || octet < 0) {     // и проверяем на соответсвтвие диапазону допустимых значений
                    returnValue = false;
                    break;
                }
            }
        } else {
            returnValue = false;
        }
        return returnValue;
    }

    // Метод вычисления значений ip на основе смещения байт-кода
    final protected long calcByteorder(String ip) {
        long bytecode = 0;
        String[] segments = ip.split("\\.");
        for (int i = 0; i < segments.length; i++) {
            bytecode += (Long.parseLong(segments[i])) << 8 * (3 - i); // значение каждой октеты свигаем на соответствующее
        }                                                             // этой октете кол-во бит
        return bytecode;
    }

    // Метод вычисления следующего ip
    final protected IPAddress nextIPAddress() {
        String ip = "";
        long bytecode = 0;
        bytecode = byteorder + 1;       // прибавляем к ip объекта 1
        for (int i = 0, shift = 24; i < 4; shift -= 8, i++) {   // shift кол-во бит для сдвига
            ip += ((bytecode >> shift) & 0xff) + (i < 3 ? "." : "");    // собираем ip обратно из получувшегося детятичного байт-кода
        }          // в String представлении. & 0xff - берет младшие 8 бит
        return new IPAddress(ip, bytecode);
    }

    @Override
    public String toString() {
        return ipaddress;
    }
}
