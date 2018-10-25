package model;

public class AirCon extends Fixture {

    public AirCon(String name, double powerUsage, double waterUsage, int status, int xOffset, int yOffset) {
        super(name, powerUsage, waterUsage, status, xOffset, yOffset);
        powerUsage = 5000;
    }

    //average air con power usage 5000 watts
}
