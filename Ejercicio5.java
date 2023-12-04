/**
 * Realiza un programa que lea una frase por teclado e indique si la frase es un
 * palíndromo o
 * no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas).
 * Supondremos que
 * el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni
 * acentos, etc.). Un
 * palíndromo es un texto que se lee igual de izquierda a derecha que de derecha
 * a izquierda.
 * Por ejemplo:
 * Amigo no gima
 * Dabale arroz a la zorra el abad
 * Amo la pacífica paloma
 * A man a plan a canal Panama
 * @author Fernando Lara Millan
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        String frase = System.console().readLine("Introduce una frase: ");

        // la funcion replaceAll me elimina los espacios
        frase = frase.replaceAll("\\s", "").toLowerCase();

        if (esPalindromo(frase)) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }
    }
/**
 * esPalindromo. Comprueba si la cadena que introduzco es palindroma
 * @param frase introducida por el usuario
 * @return true or false en funcion de si cumple el palindromo o no
 */
    public static boolean esPalindromo(String frase) {
        int longitud = frase.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (frase.charAt(i) != frase.charAt(longitud - i - 1)) {
                return false;
            }
        }
        return true;
    }
}