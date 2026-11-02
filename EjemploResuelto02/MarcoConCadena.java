import javax.swing.*;
import java.awt.*;

public class MarcoConCadena extends JFrame {
    private static final int ANCHO=300, ALTO=150;

    public MarcoConCadena(String c)
    {
        super(c);
        setSize(ANCHO,ALTO);
        setResizable(false);
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        Font tipoLetra = new Font("Courier", Font.BOLD, 14);
        g.setFont(tipoLetra);
        g.drawString("Bienvenido al mundo del swing", ANCHO/10, 70);
        g.drawLine(ANCHO/10, 80, ANCHO/10 + 225, 80);
    }

    public static void main(String args[])
    {
        MarcoConCadena marco;
        marco = new MarcoConCadena("Marco gráfico");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
