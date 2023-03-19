import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
        String apellido = JOptionPane.showInputDialog("Ingresa tu apellido: ");
        
        Cliente Alan = new Cliente(nombre, apellido);
        int yI = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año inicial: "));
        int mI = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes inicial: "));
        int dI = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia inicial: "));
        int yF = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año final: "));
        int mF = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes final: "));
        int dF = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia final: "));
        String eleccion = JOptionPane.showInputDialog("Que te gustaria alquilar?: \n*Yate.\n*Embarcacion Deportiva\n*Velero");

        switch(eleccion.toLowerCase()){
            case "yate":
                Alan.alquilar(new Alquiler(yI, mI, dI, yF, mF, dF, "Mediterraneo", "2231122161",
                100, 2012, 100.5, 4));
                break;
            case "embarcacion deportiva":
                Alan.alquilar(new Alquiler(2023, 3, 18, 2023, 4, 6, "Mediterraneo", "2231122161",
                100, 2012, 100.5));
                break;
            case "velero":
                Alan.alquilar(new Alquiler(2023, 3, 18, 2023, 4, 6, "Mediterraneo", "2231122161",
                100, 2012, 2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "TU OPCION NO ES VÁLIDA!!!");
        }

        Alan.mostrarDatos(eleccion);
    }
}
