package moneda.moneda;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        Moneda miMoneda = new Moneda();
        System.out.println("Primer lanzamiento: " + miMoneda.lanzar());
        System.out.println("Segundo lanzamiento: " + miMoneda.lanzar());
        System.out.println("Tercer lanzamiento: " + miMoneda.lanzar());
        HashSet<String> todosLosResultados = miMoneda.getResultados();
        System.out.println("Todos los resultados: " + todosLosResultados);
    }
}
