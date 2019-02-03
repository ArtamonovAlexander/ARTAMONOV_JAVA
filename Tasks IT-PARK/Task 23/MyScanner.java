package com.javarush.task.ITpark3.Task23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MyScanner {

    InputStream inputStream = null;

    public MyScanner(String fileName) {

        try {
            inputStream = new FileInputStream(fileName);

        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public int nextInt() {
        int letter = 0;
        try {
            letter = inputStream.read();
            while (letter != -1) {
                System.out.print((char)letter);
                letter = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return letter;
    }
}
