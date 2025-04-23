public class Act7 {
    public static double accesoPorIndice(double[] v, int j) throws RuntimeException{
        try{
        if ((0 <= j) && (j <= v.length - 1)){
            return v[j];
        }
        else {
            throw new Exception("El índice " + j + " no existe en el array.");
        }
        }
        catch (RuntimeException exc){
            throw exc;
        }
    }
    public static void main(String [] args){
        double[] v = new double[15];
        System.out.println(accesoPorIndice(v, 16));
    }
}


/*
Modificar el lanzamiento de Exception y poner RunTimeException.
El segundo error es el mismo que el que había en la actividad 6.
 */