public class SmartHouseSimulator implements Runnable{

    public static int time;


    @Override
    public void run() {

        timeSimulation(0);


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

    public void timeSimulation(int time){
        int seconds = 0;
        int MAX_SECONDS = 1440;
        try {
            while(seconds != MAX_SECONDS) {
                ++time;
                Thread.sleep(350);
                System.out.println(time);

                //to translate to readable time - while minute count isn't 60, keep counting. once count reaches 60, increment hour and reset minute count
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

    }

    public int getSimTime(){
        return time;
    }



}


