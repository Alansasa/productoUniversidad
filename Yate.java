public class Yate extends Barco{
    private double cv;
    private int numeroCamarotes;

    public Yate(String matricula, double largo, int añoFabricacion, double cv, int numeroCamarotes){
        super(matricula, largo, añoFabricacion);
        this.cv = cv;
        this.numeroCamarotes = numeroCamarotes;
    }

    public double getCv() {
        return cv;
    }

    public void setCv(double cv) {
        this.cv = cv;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

}
