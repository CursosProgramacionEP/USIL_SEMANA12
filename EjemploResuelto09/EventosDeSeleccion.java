import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// ItemEvent: el evento que se genera cuando se selecciona un elemento de
// una lista, una opcion o una caja de chequeo. No es lo mismo que ActionEvent:
// aqui no hay "accion", hay un cambio de estado.
public class EventosDeSeleccion extends JFrame {

    private JComboBox<String> cboCurso;
    private JCheckBox chkMatriculado;
    private JTextArea bitacora;

    public EventosDeSeleccion() {
        setTitle("Eventos de seleccion");
        setSize(480, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(8, 8));

        JPanel arriba = new JPanel(new FlowLayout());
        arriba.add(new JLabel("Curso:"));
        cboCurso = new JComboBox<>(new String[]{
                "Programacion Orientada a Objetos I",
                "Estructura de Datos",
                "Base de Datos"});
        arriba.add(cboCurso);
        chkMatriculado = new JCheckBox("Matriculado");
        arriba.add(chkMatriculado);
        add(arriba, BorderLayout.NORTH);

        bitacora = new JTextArea(10, 40);
        bitacora.setEditable(false);
        add(new JScrollPane(bitacora), BorderLayout.CENTER);

        cboCurso.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String estado = (e.getStateChange() == ItemEvent.SELECTED)
                        ? "SELECTED  " : "DESELECTED";
                bitacora.append("combo  " + estado + " -> " + e.getItem() + "\n");
            }
        });

        chkMatriculado.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                boolean marcado = (e.getStateChange() == ItemEvent.SELECTED);
                bitacora.append("check  " + (marcado ? "marcado" : "desmarcado") + "\n");
            }
        });
    }

    public static void main(String[] args) {
        EventosDeSeleccion ventana = new EventosDeSeleccion();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
