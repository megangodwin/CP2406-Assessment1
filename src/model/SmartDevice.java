package model;

import java.util.Scanner;

public class SmartDevice {


    //power usage in watts per hour
    //water usage in litres per hour

    public String name; //give device specific name such as "bedroomAirCon"
    public double powerUsage;
    public double waterUsage;
    public int status;
    public int xOffset, yOffset;
    private int deviceTime;


    protected SmartDevice(String name, double powerUsage, double waterUsage, int status, int xOffset, int yOffset){
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

    public void setStatus(int status){
        status = status;

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter status");
//        status = input.nextInt();
        if (status == 0) {
            System.out.println("The " + name + " is now off");
        } else if (status == 1) {
            System.out.println("The " + name + " is now on");
        }
    }
    
    protected void setDeviceClock(int time){
        //update time passed from smart house sim
        this.deviceTime = time;
    }
}
