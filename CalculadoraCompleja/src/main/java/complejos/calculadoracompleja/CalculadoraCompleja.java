package complejos.calculadoracompleja;
import java.util.Scanner;

public class CalculadoraCompleja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        NumeroComplejo complejo1 = new NumeroComplejo();
        NumeroComplejo complejo2 = new NumeroComplejo();
        int opcion;
        do {
            System.out.println("Calculadora de Numeros Complejos");
            System.out.println("[1] Suma");
            System.out.println("[2] Resta");
            System.out.println("[3] Multiplicacion");
            System.out.println("[4] Division");
            System.out.println("[5] Salir");
            System.out.println("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la parte real del primer número complejo:");
                    complejo1.setReal(scanner.nextInt());
                    System.out.println("Ingrese la parte imaginaria del primer número complejo:");
                    complejo1.setImaginario(scanner.nextInt());
                    System.out.println("Ingrese la parte real del segundo número complejo:");
                    complejo2.setReal(scanner.nextInt());
                    System.out.println("Ingrese la parte imaginaria del segundo número complejo:");
                    complejo2.setImaginario(scanner.nextInt());
                    int sumaReal = complejo1.getReal() + complejo2.getReal();
                    int sumaImaginaria = complejo1.getImaginario() + complejo2.getImaginario();
                    System.out.println("El resultado de la suma es: " + sumaReal + " + " + sumaImaginaria + "i");
                    break;
                case 2:
                    System.out.println("Ingrese la parte real del primer número complejo:");
                    complejo1.setReal(scanner.nextInt());
                    System.out.println("Ingrese la parte imaginaria del primer número complejo:");
                    complejo1.setImaginario(scanner.nextInt());
                    System.out.println("Ingrese la parte real del segundo número complejo:");
                    complejo2.setReal(scanner.nextInt());
                    System.out.println("Ingrese la parte imaginaria del segundo número complejo:");
                    complejo2.setImaginario(scanner.nextInt());
                    int restaReal = complejo1.getReal() - complejo2.getReal();
                    int restaImaginaria = complejo1.getImaginario() - complejo2.getImaginario();
                    System.out.println("El resultado de la resta es: " + restaReal + " + " + restaImaginaria + "i");
                    break;
                case 3:
                    System.out.println("Ingrese la parte real del primer número complejo:");
                    complejo1.setReal(scanner.nextInt());
                    System.out.println("Ingrese la parte imaginaria del primer número complejo:");
                    complejo1.setImaginario(scanner.nextInt());
                    System.out.println("Ingrese la parte real del segundo número complejo:");
                    complejo2.setReal(scanner.nextInt());
                    System.out.println("Ingrese la parte imaginaria del segundo número complejo:");
                    complejo2.setImaginario(scanner.nextInt());
                    int multiplicarReal = ((complejo1.getReal() * complejo2.getReal()) - (complejo1.getImaginario() * complejo2.getImaginario()));
                    int multiplicarImaginario = ((complejo1.getImaginario() * complejo2.getReal()) + (complejo1.getReal() * complejo2.getImaginario()));
                    System.out.println("El resultado de la multiplicacion es: " + multiplicarReal + " + " + multiplicarImaginario + "i");
                    break;
                case 4:
                    System.out.println("Ingrese la parte real del primer número complejo:");
                    complejo1.setReal(scanner.nextInt());
                    System.out.println("Ingrese la parte imaginaria del primer número complejo:");
                    complejo1.setImaginario(scanner.nextInt());
                    System.out.println("Ingrese la parte real del segundo número complejo:");
                    complejo2.setReal(scanner.nextInt());
                    System.out.println("Ingrese la parte imaginaria del segundo número complejo:");
                    complejo2.setImaginario(scanner.nextInt());
                    double divisor = Math.pow(complejo2.getReal(), 2) + Math.pow(complejo2.getImaginario(), 2);
                    double dividirReal = ((complejo1.getReal() * complejo2.getReal()) + (complejo1.getImaginario() * complejo2.getImaginario())) / divisor;
                    double dividirImaginario = ((complejo1.getImaginario() * complejo2.getReal()) - (complejo1.getReal() * complejo2.getImaginario())) / divisor;
                    System.out.println("El resultado de la división es: " + dividirReal + " + " + dividirImaginario + "i");
                    break;
                case 5:
                    System.out.println("Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida. Seleccione una opción válida.");
            }
        } while (opcion != 5);
        scanner.close();
        System.out.println("Gracias por usar la calculadora de números complejos.");
    }
}
