package model;

import java.util.Scanner;

public class Sprinkler extends Appliance {

    public int wateringTime;
    public int startTime;
    int waterSetting;
    int deviceWeatherStatus;

    public Sprinkler(String name, double powerUsage, double waterUsage, int status, int xOffset, int yOffset) {
        super(name, powerUsage, waterUsage, status, xOffset, yOffset);
        powerUsage = 0;
        waterUsage = 3861.12;
        status = 0;
        this.wateringTime = wateringTime;
        this.startTime = startTime;
    }

    public boolean setWateringTime(int waterSetting) {
        //how long should the sprinkler run

        return true;
    }

    public int getWateringTime() {
        //the length of time the sprinkler is set to run

        return wateringTime;
    }

    public void setStartTime() {
        //the time at which the sprinkler will run

    }

    public int getStartTime() {
        //print the time the sprinkler is set to start
        return startTime;
    }

    public void getWeatherStatus(int weatherStatus) {
        this.deviceWeatherStatus = weatherStatus;
    }
}
