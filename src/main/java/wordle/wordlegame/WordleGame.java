package wordle.wordlegame;
import java.util.Scanner;
/**
 *
 * @author VictorJ
 */
public class WordleGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oportunidades = 8;
        boolean win = false;
        boolean correcta = false;
        Wordle juego = new Wordle();
        
        System.out.println("Wordle, El juego de adivinar la palabra!!");
        System.out.println("Tienes 8 intentos para decifrar la palabra");
        System.out.println("NOTA: Este juego esta diseñado para palabras de 5 letras, palabras mas extensas no se validaran");
        System.out.println("Instrucciones");
        System.out.println("El juego terminara cuando adivines la palabra o se acaben tus intentos");
        System.out.println("---------------------------------------------");
        
        while(oportunidades != 0 && !win){
            System.out.println("Ingresa tu respuesta: ");
            String intento = scanner.nextLine();
            if (intento.length() > juego.getSecreto().length() || intento.length() < juego.getSecreto().length() ) {
             System.out.println("La palabra ingresada es demasiado larga o demasiado corta. Inténtalo de nuevo.");
             continue;
             }

            
            juego.intento(intento);
            if(intento.equals(juego.getSecreto().toLowerCase())){
                win = true;
                System.out.println("¡Felicidades! Ganaste el juego.");
            } 
            else {
                oportunidades--;
                System.out.println("Te quedan " + oportunidades + " intentos."); 
            }
        }
        
        if(!win) {
            System.out.println("Lo siento, has perdido. La palabra secreta era: " + juego.getSecreto());
        }
    }
}
