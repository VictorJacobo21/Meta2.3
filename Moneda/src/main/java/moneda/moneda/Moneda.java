package moneda.moneda;
import java.util.HashSet;
import java.util.Random;
public class Moneda {
    private String result;
    private HashSet<String> results;
    public Moneda() {
        result = null;
        results = new HashSet<String>();
    }
    public String lanzar() {
        Random rand = new Random();
        int toss = rand.nextInt(2);
        if (toss == 0) {
            result = "cara";
        } else {
            result = "sello";
        }
        results.add(result);
        return result;
    }
    public HashSet<String> getResultados() {
        return results;
    }
}
