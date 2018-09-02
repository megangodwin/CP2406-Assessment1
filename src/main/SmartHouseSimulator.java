package main;

import java.util.Random;

public class SmartHouseSimulator {
    //how should the simulation start each run
    int timeOfDay = 0;
    int weatherStatus = 0;

    protected SmartHouseSimulator(int timeOfDay, int weatherStatus) {

    }

    private int incrementTime(int timeOfDay) {
        //1440 simulated minutes per simulation
        for () {
            ++timeOfDay;
            return timeOfDay;
        }
    }

    protected int weatherGenerator(int weatherStatus) {
        //random number
        int max = 100;
        int min = 1;
        int randomNumber = (int)(Math.random() * ((max - min) + 1)) + min;
        //70% change of sun - if number between 1-70 - status 1
        //30% chance of rain - if number between 71-100 - status 2
        if (randomNumber <= 85) {
            weatherStatus = 1;
            return weatherStatus;
        } else if (randomNumber > 85) {
            weatherStatus = 2;
            return weatherStatus;


        }


    }

}