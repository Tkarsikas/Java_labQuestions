import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        //M1
        Map<String, Integer> map1 = new HashMap();
        map1.put("A", 1);
        map1.put("B", 2);
        System.out.println(map1.get("A"));

        //M2
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("first", 1);
        map2.put("Second", 2);
        map2.put("Third", 3);
        for(Map.Entry<String, Integer> entry : map2.entrySet()){
            
            System.out.println("Avain: "+entry.getKey()+", arvo: "+entry.getValue());
        }

        //M3
        Map<Integer, String> map3 = new HashMap<>();
        map3.put(1, "Punainen");
        map3.put(2, "Sininen");

        System.out.println(map3.keySet()+" "+map3.get(2));
    }
}
