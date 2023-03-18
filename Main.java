import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        System.out.println(nombre);
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad!!"));
        System.out.println(dia + 28);
    }
}
