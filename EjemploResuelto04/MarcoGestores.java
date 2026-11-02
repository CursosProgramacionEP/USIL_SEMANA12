// ============================================================================
//  MarcoGestores - tres gestores distintos en una sola ventana
//  Objetivo: ver que cada JPanel es un contenedor con su PROPIO layout,
//            y que el marco acomoda paneles, no componentes sueltos.
// ============================================================================

import javax.swing.*;   // JFrame, JPanel, JLabel, JList, JButton, JTextField...
import java.awt.*;      // FlowLayout, BorderLayout

public class MarcoGestores extends JFrame
{
    public MarcoGestores()
    {
        // ---- Tres paneles, cada uno con su gestor ----------------------
        JPanel pa1 = new JPanel(new FlowLayout());    // en fila, salta de linea
        JPanel pa2 = new JPanel(new BorderLayout());  // por regiones
        JPanel pa3 = new JPanel();                    // sin gestor aun
        pa3.setLayout(new BoxLayout(pa3, BoxLayout.Y_AXIS));  // apila en vertical
        // BoxLayout es el unico que necesita saber a quien organiza: por eso
        // recibe pa3 como primer parametro.

        // ---- componentes del panel 1 -----------------------------------
        String [] opc = {"Marea alta", "Bajamar", " Montaña"};  // datos de la lista
        pa1.add(new JLabel ("Elegir", JLabel.CENTER));  // etiqueta, texto centrado
        pa1.add(new JList(opc));                        // lista de opciones
        pa1.add(new JButton("Pulsar"));                 // boton (sin evento aun)

        // ---- componentes del panel 2 -----------------------------------
        JTextField j = new JTextField("Razones ");
        j.setEditable(false);    // se ve y se selecciona, pero NO se escribe
                                 // (distinto de setEnabled(false), que lo pinta gris)
        pa2.add(j,BorderLayout.WEST);                            // a la izquierda
        pa2.add(new JButton("Boton"),BorderLayout.EAST);         // a la derecha

        // ---- componentes del panel 3 -----------------------------------
        pa3.add(new JCheckBox("Box ", false));            // casilla, desmarcada
        pa3.add(new JLabel ("Calendario", JLabel.CENTER));
        pa3.add(new JRadioButton("Bot Radio", true));     // radio, marcado

        // ---- el marco acomoda los TRES PANELES --------------------------
        // BorderLayout(hgap, vgap): separacion horizontal y vertical en pixeles
        setLayout( new BorderLayout(10, 15));
        add(pa1,BorderLayout.NORTH);    // panel 1 arriba
        add(pa2,BorderLayout.CENTER);   // panel 2 al centro
        add(pa3,BorderLayout.SOUTH);    // panel 3 abajo
    }

    public static void main(String[] args)
    {
        MarcoGestores m;
        m = new MarcoGestores();         // se construye (aun invisible)
        m.setSize(200, 300);             // 200 de ancho, 300 de alto
        m.setLocation(20, 200);          // esquina superior izquierda en (20,200)
        m.setResizable(false);           // no se puede estirar
        m.setVisible(true);              // se muestra
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // la X termina el programa
    }
}
