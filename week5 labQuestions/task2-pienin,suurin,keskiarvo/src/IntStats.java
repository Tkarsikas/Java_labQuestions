import java.util.List;

public class IntStats {
    public static int min(List<Integer> luvut){
        int min = luvut.get(0);
        for (int luku : luvut) {
            if(luku < min){
                min = luku;
            }
        }
        return min;
    }

    public static int max(List<Integer> luvut){
        int max = luvut.get(0);
        for(int luku : luvut){
            if(luku>max){
                max = luku;
            }
        }
        return max;
    }

    public static double avg(List<Integer> luvut){
        double sum = 0;
        for (int luku : luvut) {
            sum += luku;
        }
        System.out.println(sum);
        double avg = sum/luvut.size();
        return Math.round(avg*100.0)/100.0;
    }
}
