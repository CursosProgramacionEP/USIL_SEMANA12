import javax.swing.*;
import java.awt.*;

// Los seis controles que lista el material de clase, en una sola ventana.
// Todavia sin eventos: aqui solo interesa COMO SE VE y QUE HACE cada uno.
public class CatalogoControles extends JFrame {

    public CatalogoControles() {
        setTitle("Catalogo de controles Swing");
        setSize(460, 360);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JPanel panel = new JPanel(new GridLayout(6, 2, 8, 8));

        // JLabel: texto fijo. Es inerte: no recibe eventos.
        panel.add(new JLabel("JLabel:"));
        panel.add(new JLabel("texto fijo, no recibe eventos"));

        // JTextField: una sola linea, editable por el usuario.
        panel.add(new JLabel("JTextField:"));
        panel.add(new JTextField("una linea editable"));

        // JPasswordField: deriva de JTextField y enmascara lo que se escribe.
        panel.add(new JLabel("JPasswordField:"));
        panel.add(new JPasswordField("secreto"));

        // JComboBox: lista desplegable de opciones.
        panel.add(new JLabel("JComboBox:"));
        panel.add(new JComboBox<>(new String[]{"Opcion 1", "Opcion 2", "Opcion 3"}));

        // JButton: el control que dispara acciones.
        panel.add(new JLabel("JButton:"));
        panel.add(new JButton("Pulsar"));

        // JCheckBox y JRadioButton: seleccion, no accion.
        panel.add(new JLabel("Seleccion:"));
        JPanel seleccion = new JPanel(new FlowLayout(FlowLayout.LEFT));
        seleccion.add(new JCheckBox("JCheckBox", true));
        seleccion.add(new JRadioButton("JRadioButton", false));
        panel.add(seleccion);

        add(panel, BorderLayout.NORTH);

        // JTextArea: muchas lineas. Por si solo NO trae barra de desplazamiento:
        // hay que envolverlo en un JScrollPane.
        JTextArea area = new JTextArea(6, 30);
        area.setText("JTextArea\n\n"
                + "Muestra muchas lineas de texto.\n"
                + "Escribe aqui hasta pasarte del alto visible\n"
                + "y mira aparecer la barra de desplazamiento.\n");
        add(new JScrollPane(area), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        CatalogoControles ventana = new CatalogoControles();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
