import java.util.Scanner;

public class SmartHouseSimulator {

    public static void main(String[] args) {

        //import txt file for configuration

        System.out.println("Welcome to Smart House Simulator. Select an option to continue, M = Menu. E = Exit. R = Run simulation");

        int state = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {

            String input = scanner.nextLine();

            switch (state) {
                case 0: //run menu
                    System.out.println("Menu");
                    if (input.equals("M"))

                    break;
                case 1: //exit program
                    System.out.println("Exit program");
                    break;
                case 2: //run simulation
                    System.out.println("Running Simulation...");
                    break;
            }
        }
    }
}