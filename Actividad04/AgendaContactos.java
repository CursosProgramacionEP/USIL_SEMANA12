import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;

// Caso: una agenda. El formulario captura un contacto, el evento CREA UN
// OBJETO Contacto, lo guarda en una lista y lo muestra en el area de texto.
// La ventana es la cascara; el objeto es el programa.
public class AgendaContactos extends JFrame {

    private ArrayList<Contacto> contactos = new ArrayList<>();

    private JTextField txtNombre;
    private JTextField txtTelefono;
    private JComboBox<String> cboTipo;
    private JTextArea areaLista;
    private JButton btnAgregar;
    private JButton btnLimpiar;

    public AgendaContactos() {
        // TODO 1: configura el marco "Agenda de contactos", 460 x 340,
        //         EXIT_ON_CLOSE, BorderLayout(8, 8).

        // TODO 2: panel de datos al NORTH, con GridLayout(3, 2):
        //           JLabel "Nombre:"   + txtNombre
        //           JLabel "Telefono:" + txtTelefono
        //           JLabel "Tipo:"     + cboTipo con {"Familia","Trabajo","Estudio"}

        // TODO 3: areaLista (no editable) dentro de un JScrollPane, al CENTER.

        // TODO 4: panel de botones al SOUTH con btnAgregar y btnLimpiar.

        // TODO 5: en el ActionListener de btnAgregar:
        //           a) valida que el nombre no este vacio (trim().isEmpty())
        //           b) crea el objeto: new Contacto(nombre, telefono, tipo)
        //           c) agregalo a la lista con contactos.add(...)
        //           d) vuelve a pintar el area recorriendo la lista:
        //              areaLista.setText(""); y luego un for que haga append
        //           e) limpia los campos de texto

        // TODO 6: btnLimpiar vacia la lista Y el area de texto.
    }

    public static void main(String[] args) {
        // TODO 7: muestra la ventana centrada.
    }
}
