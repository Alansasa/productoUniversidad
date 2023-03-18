import java.time.LocalDate;
import java.util.ArrayList;


public class Alquiler {
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private String posicionAmarre;
    private Yate yate;
    private Deportivo deportivo;
    private Velero velero;
    ArrayList<Barco> barcos = new ArrayList<>();
    

    public Alquiler(int yearInicial, int mesIni, int diaIni, int yearFin, int mesFin, int diaFin, String posicionAmarre){
        fechaFinal = LocalDate.of(yearFin, mesFin, diaFin);
        fechaInicial = LocalDate.of(yearInicial, mesIni, diaIni);
        this.posicionAmarre = posicionAmarre;
    }

    public void calculoAlquiler(String tipoDeBarco){
        barcos.add(yate);
        barcos.add(deportivo);
        barcos.add(velero);

        switch(tipoDeBarco){
            case "Yate":
                Yate bElegidoY = (Yate) barcos.get(0);
                double cvY = bElegidoY.getCv();
                int numeroCamarotes = bElegidoY.getNumeroCamarotes();
                double costoAlquilerY = (fechaFinal.getDayOfYear() - fechaInicial.getDayOfYear()) * bElegidoY.moduloDeFuncion(cvY, numeroCamarotes) * bElegidoY.precioFijoAlquiler;
                System.out.println("El costo de alquiler del Yate es de: $" + costoAlquilerY);
                break;
            case "Deportivo":
                Deportivo bElegidoD = (Deportivo) barcos.get(1);
                double cvD = bElegidoD.getCv();
                double costoAlquilerD = (fechaFinal.getDayOfYear() - fechaInicial.getDayOfYear()) * bElegidoD.moduloDeFuncion(cvD) * bElegidoD.precioFijoAlquiler;
                System.out.println("El costo de alquiler de la embarcacion deportivas es : $" + costoAlquilerD);
                break;
            case "Velero":

        }
        
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
