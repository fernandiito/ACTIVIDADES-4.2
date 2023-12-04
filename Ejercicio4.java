/**
 * Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay
 * (cuantas ‘a’,
 * cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe
 * diferenciar entre
 * mayúsculas y minúsculas. Por ejemplo dada la frase “Mi mama me mima” dirá que
 * hay:
 * Nº de A's: 3
 * Nº de E's: 1
 * Nº de I's: 2
 * Nº de O's: 0
 * Nº de U's: 0
 * @author Fernando Lara Millan
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        String frase = System.console().readLine("Introduce una frase: ");

        frase = frase.toLowerCase();

        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

        // itero sobre la cadena y cuento las vocales
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);

            switch (caracter) {
                case 'a':
                    contadorA++;
                    break;
                case 'e':
                    contadorE++;
                    break;
                case 'i':
                    contadorI++;
                    break;
                case 'o':
                    contadorO++;
                    break;
                case 'u':
                    contadorU++;
                    break;
            }
        }

        // Mostrar los resultados
        System.out.println("Nº de A's: " + contadorA);
        System.out.println("Nº de E's: " + contadorE);
        System.out.println("Nº de I's: " + contadorI);
        System.out.println("Nº de O's: " + contadorO);
        System.out.println("Nº de U's: " + contadorU);
    }
}
