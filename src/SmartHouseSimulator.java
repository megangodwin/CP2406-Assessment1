//import model;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class SmartHouseSimulator extends Runnable{

    AtomicInteger timeOfDay = new AtomicInteger(0);

    public SmartHouseSimulator(int timeOfDay){

        this.timeOfDay = null;
    }

    @Override
    public void run(){
        timeSimulation();
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

    public void timeSimulation() {
        int timeOfDay = 0;

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

    public AtomicInteger getTime() {
        return timeOfDay;
    }



}


