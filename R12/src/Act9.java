public class Act9 {
    public static double accesoPorIndice(double[] v, int j) throws Exception{
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
