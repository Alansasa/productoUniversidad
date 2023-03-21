import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
        String apellido = JOptionPane.showInputDialog("Ingresa tu apellido: ");
        
        Cliente Alan = new Cliente(nombre, apellido);
        String fI = JOptionPane.showInputDialog("Ingresa la fecha inicial aaaa-mm-dd");
        String fF = JOptionPane.showInputDialog("Ingresa la fecha final aaaa-mm-dd");
        String eleccion = JOptionPane.showInputDialog("Que te gustaria alquilar?: \n*Yate.\n*Embarcacion Deportiva\n*Velero");

        switch(eleccion.toLowerCase()){
            case "yate":
                Alan.alquilar(new Alquiler(fI, fF, "Mediterraneo", "2231122161",
                100, 2012, 100.5, 4));
                break;
            case "embarcacion deportiva":
                Alan.alquilar(new Alquiler(fI,fF, "Mediterraneo", "2231122161",
                100, 2012, 100.5));
                break;
            case "velero":
                Alan.alquilar(new Alquiler(fI, fF, "Mediterraneo", "2231122161",
                100, 2012, 2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "TU OPCION NO ES VÁLIDA!!!");
        }

        Alan.mostrarDatos(eleccion);
    }
}
