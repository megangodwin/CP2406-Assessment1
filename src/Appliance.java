public class Appliance extends SmartDevice {

    protected int xOffset, yOffset;

        protected Appliance(double powerUsage, double waterUsage, int status, int xOffset, int yOffset ) {
            //call smart object constructor
            super(powerUsage, waterUsage, status);
            this.xOffset = xOffset;
            this.yOffset = yOffset;
        }

}
