// ============================================================================
//  MarcoConCadena - dibujar texto y lineas sobre la ventana
//  Objetivo: ver que el titulo puede llegar por el constructor (super) y que
//            se puede dibujar directamente sobre el marco.
// ============================================================================

import javax.swing.*;   // JFrame
import java.awt.*;      // Graphics y Font: las herramientas de dibujo

public class MarcoConCadena extends JFrame {

    private static final int ANCHO=300, ALTO=150;

    // El constructor recibe el titulo como parametro (String c).
    public MarcoConCadena(String c)
    {
        super(c);                // llama al constructor de JFrame que recibe el
                                 // titulo. Hace lo mismo que setTitle(c), pero
                                 // delegando en la superclase (herencia).
        setSize(ANCHO,ALTO);     // 300 x 150 pixeles
        setResizable(false);     // el usuario NO puede estirar la ventana
        setVisible(true);        // aqui si se muestra dentro del constructor
    }

    // paint() lo llama Java solo, cada vez que necesita redibujar la ventana.
    // TU NUNCA llamas a paint(). El parametro g es el "lapiz".
    public void paint(Graphics g)
    {
        // Font(nombre de la letra, estilo, tamano en puntos)
        Font tipoLetra = new Font("Courier", Font.BOLD, 14);
        g.setFont(tipoLetra);                 // el lapiz usara esa letra

        // drawString(texto, x, y): x e y son pixeles DENTRO de la ventana.
        g.drawString("Bienvenido al mundo del swing", ANCHO/10, 70);

        // drawLine(x1, y1, x2, y2): una linea del punto 1 al punto 2.
        g.drawLine(ANCHO/10, 80, ANCHO/10 + 225, 80);
    }

    public static void main(String args[])
    {
        MarcoConCadena marco;
        marco = new MarcoConCadena("Marco gráfico");   // el titulo viaja al super(c)
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Aqui no hace falta setVisible(true): el constructor ya lo llamo.
    }
}
