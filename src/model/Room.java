package model;

public class Room {

    //rooms control smartDevice positions?
    //initialise rooms based on configuration

    //dimensions in metres

    int temperature;
    int length;
    int width;

    public Room() {
        this.temperature = 25;
        this.length = length;
        this.width = width;
    }

    public void getTemperature(int temperature) {

        System.out.println("The temperature in the room is " + temperature);
    }

}
