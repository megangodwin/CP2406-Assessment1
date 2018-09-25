package model;

import main.SmartHouseSimulator;

import java.util.Scanner;

public class SmartDevice {


    //power usage in watts per hour
    //water usage in litres per hour

    private double powerUsage;
    private double waterUsage;
    private int status;
    private int xOffset, yOffset;
    int time;

    protected SmartDevice(double powerUsage, double waterUsage, int status, int xOffset, int yOffset){
        this.powerUsage = powerUsage;
        this.waterUsage = waterUsage;
        this.status = status;
        this.xOffset = xOffset;
        this.yOffset = yOffset;

    }

    public void getStatus(){
        if (status == 0) {
            System.out.println("The device is off");
        } else if (status == 1) {
            System.out.println("The device is on");
        }
    }

    public boolean setStatus(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter status");

        //was the setting successful
        //if (deviceStatus == setting)
        return true;
    }

    protected void update(int time){
        //update time passed from smart house sim
        time = SmartHouseSimulator.getTime();
    }
}
