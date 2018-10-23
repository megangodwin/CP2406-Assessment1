import view.SimulationFrame;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.*;



public class Main {

    public static void main(String[] args) {

        //import configuration txt file TODO
        //importConfig(configFile)

        //initialise sim
        //SmartHouseSimulator sim =  new SmartHouseSimulator();

        //initialise frame
        SimulationFrame simWindow = new SimulationFrame();
        simWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        simWindow.pack();
        simWindow.setSize(600,400);


    }

    public static void writeConfig() {
        //create the root of the JSON structure
        JSONObject root = new JSONObject();
        JSONArray rooms = new JSONArray();

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

                String roomWidth = roomWidthInput.getText();

                String roomLength = roomLengthInput.getText();

                //add to the object
                JSONObject roomObject = new JSONObject();
                roomObject.put("name", roomName);
                roomObject.put("width", roomWidth);
                roomObject.put("length", roomLength);

                rooms.add(roomObject);
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