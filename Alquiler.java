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

    //constructor de Yate   
    public Alquiler(int yearInicial, int mesIni, int diaIni, int yearFin, int mesFin, int diaFin, String posicionAmarre,
    String matricula, double largo, int añoFabricacion, double cv, int numeroCamarote){
        fechaFinal = LocalDate.of(yearFin, mesFin, diaFin);
        fechaInicial = LocalDate.of(yearInicial, mesIni, diaIni);
        this.posicionAmarre = posicionAmarre;
        yate = new Yate(matricula, largo, añoFabricacion, cv, numeroCamarote);
    }

    //constructor de Deportivo
    public Alquiler(int yearInicial, int mesIni, int diaIni, int yearFin, int mesFin, int diaFin, String posicionAmarre,
    String matricula, double largo, int añoFabricacion, double cv){
        fechaFinal = LocalDate.of(yearFin, mesFin, diaFin);
        fechaInicial = LocalDate.of(yearInicial, mesIni, diaIni);
        this.posicionAmarre = posicionAmarre;
        deportivo = new Deportivo(matricula, largo, añoFabricacion, cv);
    }

    //Constructor de Velero
    public Alquiler(int yearInicial, int mesIni, int diaIni, int yearFin, int mesFin, int diaFin, String posicionAmarre,
    String matricula, double largo, int añoFabricacion, int numeroMastiles){
        fechaFinal = LocalDate.of(yearFin, mesFin, diaFin);
        fechaInicial = LocalDate.of(yearInicial, mesIni, diaIni);
        this.posicionAmarre = posicionAmarre;
        velero = new Velero(matricula, largo, añoFabricacion, numeroMastiles);
    }

    public double calculoAlquiler(String tipoDeBarco){
        switch(tipoDeBarco.toLowerCase()){
            case "yate":
                double cvY = yate.getCv();
                int numeroCamarotes = yate.getNumeroCamarotes();
                this.costoAlquiler = diasDeAlquiler() * yate.moduloDeFuncion(cvY, numeroCamarotes) * yate.precioFijoAlquiler;
                break;
            case "embarcacion deportiva":
                double cvD = deportivo.getCv();
                this.costoAlquiler = diasDeAlquiler() * deportivo.moduloDeFuncion(cvD) * deportivo.precioFijoAlquiler;
                break;
            case "velero":
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
}
