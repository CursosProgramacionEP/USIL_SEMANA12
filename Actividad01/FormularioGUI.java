import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormularioGUI extends JFrame {

    // Campos del formulario: se declaran como atributos para que el
    // ActionListener del boton pueda leerlos desde cualquier metodo.
    private JTextField txtNombre;
    private JTextField txtDni;
    private JTextField txtTelefono;
    private JComboBox<String> cboSexo;
    private JButton btnEnviar;

    public FormularioGUI() {
        // TODO 1: configura el marco.
        //         setTitle("Formulario de datos personales")
        //         setSize(350, 220)
        //         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        //         setLayout(new GridLayout(5, 2, 5, 5))

        // TODO 2: crea las cuatro etiquetas y sus componentes de entrada,
        //         y agregalos al marco en este orden:
        //           JLabel "Nombre:"   + txtNombre   = new JTextField()
        //           JLabel "DNI:"      + txtDni      = new JTextField()
        //           JLabel "Telefono:" + txtTelefono = new JTextField()
        //           JLabel "Sexo:"     + cboSexo     = new JComboBox<>(...)
        //         El JComboBox lleva las opciones "Masculino" y "Femenino".
        //         Con GridLayout, el orden en que agregas es el orden en
        //         que se dibujan: etiqueta, componente, etiqueta, componente...

        // TODO 3: crea el boton btnEnviar con el texto "Enviar" y agregalo.

        // TODO 4: registra el ActionListener del boton.
        //         Dentro de actionPerformed:
        //           - lee los tres campos con getText()
        //           - lee el combo con getSelectedItem().toString()
        //           - imprime los cuatro datos en la consola con System.out.println
    }

    public static void main(String[] args) {
        // TODO 5: crea el formulario y hazlo visible.
        //         Recuerda: el marco nace invisible, setVisible(true) es lo
        //         ultimo que se llama.
    }
}
