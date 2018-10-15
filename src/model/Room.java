package model;

public class Room {

    //rooms control smartDevice positions?
    //initialise rooms based on configuration

    //dimensions in metres
    SmartDevice[] smartDevices;
    int temperature;
    int length;
    int width;
    String name;

    public Room(String name, int length, int width) {
        this.name = name;
        this.temperature = 25;
        this.length = length;
        this.width = width;
    }

    public void getTemperature(int temperature) {

        System.out.println("The temperature in the room is " + temperature);
    }

    public SmartDevice[] getSmartObjects () {
        return smartDevices;
    }

    public void setSmartObjects (SmartDevice[] smartDevices) {
        this.smartDevices = smartDevices;
    }

    public int getWidth () {
        return width;
    }

    public void setWidth (int width) {
        this.width = width;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getLength () {
        return length;
    }

    public void setLength (int length) {
        this.length = length;
    }

}
