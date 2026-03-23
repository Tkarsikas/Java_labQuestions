/**
 * Tehtävä 5 – HourlyEmployee
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Perii Employee; kentät hourlyRate, hoursPerMonth.
 *  2. monthlyPay() = rate * hours.
 *  3. toString() kuvaava.
 *
 * VINKIT:
 *  - Muista super(name).
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task05;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursPerMonth;

    public HourlyEmployee(String name, double hourlyRate, double hoursPerMonth){
        super(name);
        this.hourlyRate=hourlyRate;
        this.hoursPerMonth=hoursPerMonth;
    }


    @Override
    public double monthlyPay(){ 
        return hourlyRate * hoursPerMonth;
    }

    @Override
    public String toString(){ 
        return "Kuukauden tunnit: "+hoursPerMonth+ ", tuntipalkka"+hourlyRate;
    }

    @Override
    public boolean equals(Object o){ 
        if(this == o)return true;
        if (o == null || getClass() != o.getClass()) return false;
        HourlyEmployee other = (HourlyEmployee)o;
        return java.util.Objects.equals(this.name, other.name) &&
        this.hoursPerMonth == other.hoursPerMonth && this.hourlyRate == other.hourlyRate;
    }
}