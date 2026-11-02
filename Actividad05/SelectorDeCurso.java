import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Caso: una ficha de inscripcion donde NADA se confirma con un boton.
// Todo reacciona al instante: al cambiar el combo, al marcar una casilla,
// al elegir una modalidad. Es ItemEvent, no ActionEvent.
public class SelectorDeCurso extends JFrame {

    private JComboBox<String> cboCurso;
    private JCheckBox chkLaboratorio;
    private JCheckBox chkAsesoria;
    private JRadioButton rbPresencial;
    private JRadioButton rbVirtual;
    private JTextArea areaResumen;

    public SelectorDeCurso() {
        // TODO 1: configura el marco "Inscripcion", 480 x 320,
        //         EXIT_ON_CLOSE, BorderLayout(8, 8).

        // TODO 2: panel de opciones al NORTH (puedes usar GridLayout(4, 1)):
        //           cboCurso con {"POO I", "Estructura de Datos", "Base de Datos"}
        //           chkLaboratorio ("Con laboratorio")
        //           chkAsesoria ("Con asesoria")
        //           rbPresencial y rbVirtual

        // TODO 3: los dos JRadioButton deben ser EXCLUYENTES entre si.
        //         Un JRadioButton suelto no lo es: hay que meterlos en un
        //         ButtonGroup. Averigua como y hazlo.
        //         OJO: el ButtonGroup agrupa el comportamiento, NO los dibuja.
        //         Al panel se agregan los botones, no el grupo.

        // TODO 4: areaResumen (no editable) dentro de un JScrollPane, al CENTER.

        // TODO 5: escribe un metodo privado actualizarResumen() que arme el
        //         texto con el curso elegido, las casillas marcadas y la
        //         modalidad, y lo ponga en areaResumen con setText.

        // TODO 6: registra un ItemListener en cboCurso, en las dos casillas y
        //         en los dos radios. Todos llaman a actualizarResumen().
        //         Fijate en que el combo dispara DOS eventos por cada cambio:
        //         uno DESELECTED del anterior y uno SELECTED del nuevo.
        //         Filtra con if (e.getStateChange() == ItemEvent.SELECTED).

        // TODO 7: llama a actualizarResumen() una vez al final del constructor,
        //         para que el resumen no nazca vacio.
    }

    public static void main(String[] args) {
        // TODO 8: muestra la ventana centrada.
    }
}
