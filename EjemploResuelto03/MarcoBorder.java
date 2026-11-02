// ============================================================================
//  MarcoBorder - las cinco regiones de BorderLayout
//  Objetivo: colocar componentes SIN usar coordenadas. El gestor decide.
// ============================================================================

import javax.swing.*;   // JFrame, JLabel, SwingConstants
import java.awt.*;      // BorderLayout

public class MarcoBorder extends JFrame
{
    static int ANCHO =175;
    static int ALTO = 100;

    public MarcoBorder()
    {
        super("Mi marco");       // titulo de la ventana, via constructor de JFrame

        // Un JFrame usa BorderLayout POR DEFECTO: no hay que pedirlo.
        // BorderLayout parte el espacio en cinco regiones fijas.
        // add(componente, region):

        // SwingConstants.CENTER centra el texto DENTRO de la etiqueta;
        // no tiene nada que ver con BorderLayout.CENTER, que es la region.
        add(new JLabel("Norte", SwingConstants.CENTER),
                BorderLayout.NORTH);     // franja superior, todo el ancho
        add(new JLabel("Sur", SwingConstants.CENTER),
                BorderLayout.SOUTH);     // franja inferior, todo el ancho
        add(new JLabel("Centro", SwingConstants.CENTER),
                BorderLayout.CENTER);    // el sobrante: es el unico que CRECE
        add(new JLabel("Oeste", SwingConstants.CENTER),
                BorderLayout.WEST);      // franja izquierda
        add(new JLabel("Este", SwingConstants.CENTER),
                BorderLayout.EAST);      // franja derecha

        setSize(ANCHO,ALTO);     // 175 x 100
        setVisible(true);        // se muestra
    }

    public static void main(String args[])
    {
        MarcoBorder miMarco = new MarcoBorder();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // la X termina el programa
    }
}
