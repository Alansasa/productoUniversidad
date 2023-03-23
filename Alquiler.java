import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;

public class Alquiler {
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private String posicionAmarre;
    private Yate yate;
    private Deportivo deportivo;
    private Velero velero;
    private double costoAlquiler;
    static String[] opciones_Barco = {"Yate", "Deportivo", "Velero"};

    public Alquiler(){

    }

    //constructor de Yate   
    public Alquiler(LocalDate fechaInicial, LocalDate fechaFinal, String posicionAmarre,
    String matricula, double largo, int añoFabricacion, double cv, int numeroCamarote){
        this.fechaFinal = fechaFinal;
        this.fechaInicial = fechaInicial;
        this.posicionAmarre = posicionAmarre;
        yate = new Yate(matricula, largo, añoFabricacion, cv, numeroCamarote);
    }

    //constructor de Deportivo
    public Alquiler(LocalDate fechaInicial, LocalDate fechaFinal, String posicionAmarre, String matricula, double largo, int añoFabricacion, double cv){
        this.posicionAmarre = posicionAmarre;
        deportivo = new Deportivo(matricula, largo, añoFabricacion, cv);
    }

    //Constructor de Velero
    public Alquiler(LocalDate fechaInicial, LocalDate fechaFinal, String posicionAmarre,
    String matricula, double largo, int añoFabricacion, int numeroMastiles){
        this.fechaFinal = fechaFinal;
        this.fechaInicial = fechaInicial;
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
    
    public void introducirDatosAlquiler(){
        String fI = JOptionPane.showInputDialog(null, "Ingresa la fecha inicial aaaa-mm-dd", "FECHA INICIAL", 1);
        setFechaInicial(fI);
    
        String fF = JOptionPane.showInputDialog(null, "Ingresa la fecha final aaaa-mm-dd", "FECHA FINAL", 1);
        setFechaFinal(fF);
        String posicionAmarre = JOptionPane.showInputDialog("Ingresa la posicion de amarre");
        setPosicionAmarre(posicionAmarre);
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

    public void setFechaInicial(String fechaInicial) {
        this.fechaInicial = LocalDate.parse(fechaInicial);
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = LocalDate.parse(fechaFinal);
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
