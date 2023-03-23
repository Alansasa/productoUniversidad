import javax.swing.JOptionPane;

public class Cliente { 
    public static int ID = 1;
    private String nombre;
    private String apellido;
    private int cedulaDeIdentificacion;
    private Alquiler alquiler;
    int seleccion_Barco;

    public Cliente(){

    }

    public Cliente(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedulaDeIdentificacion = ID;
        ID++;
    }

    public void alquilar(){
        alquiler = new Alquiler();
        introducirDatos();
    }

    public void introducirDatos(){
        setNombre(JOptionPane.showInputDialog("Introduce tu nombre: "));
        setApellido(JOptionPane.showInputDialog("Ingresa tu apellido: "));
        alquiler.introducirDatosAlquiler();
        String matricula = JOptionPane.showInputDialog("Ingresa la matricula del barco");

        this.seleccion_Barco = JOptionPane.showOptionDialog(null, "Seleccion un tipo de barco", 
        "Tipo de Barco", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, 
        Alquiler.opciones_Barco, Alquiler.opciones_Barco[1]); 
        
        int añoBarco = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año de fabricacion del barco."));

        double largoBarco = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el largo del barco."));

        switch(seleccion_Barco){
            case 0:
                int nCam = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de camarotes del Yate."));
                double caballosY = Double.parseDouble(JOptionPane.showInputDialog("Ingresa los caballos de vapor del barco."));   
                alquiler = new Alquiler(alquiler.getFechaInicial(), alquiler.getFechaFinal(), alquiler.getPosicionAmarre().toUpperCase(), matricula,
                largoBarco, añoBarco, caballosY, nCam);
                break;
            case 1:
                double caballosE = Double.parseDouble(JOptionPane.showInputDialog("Ingresa los caballos de vapor del barco."));
                alquiler = new Alquiler(alquiler.getFechaInicial(), alquiler.getFechaFinal(),  alquiler.getPosicionAmarre().toUpperCase(), matricula,
                largoBarco, añoBarco, caballosE);
                break;
            case 2:
                int nMas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de mástiles del velero."));
                alquiler = new Alquiler(alquiler.getFechaInicial(), alquiler.getFechaFinal(),  alquiler.getPosicionAmarre().toUpperCase(), matricula,
                largoBarco, añoBarco, nMas);
                break;
            default:
                JOptionPane.showMessageDialog(null, "TU OPCION NO ES VÁLIDA!!!");
        }
    }
    
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "Nombre: "  + getNombre().toUpperCase() + "\nApellido: " + getApellido().toUpperCase() 
        + "\nCedula de identificación: " + getCedulaDeIdentificacion(), "DATOS DEL CLIENTE", 1);

        JOptionPane.showMessageDialog(null, "Fecha inicial: " + alquiler.getFechaInicial() + "\nFecha final: " 
        + alquiler.getFechaFinal() + "\nPosicion de amarre: " + alquiler.getPosicionAmarre(), "DATOS DEL ALQUILER", 1);

        switch(seleccion_Barco){
            case 0:

                JOptionPane.showMessageDialog(null, "Tipo: " 
                + Alquiler.opciones_Barco[seleccion_Barco] + "\nMatricula: " + alquiler.getYate().matricula + "\nLargo: " +
                alquiler.getYate().largo + "\nAño de Fabricación: " + alquiler.getYate().añoFabricacion +
                "\nCaballos de Vapor: " + alquiler.getYate().getCv() + "\nNumero de camarotes: " 
                + alquiler.getYate().getNumeroCamarotes(), "DATOS DEL YATE", 1);

                JOptionPane.showMessageDialog(null, "EL COSTO TOTAL DEL ALQUILER PARA EL YATE ES: \n$" + alquiler.calculoAlquiler(seleccion_Barco), "COSTO TOTAL", 1);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Tipo: " + Alquiler.opciones_Barco[seleccion_Barco] 
                + "\nMatricula: " + alquiler.getDeportivo().matricula + "\nLargo: " + alquiler.getDeportivo().largo 
                + "\nAño de Fabricación: " + alquiler.getDeportivo().añoFabricacion  + "\nCaballos de Vapor: " + 
                alquiler.getDeportivo().getCv(), "DATOS DE LA EMBARCACION DEPORTIVA", 1);

                JOptionPane.showMessageDialog(null, "COSTO TOTAL DEL ALQUILER PARA LA EMBARCACION DEPORTIVA ES: \n$" + alquiler.calculoAlquiler(seleccion_Barco), 
                "COSTO TOTAL", 1);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Tipo: " + Alquiler.opciones_Barco[seleccion_Barco] 
                + "\nMatricula: " + alquiler.getVelero().matricula + "\nLargo: " + alquiler.getVelero().largo + 
                "\nAño de Fabricación: " + alquiler.getVelero().añoFabricacion + "\nNumero de mastiles: " + 
                alquiler.getVelero().getNumeroMastiles(), "DATOS DEL VELERO", 1);

                JOptionPane.showMessageDialog(null, "COSTO TOTAL DEL ALQUILER PARA EL VELERO ES: \n$" + alquiler.calculoAlquiler(seleccion_Barco), 
                "COSTO TOTAL", 1);
                break;
        }
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
}
