import javax.swing.JOptionPane;

public class Cliente { 
    public static int ID = 1;
    private String nombre;
    private String apellido;
    private int cedulaDeIdentificacion;
    private Alquiler alquiler;

    public Cliente(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedulaDeIdentificacion = ID;
        ID++;
    }

    public void alquilar(Alquiler alquiler){
        this.alquiler = alquiler;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedulaDeIdentificacion() {
        return cedulaDeIdentificacion;
    }
    public void setCedulaDeIdentificacion(int cedulaDeIdentificacion) {
        this.cedulaDeIdentificacion = cedulaDeIdentificacion;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }
    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }
    
    public void mostrarDatos(String eleccion){
        JOptionPane.showMessageDialog(null, "Datos del Cliente: \nNombre: "  + getNombre().toUpperCase() + "\nApellido: " + getApellido().toUpperCase() 
        + "\nCedula de identificación: " + getCedulaDeIdentificacion());
        JOptionPane.showMessageDialog(null, "Datos del Alquiler: \nFecha inicial: " + alquiler.getFechaInicial() + "\nFecha final: " 
        + alquiler.getFechaFinal() + "\nPosicion de amarre: " + alquiler.getPosicionAmarre());

        switch(eleccion.toLowerCase()){
            case "yate":
                JOptionPane.showMessageDialog(null, "Datos del barco: \nTipo: " + eleccion.toUpperCase() + "\nMatricula: " + alquiler.getYate().matricula 
                + "\nLargo: " + alquiler.getYate().largo + "\nAño de Fabricación: " + alquiler.getYate().añoFabricacion + "\nCaballos de Vapor: " + 
                alquiler.getYate().getCv() + "\nNumero de camarotes: " + alquiler.getYate().getNumeroCamarotes());
                JOptionPane.showMessageDialog(null, "COSTO TOTAL DEL ALQUILER DEL YATE ES: \n$" + alquiler.calculoAlquiler(eleccion));
                break;
            case "embarcacion deportiva":
                JOptionPane.showMessageDialog(null, "Datos del barco: \nTipo: " + eleccion.toUpperCase() + "\nMatricula: " 
                + alquiler.getDeportivo().matricula + "\nLargo: " + alquiler.getDeportivo().largo + "\nAño de Fabricación: " + alquiler.getDeportivo().añoFabricacion 
                + "\nCaballos de Vapor: " + alquiler.getDeportivo().getCv());
                JOptionPane.showMessageDialog(null, "COSTO TOTAL DEL ALQUILER DE LA EMBARCACION DEPORTIVA ES: \n$" + alquiler.calculoAlquiler(eleccion));
                break;
            case "velero":
                JOptionPane.showMessageDialog(null, "Datos del barco: \nTipo: " + eleccion.toUpperCase() + "\nMatricula: " 
                + alquiler.getVelero().matricula + "\nLargo: " + alquiler.getVelero().largo + "\nAño de Fabricación: " + alquiler.getVelero().añoFabricacion + 
                "\nNumero de mastiles: " + alquiler.getVelero().getNumeroMastiles());
                JOptionPane.showMessageDialog(null, "COSTO TOTAL DEL ALQUILER DEL VELERO ES: \n$" + alquiler.calculoAlquiler(eleccion));
                break;
        }
    }
}
