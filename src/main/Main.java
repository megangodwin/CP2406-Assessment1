package main;

import model.Room;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //import configuration txt file TODO

        //Room[] rooms = new Room[5];
        //rooms[0] = new Room();
        //rooms[1] = new Room();
        //rooms[2] = new Room();
        //rooms[3] = new Room();



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
