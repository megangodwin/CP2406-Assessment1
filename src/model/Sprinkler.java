package model;

public class Sprinkler extends Appliance {

    protected int wateringTime;
    protected int startTime;

    protected Sprinkler(double powerUsage, double waterUsage, int status, int xOffset, int yOffset) {
        super(powerUsage, waterUsage, status, xOffset, yOffset);
        powerUsage = 0;
        waterUsage = 3861.12;
        status = 0;
        this.wateringTime = wateringTime;
        this.startTime = startTime;
    }

    public boolean setWateringTime() {
        //how long should the sprinkler run

        return true;
    }

    public int getWateringTime() {
        //the length of time the sprinkler is set to run

        //will this be an int? TODO
    }

    public boolean setStartTime() {
        //the time at which the sprinkler will run

        return true;
    }

    public int getStartTime() {
        //print the time the sprinkler is set to start

    }
}
