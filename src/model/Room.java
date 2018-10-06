package model;

public class Room {

    //rooms control smartDevice positions?
    //initialise rooms based on configuration

    int temperature;
    int xOffset;
    int yOffset;

    public Room() {
        this.temperature = 25;
        this.xOffset = 0;
        this.xOffset = 0;
    }

    public void getTemperature(int temperature) {

        System.out.println("The temperature in the room is " + temperature);
    }

}
