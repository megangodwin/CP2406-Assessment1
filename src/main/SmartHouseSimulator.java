package main;

import model.House;

import java.util.Random;

public class SmartHouseSimulator {
    //how should the simulation start each run
    int timeOfDay = 0;
    int weatherStatus = 0;
    private int seconds = 0;
    private int maxSeconds = 1440;


    //create simulation elements
    House house = new House();

    protected SmartHouseSimulator(int timeOfDay, int weatherStatus) {


    }


    private int eventGenerator(int timeOfDay) {
        //1440 simulated minutes per simulation

        try {
            while (seconds != maxSeconds) {
                ++timeOfDay;
                weatherGenerator(weatherStatus);
                //devices - prompted by the returned time - print status change
                Thread.sleep(350);
                return timeOfDay;

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return timeOfDay;
    }


    protected int weatherGenerator(int weatherStatus) {
        //random number
        int max = 100;
        int min = 1;
        int randomNumber = (int) (Math.random() * ((max - min) + 1)) + min;
        if (randomNumber <= 45) {
            if (weatherStatus == 0) {
                weatherStatus = 0;
            } else if (weatherStatus != 0) {
                weatherStatus = 0;
                System.out.println("it is sunny");
            }
        } else if (randomNumber > 45) {
            weatherStatus = 1;
            System.out.println("it is raining");
            return weatherStatus;
        }
        return weatherStatus;
    }
}


