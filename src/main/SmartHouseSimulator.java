package main;

import model.*;
import java.util.Random;

public class SmartHouseSimulator implements Runnable{

    @Override
    public void run() {


        //random weather generation
        /*int max = 100;
        int min = 0;
        int randomNumber = (int) (Math.random() * ((max - min + 1)));
        int weatherStatus = 0;

        if(randomNumber <=45) {
            if(weatherStatus == 0) {
                weatherStatus = 0; //do nothing
            } else if(weatherStatus != 0) {
                weatherStatus = 0;
                System.out.println("It is sunny"); //only displays whe there is a change in the weather
            }
        }else if(randomNumber > 45) {
            if(weatherStatus == 1) {
                weatherStatus = 1; //do nothing
            } else if(weatherStatus != 1) {
                weatherStatus = 1;
                System.out.println("It is raining"); //only displays when there is a change in the weather
            }
        }*/


        //time - 1440 simulated minutes per simulation


        int timeOfDay = 0;
    }

    public void timeSimulation(int timeOfDay){
        int seconds = 0;
        int MAX_SECONDS = 1440;
        try {
            while(seconds != MAX_SECONDS) {
                ++timeOfDay;
                Thread.sleep(350);
                System.out.println(timeOfDay);

                //to translate to readable time - while minute count isn't 60, keep counting. once count reaches 60, increment hour and reset minute count
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

    }

    public int getTime(){
        return timeOfDay;
    }



}


