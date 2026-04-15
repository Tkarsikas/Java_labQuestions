import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1,32,5));

        
        System.out.println(IntStats.min(intList));
        System.out.println(IntStats.max(intList));
        System.out.println(IntStats.avg(intList));
    }
}

