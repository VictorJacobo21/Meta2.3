package enteros.numerosenteros;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NumerosRepetidos {
    private ArrayList<Integer> numeros;
    
    public NumerosRepetidos(ArrayList<Integer> numeros){
        this.numeros = numeros;
    }
    
    public void imprimirNumeros(){
    System.out.println("Los números en el arreglo son:");
    for(int numero : numeros){
        System.out.print(numero + " ");
    }
    System.out.println();
    }
    public void mostrarRepeticiones(){
        Map<Integer, Integer> repeticiones = new HashMap<>();
        
        for(int numero : numeros){
            if(repeticiones.containsKey(numero)){
                repeticiones.put(numero, repeticiones.get(numero) + 1);
            }
            else{
                repeticiones.put(numero, 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : repeticiones.entrySet()){
            System.out.println("El número " + entry.getKey() + " se repitió " + entry.getValue() + " veces.");
        }
    }
}