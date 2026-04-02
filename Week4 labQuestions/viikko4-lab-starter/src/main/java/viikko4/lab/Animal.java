package viikko4.lab;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        if(name != null && name.trim().isEmpty()){
        this.name = name;
        }else{
            throw new IllegalArgumentException("Väärä arvo!");
        }
    }

    public abstract String sound();
}