// ============================================================================
//  EventosDeVentana - WindowEvent
//  Objetivo: que la ventana narre su propio ciclo de vida y que el programa
//            pregunte ANTES de cerrarse.
// ============================================================================

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventosDeVentana extends JFrame {

    private JTextArea bitacora;

    public EventosDeVentana() {
        // ---- Configuración del marco -----------------------------------
        setTitle("Eventos de ventana");    // barra de titulo
        setSize(460, 300);                 // ancho x alto
        setLayout(new BorderLayout());     // regiones, sin separacion extra

        // ESTA es la linea clave del ejemplo:
        // DO_NOTHING_ON_CLOSE = al pulsar la X, Java NO hace nada.
        // Le quitamos a Java la decision de cerrar para tomarla nosotros,
        // dentro de windowClosing. Con EXIT_ON_CLOSE el programa se cerraria
        // antes de alcanzar a preguntar nada.
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        bitacora = new JTextArea(10, 36);
        bitacora.setEditable(false);       // solo lectura
        add(new JScrollPane(bitacora), BorderLayout.CENTER);

        // WindowListener tiene SIETE metodos: hay que escribirlos todos.
        // El oyente se registra sobre la propia ventana, por eso
        // addWindowListener va sin objeto delante (se aplica a this).
        addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {   // se mostro por 1a vez
                bitacora.append("windowOpened: la ventana se mostro por primera vez\n");
            }

            @Override
            public void windowClosing(WindowEvent e) {  // el usuario PIDE cerrar
                                                        // (todavia se puede cancelar)
                int opcion = JOptionPane.showConfirmDialog(
                        EventosDeVentana.this,   // sobre que ventana aparece el dialogo
                        "Seguro que desea salir?",
                        "Confirmar",
                        JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    System.exit(0);              // 0 = termino sin errores
                } else {
                    bitacora.append("windowClosing: cierre cancelado por el usuario\n");
                }
            }

            @Override
            public void windowIconified(WindowEvent e) {    // se minimizo
                bitacora.append("windowIconified: minimizada\n");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {  // se restauro
                bitacora.append("windowDeiconified: restaurada\n");
            }

            @Override
            public void windowActivated(WindowEvent e) {    // paso al frente
                bitacora.append("windowActivated: recibio el foco\n");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {  // otra ventana la tapo
                bitacora.append("windowDeactivated: perdio el foco\n");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                // Se dispara DESPUES de cerrar, cuando ya no hay vuelta atras.
                // Todo lo que sea "antes de salir" va en windowClosing.
            }
        });
    }

    public static void main(String[] args) {
        EventosDeVentana ventana = new EventosDeVentana();
        ventana.setLocationRelativeTo(null);   // centrada en la pantalla
        ventana.setVisible(true);
    }
}
