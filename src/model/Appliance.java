package model;


import java.util.Scanner;

public class Appliance extends SmartDevice {

    public Appliance(String name, double powerUsage, double waterUsage, int status, int xOffset, int yOffset) {
        //call smart object constructor
        super(name, powerUsage, waterUsage, status, xOffset, yOffset);

    }

    public void setPosition(int x, int y) {
        xOffset = x;
        yOffset = y;

    }


}

