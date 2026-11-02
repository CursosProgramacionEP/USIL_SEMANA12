// ============================================================================
//  CatalogoControles - los controles de Swing, todos en una ventana
//  Objetivo: ver como se CREA y como se VE cada control. Todavia sin eventos.
// ============================================================================

import javax.swing.*;
import java.awt.*;

public class CatalogoControles extends JFrame {

    public CatalogoControles() {
        // ---- Configuración del marco -----------------------------------
        setTitle("Catalogo de controles Swing");         // barra de titulo
        setSize(460, 360);                               // ancho x alto
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // la X termina el programa
        setLayout(new BorderLayout(10, 10));             // regiones, con 10 px de
                                                         // separacion horizontal
                                                         // y vertical

        // Un panel con rejilla: 6 filas x 2 columnas, 8 px de separacion.
        // Con GridLayout todas las celdas miden EXACTAMENTE igual, y se llenan
        // en el orden en que haces add(): izquierda a derecha, fila por fila.
        JPanel panel = new JPanel(new GridLayout(6, 2, 8, 8));

        // JLabel: texto fijo. Es inerte: no recibe eventos.
        panel.add(new JLabel("JLabel:"));
        panel.add(new JLabel("texto fijo, no recibe eventos"));

        // JTextField: una sola linea, editable por el usuario.
        // El numero del constructor es el ancho en columnas.
        panel.add(new JLabel("JTextField:"));
        panel.add(new JTextField("una linea editable"));

        // JPasswordField: deriva de JTextField y enmascara lo que se escribe.
        // Para leerlo: new String(campo.getPassword()), porque getPassword()
        // devuelve char[] y no String.
        panel.add(new JLabel("JPasswordField:"));
        panel.add(new JPasswordField("secreto"));

        // JComboBox: lista desplegable. Recibe el arreglo de opciones.
        panel.add(new JLabel("JComboBox:"));
        panel.add(new JComboBox<>(new String[]{"Opcion 1", "Opcion 2", "Opcion 3"}));

        // JButton: el unico de la lista pensado para disparar acciones.
        panel.add(new JLabel("JButton:"));
        panel.add(new JButton("Pulsar"));

        // JCheckBox y JRadioButton: seleccion, no accion.
        // El segundo parametro dice si nacen marcados.
        panel.add(new JLabel("Seleccion:"));
        JPanel seleccion = new JPanel(new FlowLayout(FlowLayout.LEFT));  // pegados
        seleccion.add(new JCheckBox("JCheckBox", true));                 // a la izq.
        seleccion.add(new JRadioButton("JRadioButton", false));
        panel.add(seleccion);     // un panel dentro de otro panel: se puede

        add(panel, BorderLayout.NORTH);   // el panel completo va arriba

        // JTextArea: muchas lineas. (filas, columnas)
        JTextArea area = new JTextArea(6, 30);
        area.setText("JTextArea\n\n"
                + "Muestra muchas lineas de texto.\n"
                + "Escribe aqui hasta pasarte del alto visible\n"
                + "y mira aparecer la barra de desplazamiento.\n");

        // OJO: un JTextArea NO trae barra de desplazamiento. Hay que envolverlo.
        // Lo que se agrega al contenedor ya no es el area, es el JScrollPane.
        add(new JScrollPane(area), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        CatalogoControles ventana = new CatalogoControles();
        ventana.setLocationRelativeTo(null);  // centra la ventana en la pantalla.
                                              // Va DESPUES de setSize: para
                                              // centrarla hay que saber cuanto mide.
        ventana.setVisible(true);
    }
}
