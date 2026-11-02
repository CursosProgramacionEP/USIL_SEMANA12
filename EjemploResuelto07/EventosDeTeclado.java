import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// KeyEvent: el evento que genera la actividad del teclado.
// KeyListener es una interfaz con TRES metodos, y una interfaz obliga
// a implementarlos todos, se usen o no. (Semana 11.)
public class EventosDeTeclado extends JFrame implements KeyListener {

    private JTextField campo;
    private JLabel lblContador;
    private JTextArea bitacora;

    public EventosDeTeclado() {
        setTitle("Eventos de teclado");
        setSize(460, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(8, 8));

        JPanel arriba = new JPanel(new FlowLayout());
        arriba.add(new JLabel("Escribe aqui:"));
        campo = new JTextField(20);
        arriba.add(campo);
        add(arriba, BorderLayout.NORTH);

        bitacora = new JTextArea(8, 36);
        bitacora.setEditable(false);
        add(new JScrollPane(bitacora), BorderLayout.CENTER);

        lblContador = new JLabel("Caracteres: 0");
        add(lblContador, BorderLayout.SOUTH);

        // Esta clase ES el oyente: implementa KeyListener, asi que puede
        // registrarse a si misma con this.
        campo.addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        bitacora.append("keyPressed  -> codigo " + e.getKeyCode() + "\n");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        bitacora.append("keyTyped    -> caracter '" + e.getKeyChar() + "'\n");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        bitacora.append("keyReleased -> codigo " + e.getKeyCode() + "\n");
        // El texto ya se actualizo: recien aqui el contador es correcto.
        lblContador.setText("Caracteres: " + campo.getText().length());
    }

    public static void main(String[] args) {
        EventosDeTeclado ventana = new EventosDeTeclado();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
