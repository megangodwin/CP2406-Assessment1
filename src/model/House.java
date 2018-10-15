package model;

public class House {

    //controls how light level is presented based on time passed to it, which then passes to the rooms?


    //Model View Controller

    //Rooms is a list of room objects

    public House(){

        Room rooms[] = new Room[4];
        rooms[0] = new Room("living room", 5, 5);
        rooms[1] = new Room("kitchen", 5, 3);
        rooms[2] = new Room("bedroom", 3, 4);
        rooms[3] = new Room("bathroom", 2, 3);

    }


}