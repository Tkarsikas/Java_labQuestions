/**
 * Tehtävä 2 – Metodien ylikuormitus (sum, min, max, taulukot)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Toteuta sum(int,int), sum(int,int,int), sum(int[]), sum(double[]).
 *  2. Toteuta max(int[]) ja min(int[]).
 *
 * VINKIT:
 *  - Käy taulukko silmukalla; varo tyhjiä taulukoita.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task02;

public class MathUtil {
    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static int sum(int[] a){
        int sumArray = 0;
    for(int i=0; i<a.length; i++){
        sumArray += a[i];
    }

    return sumArray;
    }

    public static double sum(double[] x){
        double sumArray = 0;
        for(int i=0; i<x.length; i++){
            sumArray += x[i];
        }
        return sumArray;
    }

    public static int max(int[] nums){
        int max = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }

    public static int min(int[] nums){
        int min=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;

    }

        public static double max(double[] nums){
        double max = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }

    public static double min(double[] nums){
        double min=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;

    }

    public static int placeholderInt(){ return 0; }
    public static double placeholderDouble(){ return 0.0; }
}