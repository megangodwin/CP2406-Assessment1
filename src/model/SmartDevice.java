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
        this.powerUsage = 0;
        this.waterUsage = 0;
        this.status = 0;
        this.xOffset = 0;
        this.yOffset = 0;

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

    public int getYOffset ()
    {
        return yOffset;
    }

    public void setYOffset (int yOffset)
    {
        this.yOffset = yOffset;
    }

    public int getXOffset ()
    {
        return xOffset;
    }

    public void setXOffset (int xOffset)
    {
        this.xOffset = xOffset;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "[yOffset = "+yOffset+", xOffset = "+xOffset+", name = "+name+"]";
    }
}
