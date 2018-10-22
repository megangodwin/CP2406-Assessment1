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

//        String input;
//        int numInput;
//        int roomWidth;
//        int roomLength;



        JTextField roomName = new JTextField(7);
        JTextField roomWidth = new JTextField(4);
        JTextField roomLength = new JTextField(4);

        JPanel inputConfigPanel = new JPanel(new BorderLayout());
        inputConfigPanel.setPreferredSize(new Dimension(300,300));

        inputConfigPanel.add(new JLabel("Enter room name"), BorderLayout.NORTH);
        inputConfigPanel.add(roomName);

        inputConfigPanel.add(new JLabel("Enter room width"), BorderLayout.CENTER);
        inputConfigPanel.add(roomWidth);

        inputConfigPanel.add(new JLabel("Enter room length"), BorderLayout.SOUTH);
        inputConfigPanel.add(roomLength);

        int result = JOptionPane.showConfirmDialog(null, inputConfigPanel, "Please enter room details", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("completed config");
        } else {
            System.out.println("config canceled");
        }



        //ask for room name

        //if room name is populated

            //get length and width

            //clear room name

            //ask for room name

        //else, write to file




//        while(true) {
//            //System.out.println("Enter room name,");
//
//            Object[] possibilities = {"Living room", "Bedroom", "Bathroom", "Kitchen", "Garage", "Office", "Leisure room", "Patio", "Garden"};
//            Object roomSelection = JOptionPane.showInputDialog(null, "Select room type to add to house",
//                    "House configuration", JOptionPane.QUESTION_MESSAGE, null, possibilities, possibilities[1]);
//            String roomName = roomSelection.toString();
//
//            System.out.println(roomName);
//
//            //check to see if no input
//            //TODO implement cancel button
////            if (roomName != null) {
//
//                //get the length and width
//                input = JOptionPane.showInputDialog(null, "Enter " + roomName + " width", "House Configuration - Room Size", JOptionPane.QUESTION_MESSAGE);
//                roomWidth = Integer.parseInt(input);
//
//                System.out.println(roomWidth);
//
//                input = JOptionPane.showInputDialog(null, "Enter " + roomName + " length", "House Configuration - Room Size", JOptionPane.QUESTION_MESSAGE);
//                roomLength = Integer.parseInt(input);
//
//                System.out.println(roomLength);
//
//                //create the object and store the class in it
//                JSONObject roomObject = new JSONObject();
//                roomObject.put("name", roomName);
//                roomObject.put("width", roomWidth);
//                roomObject.put("length", roomLength);
//
//                rooms.add(roomObject);
//            } else {
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
//                break;
//            }
//
//        }
//            root.put("rooms", rooms);
//
//            System.out.println(root.toJSONString());
//
//            //write the JSON structure to a file
//            File JSONFile = new File("res/config.JSON");
//
//            try {
//                PrintWriter JSONWriter = new PrintWriter(JSONFile);
//                JSONWriter.print(root.toJSONString());
//                JSONWriter.close();
//            } catch (FileNotFoundException e) {
//                System.out.println(e.toString());
//
//        }


    }

}