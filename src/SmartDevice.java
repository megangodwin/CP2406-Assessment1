public class SmartDevice {


    //power usage per watt
    //water usage per litre

    double powerUsage;
    double waterUsage;
    int status;

    protected SmartDevice(double powerUsage, double waterUsage, int status){
        this.powerUsage = powerUsage;
        this.waterUsage = waterUsage;
        this.status = status;
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
