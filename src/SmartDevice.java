public class SmartDevice {


    //power usage per watt
    //water usage per litre

    private double powerUsage;
    private double waterUsage;
    private int status;
    private int xOffset, yOffset;

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

        //was the setting successful
        return true;
    }
}
