import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //L1
        List<String> lStrings = new ArrayList<>();

        lStrings.add("Omena");
        System.out.println(lStrings);

        //L2
        List<Integer> lIntegers = new ArrayList<>();
        lIntegers.add(10);
        lIntegers.add(20);
        System.out.println(lIntegers);

        //L3
        List<String> lStrings2 = new ArrayList<>();
        lStrings2.add("Koira");
        lStrings2.add("Kissa");
        System.out.println(lStrings2.get(0));

        //L4
        List<String> lStrings3 = new ArrayList<>();
        lStrings3.add("A");
        lStrings3.add("B");
        lStrings3.add("C");
        lStrings3.remove("B");
        System.out.println(lStrings3);

        //L5
        System.out.println(lStrings3.size());

        //L6
        List<Integer> lIntegers2 = new ArrayList<>();
        lIntegers2.add(1);
        lIntegers2.add(2);
        lIntegers2.add(3);
        for(int i = 0; i<lIntegers2.size(); i++){
            System.out.println(lIntegers2.get(i));
        }
        for(int luku : lIntegers2){
            System.out.println(luku);
        }
    }
}
