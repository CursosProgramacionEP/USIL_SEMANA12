import javax.swing.*;
import java.awt.*;

public class MarcoBorder extends JFrame
{
    static int ANCHO =175;
    static int ALTO = 100;

    public MarcoBorder()
    {
        super("Mi marco");
        add(new JLabel("Norte", SwingConstants.CENTER),
                BorderLayout.NORTH);
        add(new JLabel("Sur", SwingConstants.CENTER),
                BorderLayout.SOUTH);
        add(new JLabel("Centro", SwingConstants.CENTER),
                BorderLayout.CENTER);
        add(new JLabel("Oeste", SwingConstants.CENTER),
                BorderLayout.WEST);
        add(new JLabel("Este", SwingConstants.CENTER),
                BorderLayout.EAST);
        setSize(ANCHO,ALTO);
        setVisible(true);
    }

    public static void main(String args[])
    {
        MarcoBorder miMarco = new MarcoBorder();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
