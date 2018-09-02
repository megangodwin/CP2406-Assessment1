import java.util.Scanner;

public class SmartHouseSimulator {

    public static void main(String[] args) {

        //import txt file for configuration

        //initialise appliances

        System.out.println("Welcome to Smart House Simulator. Select an option to continue,  1 = Exit. 2 = Run simulation. 3 = See room configuration");

        int stateInput = 0;
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;

        while (quit == false) {

            int stateInput = scanner.nextInt();

            switch (stateInput) {
                case 1: //exit program
                    System.out.println("Exiting program...");
                    quit = true;
                    break;

                case 2: //run simulation
                    System.out.println("Running Simulation...");
                    break;

                case 3: //Show configuration
                }
        }

    }
}