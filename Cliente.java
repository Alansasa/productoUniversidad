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
    
    public void mostrarDatos(int eleccion){
        JOptionPane.showMessageDialog(null, "Nombre: "  + getNombre().toUpperCase() + "\nApellido: " + getApellido().toUpperCase() 
        + "\nCedula de identificación: " + getCedulaDeIdentificacion(), "DATOS DEL CLIENTE", 1);

        JOptionPane.showMessageDialog(null, "Fecha inicial: " + alquiler.getFechaInicial() + "\nFecha final: " 
        + alquiler.getFechaFinal() + "\nPosicion de amarre: " + alquiler.getPosicionAmarre(), "DATOS DEL ALQUILER", 1);

        switch(eleccion){
            case 0:

                JOptionPane.showMessageDialog(null, "Tipo: " 
                + Alquiler.opciones_Barco[eleccion] + "\nMatricula: " + alquiler.getYate().matricula + "\nLargo: " +
                alquiler.getYate().largo + "\nAño de Fabricación: " + alquiler.getYate().añoFabricacion +
                "\nCaballos de Vapor: " + alquiler.getYate().getCv() + "\nNumero de camarotes: " 
                + alquiler.getYate().getNumeroCamarotes(), "DATOS DEL YATE", 1);

                JOptionPane.showMessageDialog(null, "EL COSTO TOTAL DEL ALQUILER PARA EL YATE ES: \n$" + alquiler.calculoAlquiler(eleccion), "COSTO TOTAL", 1);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Tipo: " + Alquiler.opciones_Barco[eleccion] 
                + "\nMatricula: " + alquiler.getDeportivo().matricula + "\nLargo: " + alquiler.getDeportivo().largo 
                + "\nAño de Fabricación: " + alquiler.getDeportivo().añoFabricacion  + "\nCaballos de Vapor: " + 
                alquiler.getDeportivo().getCv(), "DATOS DE LA EMBARCACION DEPORTIVA", 1);

                JOptionPane.showMessageDialog(null, "COSTO TOTAL DEL ALQUILER PARA LA EMBARCACION DEPORTIVA ES: \n$" + alquiler.calculoAlquiler(eleccion), 
                "COSTO TOTAL", 1);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Tipo: " + Alquiler.opciones_Barco[eleccion] 
                + "\nMatricula: " + alquiler.getVelero().matricula + "\nLargo: " + alquiler.getVelero().largo + 
                "\nAño de Fabricación: " + alquiler.getVelero().añoFabricacion + "\nNumero de mastiles: " + 
                alquiler.getVelero().getNumeroMastiles(), "DATOS DEL VELERO", 1);

                JOptionPane.showMessageDialog(null, "COSTO TOTAL DEL ALQUILER PARA EL VELERO ES: \n$" + alquiler.calculoAlquiler(eleccion), 
                "COSTO TOTAL", 1);
                break;
        }
    }
}
