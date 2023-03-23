import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
        String apellido = JOptionPane.showInputDialog("Ingresa tu apellido: ");
        
        Cliente Alan = new Cliente(nombre, apellido);
        String fI = JOptionPane.showInputDialog("Ingresa la fecha inicial aaaa-mm-dd");
        String fF = JOptionPane.showInputDialog("Ingresa la fecha final aaaa-mm-dd");

        int seleccion_Barco = JOptionPane.showOptionDialog(null, "Seleccion un tipo de barco", 
        "Tipo de Barco", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, 
        Alquiler.opciones_Barco, Alquiler.opciones_Barco[1]); 
        
        double largoBarco = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el largo del barco."));
        int añoBarco = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año de fabricacion del barco."));

        
        switch(seleccion_Barco){
            case 0:
                int nCam = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de camarotes del Yate."));
                double caballosY = Double.parseDouble(JOptionPane.showInputDialog("Ingresa los caballos de vapor del barco."));   
                Alan.alquilar(new Alquiler(fI, fF, "Mediterraneo", "2231122161",
                largoBarco, añoBarco, caballosY, nCam));
                break;
            case 1:
                double caballosE = Double.parseDouble(JOptionPane.showInputDialog("Ingresa los caballos de vapor del barco."));
                Alan.alquilar(new Alquiler(fI,fF, "Mediterraneo", "2231122161",
                largoBarco, añoBarco, caballosE));
                break;
            case 2:
                int nMas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de mástiles del velero."));
                Alan.alquilar(new Alquiler(fI, fF, "Mediterraneo", "2231122161",
                largoBarco, añoBarco, nMas));
                break;
            default:
                JOptionPane.showMessageDialog(null, "TU OPCION NO ES VÁLIDA!!!");
        }

        Alan.mostrarDatos(seleccion_Barco);
    }
}
