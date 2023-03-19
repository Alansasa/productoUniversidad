import java.time.LocalDate;

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
        
        switch(tipoDeBarco){
            case "Yate":
                double cvY = yate.getCv();
                int numeroCamarotes = yate.getNumeroCamarotes();
                this.costoAlquiler = (fechaFinal.getDayOfYear() - fechaInicial.getDayOfYear()) * yate.moduloDeFuncion(cvY, numeroCamarotes) * yate.precioFijoAlquiler;
                break;
            case "Embarcacion Deportiva":
                double cvD = deportivo.getCv();
                this.costoAlquiler = (fechaFinal.getDayOfYear() - fechaInicial.getDayOfYear()) * deportivo.moduloDeFuncion(cvD) * deportivo.precioFijoAlquiler;
                break;
            case "Velero":
                double nMasV = velero.getNumeroMastiles();
                this.costoAlquiler= (fechaFinal.getDayOfYear() - fechaInicial.getDayOfYear()) * velero.moduloDeFuncion(nMasV) * velero.precioFijoAlquiler;
                break;
        }
        
        return costoAlquiler;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }
    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }
    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
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

    public void setYate(Yate yate) {
        this.yate = yate;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Velero getVelero() {
        return velero;
    }

    public void setVelero(Velero velero) {
        this.velero = velero;
    }

    
}
