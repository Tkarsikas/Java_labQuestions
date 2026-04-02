package viikko4.lab;

public class DeviceUtils {
    private DeviceUtils() {
    }

    public static int averageBattery(Device[] ds) {
        int sum = 0;
        int amount = 0;
        if(ds != null){
            for(Device d : ds){
                sum += d.batteryPercent();
                amount++;
            }
            
            return sum/amount;
        }else{
            throw new IllegalArgumentException("Väärä arvo! DeviceUtils");
        }
    }
}