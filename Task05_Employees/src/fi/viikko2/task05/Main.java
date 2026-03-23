/**
 * Tehtävä 5 – Main
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo Employee[] ja laske palkkasumma.
 *  2. Tulosta tiedot.
 *
 * VINKIT:
 *  - Toteuta aliluokat ensin.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task05;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tehtävä 5: implementoi SalariedEmployee ja HourlyEmployee ennen ajoa.");
        Employee e[] = {
            new HourlyEmployee("Jarkko", 24.3, 70), 
            new HourlyEmployee("Jarkko", 24.3, 70), 
            new HourlyEmployee("Juuso", 14.89, 143.5), 
            new SalariedEmployee("Jonne", 2450),
            new SalariedEmployee("Janne", 4872),
            new SalariedEmployee("Jouko", 1514),
            new SalariedEmployee("Jouko", 1514)
        };

        double sum =0;
        for (Employee emp: e){
            sum+=emp.monthlyPay();
        } 
        System.out.println("Palkat yhteensä: "+sum);


        System.out.println(e[5].getClass());
        System.out.println(e[4].getClass());
        System.out.println(e[5].toString());
        System.out.println(e[6].toString());
        System.out.println(e[0].equals(e[2]));
        System.out.println(e[5].equals(e[6]));

    }
}