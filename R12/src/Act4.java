import java.util.Scanner;

public class Act4 {

    // Método caracterEn del ejercicio anterior
    public static char caracterEn(String cadena, int posicion) throws Exception {
        if (posicion >= 0 && posicion < cadena.length()) {
            return cadena.charAt(posicion);
        } else {
            throw new Exception("La posición está fuera del rango válido.");
        }
    }

    public static void main(String[] args) {
        // Crear objeto Scanner asociado a la entrada estándar
        Scanner sc = new Scanner(System.in);

        // Leer cadena desde la consola
        System.out.print("Introduce una cadena de texto: ");
        String lect_teclado = sc.nextLine();

        // Intentar obtener el carácter en la posición 7
        try {
            char resultado = caracterEn(lect_teclado, 7);
            System.out.println("Carácter en la posición 7: " + resultado);
        } catch (Exception e) {
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe.");
        }

        // Cerrar el Scanner
        sc.close();
    }
}


