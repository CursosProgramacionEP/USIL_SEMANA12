// ============================================================================
//  EventosDeTeclado - KeyEvent
//  Objetivo: ver que UNA pulsacion dispara TRES eventos, y en que orden.
// ============================================================================

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Esta clase hereda de JFrame Y ADEMAS firma el contrato KeyListener.
// En Java se hereda de UNA sola clase, pero se pueden implementar todas las
// interfaces que hagan falta. Por eso puede ser su propio oyente (ver el this
// del final del constructor).
public class EventosDeTeclado extends JFrame implements KeyListener {

    private JTextField campo;      // atributos: los usan keyPressed/keyTyped/...
    private JLabel lblContador;
    private JTextArea bitacora;

    public EventosDeTeclado() {
        // ---- Configuración del marco -----------------------------------
        setTitle("Eventos de teclado");                  // barra de titulo
        setSize(460, 300);                               // ancho x alto
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // la X termina el programa
        setLayout(new BorderLayout(8, 8));               // regiones, 8 px de margen

        // Panel superior: etiqueta y campo en fila
        JPanel arriba = new JPanel(new FlowLayout());
        arriba.add(new JLabel("Escribe aqui:"));
        campo = new JTextField(20);     // 20 columnas de ancho
        arriba.add(campo);
        add(arriba, BorderLayout.NORTH);

        // Bitacora: solo para mostrar, el usuario no debe escribir en ella
        bitacora = new JTextArea(8, 36);   // 8 filas, 36 columnas
        bitacora.setEditable(false);       // solo lectura
        add(new JScrollPane(bitacora), BorderLayout.CENTER);  // con barra

        lblContador = new JLabel("Caracteres: 0");
        add(lblContador, BorderLayout.SOUTH);

        // Se registra A SI MISMA como oyente: this ES un KeyListener,
        // porque la clase lo implementa.
        campo.addKeyListener(this);
    }

    // 1o: la tecla baja. El caracter TODAVIA no entro al campo.
    @Override
    public void keyPressed(KeyEvent e) {
        bitacora.append("keyPressed  -> codigo " + e.getKeyCode() + "\n");
    }

    // 2o: se produjo un caracter. Shift o las flechas NO pasan por aqui,
    //     porque no producen ningun caracter.
    @Override
    public void keyTyped(KeyEvent e) {
        bitacora.append("keyTyped    -> caracter '" + e.getKeyChar() + "'\n");
    }

    // 3o: la tecla sube. El texto ya cambio: recien aqui el contador es correcto.
    @Override
    public void keyReleased(KeyEvent e) {
        bitacora.append("keyReleased -> codigo " + e.getKeyCode() + "\n");
        lblContador.setText("Caracteres: " + campo.getText().length());
    }

    public static void main(String[] args) {
        EventosDeTeclado ventana = new EventosDeTeclado();
        ventana.setLocationRelativeTo(null);   // centrada en la pantalla
        ventana.setVisible(true);
    }
}
