
public class Act6 {
    public static double accesoPorIndice(double[] v, int j) throws RuntimeException{
        try{
        if ((0 <= j) && (j <= v.length - 1)){
            return v[j];
        }
        else {
            throw new RuntimeException("El índice " + j + " no existe en el array.");
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
El error que aparece es RuntimeException y cuando lo captura, lo vuelve a lanzar hacia el main,
pero ahí no hay ningún manejador, por lo que detiene el programa.
Una correción, seria que en el catch no lo vuelva a lanzar,poner algun mensaje de error al
introducir el indice o algo así.
La otra sería mantener la propagación del error al main y manejarlo desde allí
 */