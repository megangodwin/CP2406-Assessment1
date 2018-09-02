package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Smart model.House Simulator. Select an option to continue: 1 = Run simulation. 2 = See room configuration 0 = Exit.");

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
                    break;

                case 2: //Show configuration
            }
        }
    }

}
