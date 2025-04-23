public class Act3 {
        /*
        3. Escribe un método auxiliar de nombre caracterEn en Java que realice la siguiente acción:
            ○ Recibe como parámetros una cadena (String) y un entero (int);
            ○ Si el entero está entre 0 y la longitud de la cadena (puedes hacer uso del método “length():int” de la clase “String”) devuelve el carácter en la posición correspondiente (puedes hacer uso del método “charAt(int)” de la clase “String”).
            ○ En caso contrario, construye y lanza una excepción de tipo Exception.
         */

    public class UtilidadesCadena {

        public static char caracterEn(String cadena, int posicion) throws Exception {
            if (posicion >= 0 && posicion < cadena.length()) {
                return cadena.charAt(posicion);
            } else {
                throw new Exception("La posición está fuera del rango válido.");
            }
        }
        
    // Método main para probar
    public static void main(String[] args) {
        try {
            String texto = "Hola mundo";
            int posicion = 4;
            char resultado = caracterEn(texto, posicion);
            System.out.println("Carácter en la posición " + posicion + ": " + resultado);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    }
        

}

