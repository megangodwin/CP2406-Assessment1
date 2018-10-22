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

        int result;


        do {
            JTextField roomNameInput = new JTextField(7);
            JTextField roomWidthInput = new JTextField(4);
            JTextField roomLengthInput = new JTextField(4);

            JPanel inputConfigPanel = new JPanel();

            inputConfigPanel.add(new JLabel("Enter room name"));
            inputConfigPanel.add(roomNameInput);

            inputConfigPanel.add(new JLabel("Enter room width"));
            inputConfigPanel.add(roomWidthInput);

            inputConfigPanel.add(new JLabel("Enter room length"));
            inputConfigPanel.add(roomLengthInput);

            result = JOptionPane.showConfirmDialog(null, inputConfigPanel, "Please enter room details", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                //convert the input to respective types
                String roomName = roomNameInput.getText();

                String strNum = roomWidthInput.getText();
                int roomWidth = Integer.parseInt(strNum);

                strNum = roomLengthInput.getText();
                int roomLength = Integer.parseInt(strNum);

                //add to the object
                JSONObject roomObject = new JSONObject();
                roomObject.put("name", roomName);
                roomObject.put("width", roomWidth);
                roomObject.put("length", roomLength);

                rooms.add(roomObject);

                System.out.println("completed config");
            } else {
                System.out.println("config canceled");
            }
        } while (result != JOptionPane.CANCEL_OPTION);


        root.put("rooms", rooms);

        System.out.println(root.toJSONString());

        //write the JSON structure to a file
        File JSONFile = new File("src/res/config.JSON");

        try {
            PrintWriter JSONWriter = new PrintWriter(JSONFile);
            JSONWriter.print(root.toJSONString());
            JSONWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());

        }

    }

}