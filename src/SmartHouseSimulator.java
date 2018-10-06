public class SmartHouseSimulator implements Runnable {

    public int time;
    public static int weatherStatus = 0;


    @Override
    public void run() {

        int max = 100;
        int min = 0;
        int randomNumber = (int) (Math.random() * ((max - min + 1)));

        int seconds = 0;
        int MAX_SECONDS = 1440;
        try {
            while (time != MAX_SECONDS) {
                ++time;
                Thread.sleep(85);

                //random weather generation
                if (randomNumber <= 65) {
                    if (weatherStatus == 0) {
                        weatherStatus = 0; //do nothing
                    } else if (weatherStatus != 0) {
                        weatherStatus = 0;
                        System.out.println("It is sunny"); //only displays whe there is a change in the weather
                    }
                } else if (randomNumber > 65) {
                    if (weatherStatus == 1) {
                        weatherStatus = 1; //do nothing
                    } else if (weatherStatus != 1) {
                        weatherStatus = 1;
                        System.out.println("It is raining"); //only displays when there is a change in the weather
                    }
                }
                System.out.println(time);

                //to translate to readable time - while minute count isn't 60, keep counting. once count reaches 60, increment hour and reset minute count
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //time - 1440 simulated minutes per simulation


    }
}