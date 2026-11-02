// ============================================================================
//  EventosDeMouse - MouseEvent
//  Objetivo: reaccionar al raton y ver que las coordenadas se miden respecto
//            al componente que escucha, no a la pantalla.
// ============================================================================

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventosDeMouse extends JFrame {

    private JPanel zona;
    private JLabel lblEstado;

    public EventosDeMouse() {
        // ---- Configuración del marco -----------------------------------
        setTitle("Eventos de raton");                    // barra de titulo
        setSize(420, 260);                               // ancho x alto
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // la X termina el programa
        setLayout(new BorderLayout(8, 8));               // regiones

        zona = new JPanel();                      // el panel que va a escuchar
        zona.setBackground(Color.LIGHT_GRAY);     // color de fondo inicial
        zona.add(new JLabel("Pasa el raton por aqui y haz clic"));
        add(zona, BorderLayout.CENTER);           // ocupa todo el espacio sobrante

        lblEstado = new JLabel("Esperando...");
        add(lblEstado, BorderLayout.SOUTH);

        // MouseListener es una interfaz de CINCO metodos. Aqui solo interesan
        // tres, pero el contrato obliga a escribir los cinco: por eso dos
        // quedan vacios. (Para evitarlo existe MouseAdapter.)
        zona.addMouseListener(new MouseListener() {

            @Override
            public void mouseEntered(MouseEvent e) {     // el puntero ENTRA
                zona.setBackground(Color.CYAN);
                lblEstado.setText("mouseEntered: el raton entro a la zona");
            }

            @Override
            public void mouseExited(MouseEvent e) {      // el puntero SALE
                zona.setBackground(Color.LIGHT_GRAY);
                lblEstado.setText("mouseExited: el raton salio de la zona");
            }

            @Override
            public void mouseClicked(MouseEvent e) {     // presiono Y solto
                // getX()/getY(): pixeles DENTRO de zona, no de la pantalla.
                // getClickCount(): 2 en un doble clic. No existe un evento
                // "doble clic" aparte.
                lblEstado.setText("mouseClicked en (" + e.getX() + ", " + e.getY()
                        + ") con " + e.getClickCount() + " clic(s)");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // No se usa, pero la interfaz obliga a declararlo.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // Idem.
            }
        });
    }

    public static void main(String[] args) {
        EventosDeMouse ventana = new EventosDeMouse();
        ventana.setLocationRelativeTo(null);   // centrada en la pantalla
        ventana.setVisible(true);
    }
}
