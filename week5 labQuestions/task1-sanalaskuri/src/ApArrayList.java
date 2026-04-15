import java.util.List;

public class ApArrayList {
    public static void main(String[] args) throws Exception {
        String text  = "  Hello,    World! ja niin   että  ";

        System.out.println(countWords(text));
    }

    public static int countWords(String text){
        String[] words = text
        .trim()
        .replaceAll("\\s+", " ")
        .split(" ");
        return words.length;
    }
}
