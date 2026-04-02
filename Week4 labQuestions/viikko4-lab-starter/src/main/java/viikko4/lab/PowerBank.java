package viikko4.lab;

public class PowerBank extends Device implements Rechargeable {
    private int battery;

    public PowerBank(String name, Integer b) {
        super(name);
        if(b != null && b<=100 && b>=0){
            this.battery = b;
        }else{
            throw new IllegalArgumentException("Väärä arvo! PowerBank");
        }
    }

    public void recharge(Integer minutes) {
        if(minutes != null && minutes>0){
            battery += minutes;
            if(battery > 100){
                battery = 100;
            }    
        }else{
            throw new IllegalArgumentException("Väärä arvo! PowerBank");
        }    
    }
    
    public void discharge(Integer minutes) {
        if(minutes != null && minutes>0){
            battery -= minutes/3;
            if(battery < 0){
                battery = 0;
            }
        }else{
            throw new IllegalArgumentException("Väärä arvo! PowerBank");
        }    
        }

    public Integer batteryPercent() {
        return battery;
    }
}