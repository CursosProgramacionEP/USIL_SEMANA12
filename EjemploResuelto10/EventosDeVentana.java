import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// WindowEvent: el evento que genera la actividad de la ventana
// (abrir, cerrar, minimizar, activar...).
// Fijate en setDefaultCloseOperation(DO_NOTHING_ON_CLOSE): le quitamos a
// Java la decision de cerrar para tomarla nosotros dentro del oyente.
public class EventosDeVentana extends JFrame {

    private JTextArea bitacora;

    public EventosDeVentana() {
        setTitle("Eventos de ventana");
        setSize(460, 300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        bitacora = new JTextArea(10, 36);
        bitacora.setEditable(false);
        add(new JScrollPane(bitacora), BorderLayout.CENTER);

        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                bitacora.append("windowOpened: la ventana se mostro por primera vez\n");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                int opcion = JOptionPane.showConfirmDialog(
                        EventosDeVentana.this,
                        "Seguro que desea salir?",
                        "Confirmar",
                        JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    System.exit(0);
                } else {
                    bitacora.append("windowClosing: cierre cancelado por el usuario\n");
                }
            }

            @Override
            public void windowIconified(WindowEvent e) {
                bitacora.append("windowIconified: minimizada\n");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                bitacora.append("windowDeiconified: restaurada\n");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                bitacora.append("windowActivated: recibio el foco\n");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                bitacora.append("windowDeactivated: perdio el foco\n");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                // Se dispara despues de cerrar, no antes.
            }
        });
    }

    public static void main(String[] args) {
        EventosDeVentana ventana = new EventosDeVentana();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
