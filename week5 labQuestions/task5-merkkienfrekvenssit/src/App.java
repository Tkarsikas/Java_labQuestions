import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String s = "Tästä Stringistä tehdään taulukko, jossa näkyy kirjainten määrät";

        String newS = ListFreq.frequensies(s);
        System.out.print(newS);
    }
}
