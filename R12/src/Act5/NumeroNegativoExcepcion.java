package Act5;
public class NumeroNegativoExcepcion extends Exception{
        // Constructor sin parámetros
    public NumeroNegativoExcepcion() {
        super(); // Llama al constructor sin parámetros de Exception
    }
    
        // Constructor que recibe un mensaje
    public NumeroNegativoExcepcion(String mensaje) {
        super(mensaje); // Llama al constructor de Exception que recibe un String
    }
    
    
}
