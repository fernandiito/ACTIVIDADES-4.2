/**
 * Crea un programa que pida una cadena de texto por teclado y luego muestre
 * cada palabra
 * de la cadena en una línea distinta
 * 
 * @author Fernando Lara Millan
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        String cadena = System.console().readLine("Ingresa una cadena de texto: ");

        String[] palabras = cadena.split(" ");

        System.out.println("Palabras en líneas separadas:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }

    }
}