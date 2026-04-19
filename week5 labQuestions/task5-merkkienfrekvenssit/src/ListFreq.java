import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ListFreq {

    public static String frequensies(String s) {
        if (s == null) {
            return "{}";
        }
        s.toLowerCase();
        Map<Character, Integer> letters = new HashMap<>();
        for (char l : s.toCharArray()) {
            if(Character.isLetter(l)){
                if(letters.containsKey(l)){
                    int count = letters.get(l)+1;
                    letters.put(l,count);
                }else{
                    letters.put(l,1);
                }
            }
        }
        return letters.toString();
    }
}