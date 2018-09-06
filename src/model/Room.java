package model;

public class Room {

    //rooms control smartDevice positions?

    int temperature;

    public Room(int temperature) {
        this.temperature = temperature;

    }

    public void getTemperature(int temperature) {

        System.out.println("The temperature in the room is " + temperature);
    }

}
