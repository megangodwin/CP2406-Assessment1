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

        writeConfig();

    }

    public void importConfig(File configFile) {

        //probably unnecessary

//        try {
//
//
//        } catch (FileNotFoundException f){
//
//        }

    }

    public void printConfig() {

        //

    }

    public static void writeConfig() {

        //Scanner input = new Scanner(System.in);

        //create the root of the JSON structure
        JSONObject root = new JSONObject();

        JSONArray rooms = new JSONArray();

        String input;
        int numInput;

        while(true) {
            //System.out.println("Enter room name,");

//            Object[] possibilities = {"Living room", "Kitchen", "Bedroom", "Bathroom", "Garage", "Office", "Leisure room", "Patio", "Garden"};
//            numInput = JOptionPane.showOptionDialog(null, "Select room type to add to house", "House configuration", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, possibilities, "Bedroom");
            input = JOptionPane.showInputDialog(null, "Enter room name", "House Configuration", JOptionPane.PLAIN_MESSAGE);
            String roomName = input;

//            //check to see if user pressed enter
//            //TODO implement cancel button
//            if(roomName.length() == 0){
//                break;
//            }

            //get the length and width
            //System.out.println("Enter room width,");
            input = JOptionPane.showInputDialog(null, "Enter room width");
            numInput = Integer.parseInt(input);
            int roomWidth = numInput;

            //System.out.println("Enter room length, ");
            input = JOptionPane.showInputDialog(null, "Enter room width");
            numInput = Integer.parseInt(input);
            int roomLength = numInput;

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
        File JSONFile = new File("res/config.JSON");

        try {
            PrintWriter JSONWriter = new PrintWriter(JSONFile);
            JSONWriter.print(root.toJSONString());
            JSONWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }


    }

}