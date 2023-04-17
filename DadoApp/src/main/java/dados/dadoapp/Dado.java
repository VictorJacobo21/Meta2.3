package dados.dadoapp;
import java.util.Random;
public class Dado {
    private int lados;
    public Dado(int lados) {
        this.lados = lados;
    }
    public int lanzar() {
        Random r = new Random();
        return r.nextInt(lados) + 1;
    }
    public int getLados() {
        return lados;
    }
    public void setLados(int lados) {
        this.lados = lados;
    }
}
