package dados.dadoapp;
import java.util.ArrayList;
import java.util.Scanner;
public class DadoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Dado> dados = new ArrayList<Dado>();
        System.out.println("Bienvenido a la aplicación de dados");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Ingrese el número de lados del dado %d (6 o 12): ", i);
            int lados = scanner.nextInt();
            while (lados != 6 && lados != 12) {
                System.out.println("El número de lados debe ser 6 o 12");
                System.out.printf("Ingrese el número de lados del dado %d (6 o 12): ", i);
                lados = scanner.nextInt();
            }
            dados.add(new Dado(lados));
        }
        System.out.println("\nLanzando los dados...\n");
        for (Dado dado : dados) {
            int valor = dado.lanzar();
            System.out.printf("El dado de %d lados ha sacado un %d\n", dado.getLados(), valor);
        } 
        scanner.close();
    }
}
