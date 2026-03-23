/**
 * Tehtävä 5 – SalariedEmployee
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Perii Employee; kenttä monthlySalary.
 *  2. monthlyPay() palauttaa kuukausipalkan.
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

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, double monthlySalary){
        super(name);
        this.monthlySalary=monthlySalary;
    }
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }


    @Override
    public double monthlyPay(){ 
        return monthlySalary;
     }

    @Override
    public String toString(){ 
        return "Henkilön: "+name+" kuukausipalkka: "+monthlySalary;
     }

    @Override
    public boolean equals(Object o){ 
        if(this == o)return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalariedEmployee other = (SalariedEmployee)o;
         return this.monthlySalary == other.monthlySalary && 
         java.util.Objects.equals(this.name, other.name);
    }
}