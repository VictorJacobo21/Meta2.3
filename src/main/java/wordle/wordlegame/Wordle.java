package wordle.wordlegame;

import java.util.Random;
/**
 *
 * @author VictorJ
 */
public class Wordle {
    private String[] palabras;
    private Random random = new Random();
    private String secreta;
    private String resultado;

    public Wordle() {
        palabras = new String[]{"carro", "perro", "verde", "actor", "dados", "error", "gordo", "marco", "otros", "pelea"};
        secreta = palabras[random.nextInt(palabras.length)];
    }

    public String getSecreto() {
        return secreta;
    }

    public void intento(String intento) {
        char[] arr1 = intento.toCharArray();
        char[] arr2 = secreta.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean encontrado;
        for (int i = 0; i < arr1.length; i++) {
            encontrado = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && i == j) {
                    sb.append(arr1[i] + " pertenece a la palabra y está colocada correctamente\n");
                    encontrado = true;
                    break;
                } else if (arr1[i] == arr2[j]) {
                    sb.append(arr1[i] + " La letra pertenece a la palabra, pero no está bien colocada\n");
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                sb.append(arr1[i] + " La letra no pertenece a la palabra\n");
            }
        }
        resultado = sb.toString();
        System.out.println("Fin del intento");
    }

    public String getResultado() {
        return resultado;
    }
}


