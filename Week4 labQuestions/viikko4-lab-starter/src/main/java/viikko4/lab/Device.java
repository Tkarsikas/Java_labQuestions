package viikko4.lab;

public abstract class Device {
    protected String name;

    public Device(String name) {
        if(name != null && !name.trim().isEmpty()){
            this.name = name;
        }else{
            throw new IllegalArgumentException("Väärä arvo! Device");
        }
    }

    public abstract Integer batteryPercent();
}