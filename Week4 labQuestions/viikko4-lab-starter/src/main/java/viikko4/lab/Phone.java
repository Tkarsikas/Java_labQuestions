package viikko4.lab;

public class Phone extends Device implements Rechargeable {
    private int battery;

    public Phone(String name, Integer b) {
        super(name);
        if(b != null && b>=0 && b<=100){
            this.battery = b;
        }else{
            throw new IllegalArgumentException("Väärä arvo! Phone");
        }
    }
    
    public void use(Integer minutes) {
        
        if(minutes != null && minutes>0){
            battery -= minutes/5;
            if(battery<0){
                battery=0;
            }
        }else{
            throw new IllegalArgumentException("Väärä arvo! Phone");
        }
    }
    
    @Override
    public void recharge(Integer minutes) {
        if(minutes != null && minutes>0){
            battery += minutes/2;
            if(battery>100){
                battery=100;
            }
        }else{
            throw new IllegalArgumentException("Väärä arvo! Phone");
        }
    }
    
    @Override
    public Integer batteryPercent() {
        return battery;
    }
}