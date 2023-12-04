/**
 * Crea un programa que pida dos cadenas de texto por teclado y luego indique si
 * son iguales,
 * además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
 * 
 * @author Fernando Lara Millan
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        String cadena1 = System.console().readLine("Ingrese la primera cadena: ");
        String cadena2 = System.console().readLine("Ingrese la segunda cadena: ");

        // Comparar las cadenas sin diferenciar entre mayúsculas y minúsculas
        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales (con diferenciación de mayúsculas y minúsculas).");
        } else if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Las cadenas son iguales (sin diferenciar entre mayúsculas y minúsculas).");
        } else {
            System.out.println("Las cadenas no son iguales.");
        }
    }
}
