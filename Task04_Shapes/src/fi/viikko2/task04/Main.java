/**
 * Tehtävä 4 – Main
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo Shape[] ja laske kokonaispinta-ala.
 *  2. Tulosta toString()-arvot.
 *
 * VINKIT:
 *  - Toteuta aliluokat ensin.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Tehtävä 4: implementoi Rectangle ja Circle ennen ajoa.");
        Circle c = new Circle(5);
        Circle c1 = new Circle(5);
        Rectangle r = new Rectangle(10, 10);
        Rectangle r1 = new Rectangle(10, 10);
        
        System.out.println(c.toString());
        System.out.println(c.area());
        System.out.println(c.equals(c1));
        System.out.println("-------------------");
        
        System.out.println(r.toString());
        System.out.println(r.area());
        System.out.println(r.equals(r1));
    }
}