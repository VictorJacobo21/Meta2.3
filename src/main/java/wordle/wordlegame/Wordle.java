package wordle.wordlegame;

import java.util.ArrayList;
import java.util.Random;

public class Wordle {
    private ArrayList<String> palabras;
    private Random random = new Random();
    private String secreta;
    private String intento;

    public Wordle(){
        palabras = new ArrayList<>();
        palabras.add("carro");
        palabras.add("perro");
        palabras.add("verde");
        palabras.add("actor");
        palabras.add("dados");
        palabras.add("error");
        palabras.add("gordo");
        palabras.add("marco");
        palabras.add("otros");
        palabras.add("pelea");

        secreta = palabras.get(random.nextInt(palabras.size()));
    }

    public String getSecreto(){
        return secreta;
    }

    public void intento(String intento){
        this.intento = intento.toLowerCase(); // Convertir a minúsculas
        char[] arr1 = this.intento.toCharArray();
        char[] arr2 = secreta.toCharArray();
        boolean[] encontrados = new boolean[arr2.length]; // Array para llevar seguimiento de letras ya encontradas
        for(int i = 0; i < arr1.length; i++){
            boolean encontrado = false;
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j] && i == j && !encontrados[j]){ // Si la letra está bien colocada y no ha sido encontrada antes
                    System.out.println(arr1[i] + " pertenece a la palabra y esta colocada correctamente");
                    encontrado = true;
                    encontrados[j] = true; // Marcar como encontrada
                    break;
                }
                else if (arr1[i] == arr2[j] && !encontrados[j]){ // Si la letra pertenece a la palabra pero no está bien colocada y no ha sido encontrada antes
                    System.out.println(arr1[i] + " La letra pertenece a la palabra, pero no esta bien colocada");
                    encontrado = true;
                    encontrados[j] = true; // Marcar como encontrada
                    break;
                }
            }
            if (!encontrado) {
                System.out.println(arr1[i] + " La letra no pertenece a la palabra");
            }
        }
        System.out.println("Fin del intento");
    }
}


