public abstract class Barco{
    protected String matricula;
    protected double largo;
    protected int añoFabricacion;
    protected double precioFijoAlquiler;

    public Barco(String matricula, double largo, int añoFabricacion){
        this.matricula = matricula;
        this.largo = largo;
        this.añoFabricacion = añoFabricacion;
        precioFijoAlquiler = 1.8;
    }

    //modulo de funcion de yate
    public double moduloDeFuncion(double cv, int numeroCamarotes){
        double modulo = 0.2 * largo * cv * numeroCamarotes;
        return modulo;
    }

    //Modulo de funcion para Embarcaciones deportivas
    public double moduloDeFuncion(double cv){
        double modulo = 0.2 * largo * cv;
        return modulo;
    }

    //Modulo de funcion para Veleros
    public double moduloDeFuncion(int numeroMastiles){
        double modulo = 0.2 * largo * numeroMastiles;
        return modulo;
    }
}