// ============================================================================
//  EventosDeSeleccion - ItemEvent
//  Objetivo: ver que un ItemEvent avisa de un CAMBIO DE ESTADO, y que cambiar
//            de opcion en un combo dispara DOS eventos, no uno.
// ============================================================================

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventosDeSeleccion extends JFrame {

    private JComboBox<String> cboCurso;
    private JCheckBox chkMatriculado;
    private JTextArea bitacora;

    public EventosDeSeleccion() {
        // ---- Configuración del marco -----------------------------------
        setTitle("Eventos de seleccion");                // barra de titulo
        setSize(480, 300);                               // ancho x alto
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // la X termina el programa
        setLayout(new BorderLayout(8, 8));               // regiones

        // Panel superior con el combo y la casilla, en fila
        JPanel arriba = new JPanel(new FlowLayout());
        arriba.add(new JLabel("Curso:"));
        cboCurso = new JComboBox<>(new String[]{          // las opciones del combo
                "Programacion Orientada a Objetos I",
                "Estructura de Datos",
                "Base de Datos"});
        arriba.add(cboCurso);
        chkMatriculado = new JCheckBox("Matriculado");    // nace desmarcada
        arriba.add(chkMatriculado);
        add(arriba, BorderLayout.NORTH);

        bitacora = new JTextArea(10, 40);
        bitacora.setEditable(false);                      // solo lectura
        add(new JScrollPane(bitacora), BorderLayout.CENTER);

        // ---- Oyente del combo -------------------------------------------
        // No hay ningun boton: nada se confirma, todo reacciona al instante.
        cboCurso.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // getStateChange() dice si el elemento ENTRO o SALIO de la
                // seleccion. Cambiar de opcion dispara este metodo DOS veces:
                // DESELECTED por la que sale, SELECTED por la que entra.
                String estado = (e.getStateChange() == ItemEvent.SELECTED)
                        ? "SELECTED  " : "DESELECTED";
                // e.getItem() es el elemento afectado por este evento concreto.
                bitacora.append("combo  " + estado + " -> " + e.getItem() + "\n");
            }
        });

        // ---- Oyente de la casilla ---------------------------------------
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
        ventana.setLocationRelativeTo(null);   // centrada en la pantalla
        ventana.setVisible(true);
    }
}
