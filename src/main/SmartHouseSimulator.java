package main;


import java.util.Scanner;

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
        //70% change of sun - if number between 1-70
        if (randomNumber <= 70) {
            weatherStatus = 1;
            return weatherStatus;
        } else if (randomNumber > 70) {
            weatherStatus = 2;
            return weatherStatus;
        //30% chance of rain - if number between 71-100

        }


    }

}