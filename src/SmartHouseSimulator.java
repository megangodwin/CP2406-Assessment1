<<<<<<< HEAD
package model;//import model;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class SmartHouseSimulator implements Runnable{

    int timeOfDay;

    //AtomicInteger timeOfDay = new AtomicInteger(0);

    public SmartHouseSimulator(int timeOfDay){

        this.timeOfDay = 0;
    }

    @Override
    public void run(){

        timeSimulation(0);
    }

    public void weatherGenerator() {


        //random weather generation
        int max = 100;
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
        }


        //time - 1440 simulated minutes per simulation


    }

    public void timeSimulation(int timeOfDay) {
        int seconds = 0;
        int maxSeconds = 1440;

        //1440 simulated minutes per simulation

        try {
            while (seconds != maxSeconds) {
                ++timeOfDay;
                Thread.sleep(450);
                System.out.println("the time is " + timeOfDay);

            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public int getTime() {

        return timeOfDay;
    }



}


=======
public class SmartHouseSimulator implements Runnable{

    public static int time;
    public static int weatherStatus = 0;


    @Override
    public void run() {

        int max = 100;
        int min = 0;
        int randomNumber = (int) (Math.random() * ((max - min + 1)));

        int seconds = 0;
        int MAX_SECONDS = 1440;
        try {
            while(seconds != MAX_SECONDS) {
                ++time;
                ++seconds;
                Thread.sleep(85);

                //random weather generation
                if(randomNumber <=65) {
                    if(weatherStatus == 0) {
                        weatherStatus = 0; //do nothing
                    } else if(weatherStatus != 0) {
                        weatherStatus = 0;
                        System.out.println("It is sunny"); //only displays whe there is a change in the weather
                    }
                }else if(randomNumber > 65) {
                    if(weatherStatus == 1) {
                        weatherStatus = 1; //do nothing
                    } else if(weatherStatus != 1) {
                        weatherStatus = 1;
                        System.out.println("It is raining"); //only displays when there is a change in the weather
                    }
                }

                System.out.println(time);

                //to translate to readable time - while minute count isn't 60, keep counting. once count reaches 60, increment hour and reset minute count
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }




        //time - 1440 simulated minutes per simulation


    }

//    public void timeSimulation(int time){
//
//
//    }

    public int getSimTime(){
        return time;
    }



}


>>>>>>> origin/sprinklers
