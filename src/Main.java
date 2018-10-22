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

        writeConfig();

    }

    //public void importConfig(File configFile) {

        //probably unnecessary

//        try {
//
//
//        } catch (FileNotFoundException f){
//
//        }

    //}

    //public void printConfig() {

        //

    //}

    public static void writeConfig() {

        //Scanner input = new Scanner(System.in);

        //create the root of the JSON structure
        JSONObject root = new JSONObject();

        JSONArray rooms = new JSONArray();

        String input;
        int numInput;
        int roomWidth;
        int roomLength;

        //boolean completeConfig = false;

        while(true) {
            //System.out.println("Enter room name,");

            Object[] possibilities = {"Living room", "Bedroom", "Bathroom", "Kitchen", "Garage", "Office", "Leisure room", "Patio", "Garden"};
            Object roomSelection = JOptionPane.showInputDialog(null, "Select room type to add to house",
                    "House configuration", JOptionPane.QUESTION_MESSAGE, null, possibilities, possibilities[1]);
            String roomName = roomSelection.toString();

            System.out.println(roomName);

            //check to see if uno input
            //TODO implement cancel button
            if (roomName != null) {

                //get the length and width
                input = JOptionPane.showInputDialog(null, "Enter " + roomName + " width", "House Configuration - Room Size", JOptionPane.QUESTION_MESSAGE);
                roomWidth = Integer.parseInt(input);

                if (roomWidth == 0) {
                    break;
                }


                System.out.println(roomWidth);

                input = JOptionPane.showInputDialog(null, "Enter " + roomName + " length", "House Configuration - Room Size", JOptionPane.QUESTION_MESSAGE);
                roomLength = Integer.parseInt(input);

                if (roomLength == 0) {
                    break;
                }

                System.out.println(roomLength);

                //create the object and store the class in it
                JSONObject roomObject = new JSONObject();
                roomObject.put("name", roomName);
                roomObject.put("width", roomWidth);
                roomObject.put("length", roomLength);

                rooms.add(roomObject);
            } else {
//                root.put("rooms", rooms);
//
//                System.out.println(root.toJSONString());
//
//                //write the JSON structure to a file
//                File JSONFile = new File("res/config.JSON");
//
//                try {
//                    PrintWriter JSONWriter = new PrintWriter(JSONFile);
//                    JSONWriter.print(root.toJSONString());
//                    JSONWriter.close();
//                } catch (FileNotFoundException e) {
//                    System.out.println(e.toString());
                break;
            }

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