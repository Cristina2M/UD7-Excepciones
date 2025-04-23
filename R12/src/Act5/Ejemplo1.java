package Act5;
import java.util.Scanner;
public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        try{
            System.out.print("Introduce un número positivo: ");
            int numero = entrada.nextInt();

            if (numero<0) {
                throw new NumeroNegativoExcepcion("El número no puede ser negativo.");
        
            }
            System.out.println("Has introducido el número: "+ numero);
        } catch(NumeroNegativoExcepcion e){
            System.out.println("Error: "+e.getMessage());
        } catch (Exception e){
            System.out.println("Error inesperado: "+e.getMessage());
        } finally {
            entrada.close();
        }




    }

}
