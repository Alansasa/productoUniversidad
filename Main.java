import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
        String apellido = JOptionPane.showInputDialog("Ingresa tu apellido: ");
        
        Cliente Alan = new Cliente(nombre, apellido);
        String eleccion = JOptionPane.showInputDialog("Que te gustaria alquilar?: \n*Yate.\n*Embarcacion Deportiva\n*Velero");
        switch(eleccion){
            case "Yate":
                Alan.alquilar(new Alquiler(2023, 3, 18, 2023, 4, 6, "Mediterraneo", "2231122161",
                100, 2012, 100.5, 4));
                break;
            case "Embarcacion Deportiva":
                Alan.alquilar(new Alquiler(2023, 3, 18, 2023, 4, 6, "Mediterraneo", "2231122161",
                100, 2012, 100.5));
                break;
            case "Velero":
                Alan.alquilar(new Alquiler(2023, 3, 18, 2023, 4, 6, "Mediterraneo", "2231122161",
                100, 2012, 2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "TU OPCION NO ES VÁLIDA!!!");
        }

        Alan.mostrarDatos(eleccion);
    }
}
