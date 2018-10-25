<<<<<<< HEAD
package model;

import java.util.Scanner;

public class Sprinkler extends model.Appliance {

    protected int wateringTime;
    protected int startTime;
    int waterSetting;

    protected Sprinkler(double powerUsage, double waterUsage, int status, int xOffset, int yOffset) {
        super(powerUsage, waterUsage, status, xOffset, yOffset);
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

        //will this be an int? TODO
        return wateringTime;
    }

    public boolean setStartTime() {
        //the time at which the sprinkler will run

        return true;
    }

    public int getStartTime() {
        //print the time the sprinkler is set to start

        return startTime;

    }
}
=======
package model;

import java.util.Scanner;

public class Sprinkler extends Appliance {

    protected int wateringTime;
    protected int startTime;
    int waterSetting;
    int deviceWeatherStatus;

    protected Sprinkler(double powerUsage, double waterUsage, int status, int xOffset, int yOffset) {
        super(powerUsage, waterUsage, status, xOffset, yOffset);
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
        if (deviceWeatherStatus == 1) {
            this.status = 0;
        }
    }
}
>>>>>>> origin/sprinklers
