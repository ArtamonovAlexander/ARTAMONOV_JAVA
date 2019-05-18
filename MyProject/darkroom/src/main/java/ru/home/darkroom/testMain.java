package ru.home.darkroom;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class testMain {
    public static void main(String[] args) {

        String trt = "2017-05-30,17:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd,HH:mm");
        LocalDateTime ldt = LocalDateTime.parse(trt, formatter);
        String rfcFormat = ldt.format(DateTimeFormatter.ofPattern("E, dd/MM/yyyy HH:mm")); // Sun, 28 Jan 2018 08:24:31
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("E, dd/MM/yyyy HH:mm");
        LocalDateTime ldt1 = LocalDateTime.parse(rfcFormat, formatter1);

        System.out.println(ldt1);
    }
}
