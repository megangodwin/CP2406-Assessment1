import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import model.*;
import view.*;

public class SmartHouseSimulator {

    public int time;
    public static int weatherStatus = 0;

    public SmartHouseSimulator() {
        //has a
        //house. which has room. which have objects
        //simulation frame

        //call the import config to instantiate the objects in the house list

        setConfig();


    }


    public void incrementTime() {

        //time - 1440 simulated minutes per simulation

        int seconds = 0;
        int MAX_SECONDS = 1440;
        try {
            while (seconds != MAX_SECONDS) {
                ++time;
                Thread.sleep(350);
                System.out.println(time);

            }
        } catch(InterruptedException e) {
            System.out.println("Interrupted exception");
            e.printStackTrace();
        }

    }

    public void weatherGenerator() {

        int max = 100;
        int min = 0;
        int randomNumber = (int) (Math.random() * ((max - min + 1)));

        int seconds = 0;
        int MAX_SECONDS = 1440;
        //random weather generation
        if (randomNumber <= 65) {
            if (weatherStatus == 0) {
                weatherStatus = 0; //do nothing
            } else if (weatherStatus != 0) {
                weatherStatus = 0;
                System.out.println("It is sunny"); //only displays whe there is a change in the weather
            }
        } else if (randomNumber > 65) {
            if (weatherStatus == 1) {
                weatherStatus = 1; //do nothing
            } else if (weatherStatus != 1) {
                weatherStatus = 1;
                System.out.println("It is raining"); //only displays when there is a change in the weather
            }
        }
        System.out.println(time);

        //to translate to readable time - while minute count isn't 60, keep counting. once count reaches 60, increment hour and reset minute count



    }

    public static ArrayList setConfig() {
        //turns the JSON file into usable objects

        JSONParser parser = new JSONParser();
        HashMap<String, Room> house = new HashMap();

        try {
            //read the file to an object
            Object obj = parser.parse(new FileReader("src/res/config.JSON"));

            //JSON file initiates as an object. parse this
            JSONObject jsonObj = (JSONObject) obj;

            //JSON object contains array of rooms. parse this
            JSONArray rooms = (JSONArray) jsonObj.get("rooms");

            //iterate through the array of rooms
            for (Object o : rooms) {
                //initiate the object
                JSONObject room = (JSONObject) o;

                String roomName = (String) room.get("name");
                System.out.println("Room name: " + roomName);

                int roomWidth = Integer.parseInt((String)room.get("width"));
                System.out.println("Room width: " + roomWidth);

                int roomLength = Integer.parseInt((String)room.get("length"));
                System.out.println("Room length: " + roomLength);

                //create room object
                Room rm = new Room();
                rm.setName(roomName);
                rm.setLength(roomLength);
                rm.setWidth(roomWidth);

                //append room object to the room array

                house.add(rm);

                //TEST - check to see if objects are successfully being appended
                System.out.println(house);
                System.out.println(house);

            }


        }catch(Exception e) {
            e.printStackTrace();

        }

        return house;
    }



}