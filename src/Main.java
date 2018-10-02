import java.lang.reflect.Array;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Date;

public class Main {

   //public static int time = 0;

    public static void main(String[] args) {

        //import configuration txt file TODO

        //SmartHouseSimulator sim = new SmartHouseSimulator();



        System.out.println("Welcome to Smart House Simulator. Select an option to continue: 1 = Run simulation. 2 = See room configuration 0 = Exit.");

        Scanner scanner = new Scanner(System.in);

        boolean quit = false;

        while (!quit) {

            int stateInput = scanner.nextInt();

            switch (stateInput) {
                case 0: //exit program
                    System.out.println("Exiting program...");
                    quit = true;
                    break;
                case 1: //run simulation
                    System.out.println("Running Simulation...");
                    //sim.run();


//                    int seconds = 0;
//                    int MAX_SECONDS = 1440;
//                    try {
//                        while (seconds != MAX_SECONDS) {
//                            ++time;
//                            Thread.sleep(350);
//                            System.out.println(time);
//
//                            //to translate to readable time - while minute count isn't 60, keep counting. once count reaches 60, increment hour and reset minute count
//                        }
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }

//                    LocalTime time = LocalTime.of(5, 0);
//                    System.out.println("custom time: " + time);
//
//                    while (time != LocalTime.of(4,59)){
//                        LocalTime updatedTime = time.withMinute(+1);
//                        System.out.println("updated time " + updatedTime);
//                    }


//                    LocalTime updatedTime = time.plus(Duration.ofMinutes(20));
//                    System.out.println("updated time: " + updatedTime);


//                    try {
//                        System.out.println(new Date( ) + "\n");
//                        Thread.sleep(5*60*10);
//                        System.out.println(new Date( ) + "\n");
//                    } catch (Exception e) {
//                        System.out.println("weh");
//                    }


//                    Date date = new Date();
//                    System.out.println(date.toString());


//                    int[] time = new int[2];
//                    time[0] = 5;
//                    time[1] = 00;
//                    System.out.println(Arrays.toString(time));

                    break;
                case 2: //Show configuration
                    System.out.println("Current configuration...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

}
