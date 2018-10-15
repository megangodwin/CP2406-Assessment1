import view.SimulationFrame;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.*;



public class Main {

    public static void main(String[] args) {

        //import configuration txt file TODO

        File configFile = new File("res/config.json");

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

    public void importConfig(File configFile) {

//        try {
//
//
//        } catch (FileNotFoundException f){
//
//        }

    }

    public void printConfig() {

    }

    public void writeConfig() {

        Scanner input = new Scanner(System.in);

        JSONObject root = new JSONObject();

        JSONArray rooms = new JSONArray();

        while(true) {
            System.out.println("Enter room name,");
            String roomName = input.nextLine();

            //check to see if user pressed enter
            if(roomName.length() == 0){
                break;
            }

            //get the length and width
            System.out.println("Enter room width,");
            int roomWidth = input.nextInt();

            System.out.println("Enter room length, ");
            int roomLength = input.nextInt();

            if(input.hasNextLine()) {
                input.nextLine();
            }

            //create the object and store the class in it
            JSONObject roomObject = new JSONObject();
            roomObject.put("name", roomName);
            roomObject.put("width", roomWidth);
            roomObject.put("length", roomLength);

            rooms.add(roomObject);
        }

        root.put("rooms", rooms);

        System.out.println(root.toJSONString());

        //write the JSON structure to a file
        File JSONfile = new File("res/config.JSON");

        PrintWriter JSONwriter = new PrintWriter(JSONfile);


    }

}