package enteros.numerosenteros;
import java.util.ArrayList;
public class NumerosEnteros {
        ArrayList<Integer> numeros;
      public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for(int i=0; i<10; i++){
            numeros.add((int)(Math.random() * 12)); 
        }
        
        NumerosRepetidos numerosRepetidos = new NumerosRepetidos(numeros);
        numerosRepetidos.imprimirNumeros();
        numerosRepetidos.mostrarRepeticiones();
    }
}