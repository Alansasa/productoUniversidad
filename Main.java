import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String[] opciones = {"True", "False"};
        Cliente Alan = new Cliente();
        Alan.alquilar();
        Alan.mostrarDatos();

        while (true){
            int eleccion = JOptionPane.showOptionDialog(null, "¿Los datos son correctos?", 
            "Verificacion de datos", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, 
            opciones, opciones[0]);

            if (eleccion == 0){
                JOptionPane.showMessageDialog(null, "Amarre alquilado correctamente");
                break;
            }else if(eleccion == 1){
                JOptionPane.showMessageDialog(null, "Volvamos a llenar el formulario!!!\n");
                Alan.alquilar();
                Alan.mostrarDatos();
            }    
        }
    }
}
