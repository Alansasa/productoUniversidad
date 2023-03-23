import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private String posicionAmarre;
    private Yate yate;
    private Deportivo deportivo;
    private Velero velero;
    private double costoAlquiler;
    static String[] opciones_Barco = {"Yate", "Deportivo", "Velero"};

    //constructor de Yate   
    public Alquiler(String fechaInicial, String fechaFinal, String posicionAmarre,
    String matricula, double largo, int añoFabricacion, double cv, int numeroCamarote){
        this.fechaFinal = LocalDate.parse(fechaFinal);
        this.fechaInicial = LocalDate.parse(fechaInicial);
        this.posicionAmarre = posicionAmarre;
        yate = new Yate(matricula, largo, añoFabricacion, cv, numeroCamarote);
    }

    //constructor de Deportivo
    public Alquiler(String fechaInicial, String fechaFinal, String posicionAmarre,
    String matricula, double largo, int añoFabricacion, double cv){
        this.fechaFinal = LocalDate.parse(fechaFinal);
        this.fechaInicial = LocalDate.parse(fechaInicial);
        this.posicionAmarre = posicionAmarre;
        deportivo = new Deportivo(matricula, largo, añoFabricacion, cv);
    }

    //Constructor de Velero
    public Alquiler(String fechaInicial, String fechaFinal, String posicionAmarre,
    String matricula, double largo, int añoFabricacion, int numeroMastiles){
        this.fechaFinal = LocalDate.parse(fechaFinal);
        this.fechaInicial = LocalDate.parse(fechaInicial);
        this.posicionAmarre = posicionAmarre;
        velero = new Velero(matricula, largo, añoFabricacion, numeroMastiles);
    }

    public double calculoAlquiler(int tipoDeBarco){
        switch(tipoDeBarco){
            case 0:
                double cvY = yate.getCv();
                int numeroCamarotes = yate.getNumeroCamarotes();
                this.costoAlquiler = diasDeAlquiler() * yate.moduloDeFuncion(cvY, numeroCamarotes) * yate.precioFijoAlquiler;
                break;
            case 1:
                double cvD = deportivo.getCv();
                this.costoAlquiler = diasDeAlquiler() * deportivo.moduloDeFuncion(cvD) * deportivo.precioFijoAlquiler;
                break;
            case 2:
                double nMasV = velero.getNumeroMastiles();
                this.costoAlquiler= diasDeAlquiler() * velero.moduloDeFuncion(nMasV) * velero.precioFijoAlquiler;
                break;
        }
        
        return costoAlquiler;
    }
    

    public long diasDeAlquiler(){
        long diasDiferencia = ChronoUnit.DAYS.between(fechaInicial, fechaFinal);
        return diasDiferencia;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }
    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Yate getYate() {
        return yate;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public Velero getVelero() {
        return velero;
    }

    public void setFechaInicial(String fechaInicial) {
        this.fechaInicial = LocalDate.parse(fechaInicial);
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = LocalDate.parse(fechaFinal);
    }

    
}
