import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// MouseEvent: el evento que genera la actividad del raton.
// MouseListener tiene CINCO metodos. Aqui solo interesan tres, pero la
// interfaz obliga a escribir los cinco: los dos que sobran quedan vacios.
public class EventosDeMouse extends JFrame {

    private JPanel zona;
    private JLabel lblEstado;

    public EventosDeMouse() {
        setTitle("Eventos de raton");
        setSize(420, 260);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(8, 8));

        zona = new JPanel();
        zona.setBackground(Color.LIGHT_GRAY);
        zona.add(new JLabel("Pasa el raton por aqui y haz clic"));
        add(zona, BorderLayout.CENTER);

        lblEstado = new JLabel("Esperando...");
        add(lblEstado, BorderLayout.SOUTH);

        zona.addMouseListener(new MouseListener() {
            @Override
            public void mouseEntered(MouseEvent e) {
                zona.setBackground(Color.CYAN);
                lblEstado.setText("mouseEntered: el raton entro a la zona");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                zona.setBackground(Color.LIGHT_GRAY);
                lblEstado.setText("mouseExited: el raton salio de la zona");
            }

            @Override
            public void mouseClicked(MouseEvent e) {
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
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
