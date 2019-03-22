package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        String inputKey = null;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            inputKey = reader.readLine();
        } catch (Exception e) {
            e.getStackTrace();
        }

        if (inputKey.equals("sun")) {
            thePlanet = Sun.getInstance();
        }
        else if (inputKey.equals("earth")) {
            thePlanet = Earth.getInstance();
        }
        else if (inputKey.equals("moon")) {
            thePlanet = Moon.getInstance();
        }
        else thePlanet = null;
    }
}
