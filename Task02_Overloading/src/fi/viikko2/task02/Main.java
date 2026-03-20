/**
 * Tehtävä 2 – Main (testaa MathUtil)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo int[] ja double[] ja testaa sum/min/max.
 *  2. Tulosta tulokset.
 *
 * VINKIT:
 *  - Korvaa placeholderit oikeilla metodeilla kun olet valmis.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task02;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        double[] b = {1.5,2.5,3.0};
        System.out.println("kahden luvun summa: " + MathUtil.sum(a[0], a[1]));
        System.out.println("kolmen luvun summa: " + MathUtil.sum(a[0], a[1], a[2]));
        System.out.println("int taulukon summa: " + MathUtil.sum(a));
        System.out.println("double taulukon summa: " + MathUtil.sum(b));
        System.out.println("max int: " + MathUtil.max(a));
        System.out.println("min int: " + MathUtil.min(a));
        System.out.println("max double: " + MathUtil.max(b));
        System.out.println("min double: " + MathUtil.min(b));

    }
}