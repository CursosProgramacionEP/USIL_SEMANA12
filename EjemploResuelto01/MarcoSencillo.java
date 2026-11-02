// ============================================================================
//  MarcoSencillo - la ventana minima
//  Objetivo: ver lo imprescindible para que una ventana exista y se vea.
// ============================================================================

import javax.swing.*;          // JFrame, JLabel, JButton... todo Swing vive aqui

// "extends JFrame" = esta clase ES una ventana.
// Por eso mas abajo se puede escribir setTitle(...) sin ningun objeto delante:
// es un metodo heredado que se aplica sobre this (la propia ventana).
public class MarcoSencillo extends JFrame
{
    // Constantes de tamano. static final = valor fijo, compartido, no cambia.
    private static final int ANCHO=200, ALTO=150;

    // CONSTRUCTOR: aqui se CONFIGURA la ventana. Todavia no se muestra.
    public MarcoSencillo()
    {
        setTitle("Marco vacío");       // texto de la barra de titulo
        setSize(ANCHO,ALTO);           // tamano en pixeles: ancho x alto
        setLocation(ANCHO/2, ALTO/2);  // posicion de la esquina superior izquierda
                                       // (100, 75) contados desde la esquina
                                       // superior izquierda de la PANTALLA
    }

    public static void main(String args[])
    {
        MarcoSencillo marco;                // 1. se declara la variable
        marco = new MarcoSencillo();        // 2. se crea el objeto -> corre el constructor
                                            //    la ventana ya existe en memoria,
                                            //    pero sigue INVISIBLE

        // 3. que pasa al pulsar la X de la ventana:
        //    EXIT_ON_CLOSE  -> termina el programa (lo que casi siempre quieres)
        //    DISPOSE_ON_CLOSE -> cierra solo esta ventana, el programa sigue
        //    HIDE_ON_CLOSE  -> la esconde, el programa sigue (es el valor por defecto)
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco.setVisible(true);             // 4. AHORA se dibuja en pantalla.
                                            //    Siempre va al final: todo lo que
                                            //    configures despues puede no verse.
    }
}
