public class Deportivo extends Barco{

    private double cv;

    public Deportivo(String matricula, double largo, int añoFabricacion, double cv) {
        super(matricula, largo, añoFabricacion);
        this.cv = cv;
    }

    public double getCv() {
        return cv;
    }

    public void setCv(double cv) {
        this.cv = cv;
    }
}
