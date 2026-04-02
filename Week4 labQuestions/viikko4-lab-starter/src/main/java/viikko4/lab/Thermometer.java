package viikko4.lab;

public class Thermometer implements Measurable {
    private Double celsius;

    public Thermometer(Double c) {
        if(c != null){
        this.celsius = c;
        }else{
            throw new IllegalArgumentException("Väärä arvo!");
        }
    }
    @Override
    public Double measure() {
        return celsius;
    }
}