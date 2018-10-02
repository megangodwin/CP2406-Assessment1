import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Date;

public class Main {

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

                    LocalDateTime currTime = LocalDateTime.now();
                    System.out.println("current date time: " + currTime);

                    LocalDateTime custDate1 = LocalDateTime.of(2015, 12, 2, 10, 30);
                    System.out.println("custom date time: " +custDate1);


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
