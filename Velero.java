public class Velero extends Barco{
    private int numeroMastiles;
    public Velero(String matricula, double largo, int añoFabricacion, int numeroMastiles) {
        super(matricula, largo, añoFabricacion);
        this.numeroMastiles = numeroMastiles;
    }
    public int getNumeroMastiles() {
        return numeroMastiles;
    }
    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }
}
