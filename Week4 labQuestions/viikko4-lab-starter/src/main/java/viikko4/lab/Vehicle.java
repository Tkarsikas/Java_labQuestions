package viikko4.lab;

public abstract class Vehicle {
    protected String name;

    public Vehicle(String name) {
        if(name != null && !name.trim().isEmpty()){
        this.name = name;
        }else{
            throw new IllegalArgumentException("Väärä arvo! Vehicle");
        }
    }

    public abstract Double travelTimeHours(Double km);
}