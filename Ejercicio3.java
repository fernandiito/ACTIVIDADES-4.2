public class Ejercicio3 {
    public static void main(String[] args) {
        String nombre = System.console().readLine("Ingrese su nombre: ");
        String apellido1 = System.console().readLine("Ingrese su primer apellido: ");
        String apellido2 = System.console().readLine("Ingrese su segundo apellido: ");

        String codigoUsuario = generarCodigo(nombre, apellido1, apellido2);

        System.out.println("Código de usuario: " + codigoUsuario.toUpperCase());
    }

    /**
     * tresPrimerasLetras. Esta funcion toma una cadena de caracteres y si al menos
     * tiene 3 toma los 3 primeros.
     * 
     * @param cadena que se le pasa al usuario (nombre, apellido1, apellido2),
     *               comprueba que tenga al menos tres caracteres y toma los 3
     *               primeros
     * @return la cadena modificada tomando solo los 3 primeros caracteres
     */
    public static String tresPrimerasLetras(String cadena) {
        if (cadena.length() >= 3) {
            return cadena.substring(0, 3);
        } else {
            return cadena;
        }
    }

    /**
     * generarCodigo. usa la funcion tresPrimerasLetras para crear el codigo de
     * usuario unico a partir de su nombre y sus apellidos
     * 
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @return el codigo del usuario generado con su nombre y apellidos
     */
    public static String generarCodigo(String nombre, String apellido1, String apellido2) {

        String tresLetrasNombre = tresPrimerasLetras(nombre);
        String tresLetrasApellido1 = tresPrimerasLetras(apellido1);
        String tresLetrasApellido2 = tresPrimerasLetras(apellido2);

        return tresLetrasNombre + tresLetrasApellido1 + tresLetrasApellido2;
    }
}
