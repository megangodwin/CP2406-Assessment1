import view.SimulationFrame;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        //import configuration txt file TODO

        //initialise sim
        SmartHouseSimulator sim =  new SmartHouseSimulator();

        //initialise frame
        SimulationFrame simWindow = new SimulationFrame();
        simWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        simWindow.pack();
        simWindow.setSize(600,400);


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

                        sim.run();


                    break;
                case 2: //Show configuration
                    System.out.println("Current configuration...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public void importConfig() {

    }

    public void printConfig() {

    }

    public void writeConfig() {

    }

}