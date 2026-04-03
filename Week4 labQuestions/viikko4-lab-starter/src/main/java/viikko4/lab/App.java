package viikko4.lab;

import java.util.ArrayList;
import java.util.List;

public class App {

    //main 
    public static void main(String[] args) {
        //----L1----
        System.out.println("L1");
        Person p1 = new Person("jarkko", 15);
        System.out.println(p1.getName() + ", Age: "+ p1.getAge());
        System.out.println("");
        
        //----L2----
        System.out.println("L2");
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Cat("Mirri"));
        animalList.add(new Cat("Murri"));
        animalList.add(new Dog("Uno"));
        for (Animal animal : animalList) {
                System.out.println(animal.sound());
        }
        System.out.println("");
            
        //----L3----
        System.out.println("L3");
        Thermometer t1 = new Thermometer(23.5);
        System.out.println(t1.measure());
        System.out.println("");

        //----L4----
        System.out.println("L4");
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Toyota", 45.0));
        vehicles.add(new Car("Volvo", 125.8));
        vehicles.add(new Bike("Helkama", 23.0));
        vehicles.add(new Car("Toyota", 15.8));
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.travelTimeHours(58.6));
        }
        System.out.println("");

        //----L5----
        System.out.println("L5");
        Vehicle[] arr = vehicles.toArray(new Vehicle[0]);
        System.out.println(TravelUtils.sumTravelTimes(arr, 58.6));
        System.out.println("");
        
        //----L6----
        System.out.println("L6");
        Book b1 = new Book("Seitsemän veljestä", "Anna", 1997);
        System.out.println(b1.label());
        System.out.println("");
        
        //----L7, L8, L9----
        System.out.println("L7,L8,L9");
        StudentRegister objRegister = new StudentRegister();
        objRegister.add("Harri", 85);
        objRegister.add("Ilkka", 4);
        objRegister.add("Juuso", 845);
        objRegister.add("Tommi", 25);
        objRegister.add("Tuomas", 75);
        objRegister.add("Tuomas", 3);
        objRegister.add("Jaakko", 47);
        List<Student> list = objRegister.searchByName("Tuomas");
        for (Student student : list) {
            System.out.println(student.getName()+ ", "+student.getCredits());
        }
        List<Student> list2 = objRegister.searchCreditsGreaterOrEqual(50);
        for (Student student : list2) {
            System.out.println(student.getName()+ ", "+student.getCredits());
        }
        System.out.println("");
            
        //----L10----
        System.out.println("L10");
        List<Phone> dList = new ArrayList<>();
        dList.add(new Phone("Samsung", 86));
        dList.add(new Phone("Iphone", 24));
        dList.add(new Phone("OnePlus", 99));
        dList.add(new Phone("Xiaomi", 71));
        dList.add(new Phone("Nokia", 3));
        dList.add(new Phone("Huawei", 0));

        PowerBank[] powerBanks = {
            new PowerBank("1", 50),
            new PowerBank("2", 100),
            new PowerBank("1", 2)
        };

        System.out.println("Phones battery: ");
        for (Phone device : dList) {
            System.out.print(device.batteryPercent()+", ");
            device.use(120);            
            System.out.print(device.batteryPercent()+", ");
            device.recharge(10);
            System.out.print(device.batteryPercent()+", ");
            System.out.println("");
        }
        
        System.out.println("PowerBanks battery:");
        for (PowerBank powerBank : powerBanks) {
            System.out.print(powerBank.batteryPercent()+", ");
            powerBank.discharge(50);
            System.out.print(powerBank.batteryPercent()+", ");
            powerBank.recharge(100);
            System.out.print(powerBank.batteryPercent()+", ");
            System.out.println("");
        }
        System.out.println("DeviceUtils testing:");
        System.out.println(DeviceUtils.averageBattery(powerBanks));
        Device[] phones = dList.toArray(new Device[0]); 
        System.out.println(DeviceUtils.averageBattery(phones));
        System.out.println("");


    }

}
