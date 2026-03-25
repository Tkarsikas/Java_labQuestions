import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        //S1
        Set<String> sStrings = new HashSet<>();
        sStrings.add("Aurinko");
        sStrings.add("Kuu");
        System.out.println(sStrings);
        
        //S2
        Set<Integer> sIntegers = new HashSet<>();
        sIntegers.add(4);
        sIntegers.add(4);
        System.out.println(sIntegers);

        //S3
        TreeSet<Integer> tIntegers = new TreeSet<>();
        tIntegers.add(3);
        tIntegers.add(1);
        tIntegers.add(2);
        System.out.println(tIntegers);

    }
}
