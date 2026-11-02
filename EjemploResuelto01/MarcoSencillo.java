import javax.swing.*;

public class MarcoSencillo extends JFrame
{
    private static final int ANCHO=200, ALTO=150;

    public MarcoSencillo()
    {
        setTitle("Marco vacío");
        setSize(ANCHO,ALTO);
        setLocation(ANCHO/2, ALTO/2);
    }

    public static void main(String args[])
    {
        MarcoSencillo marco;
        marco = new MarcoSencillo();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
