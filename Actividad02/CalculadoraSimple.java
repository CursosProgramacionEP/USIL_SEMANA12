import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Caso: una calculadora de dos operandos. El usuario escribe dos numeros,
// elige la operacion en un JComboBox y pulsa Calcular. El resultado aparece
// en una JLabel, no en la consola.
public class CalculadoraSimple extends JFrame {

    private JTextField txtA;
    private JTextField txtB;
    private JComboBox<String> cboOperacion;
    private JButton btnCalcular;
    private JLabel lblResultado;

    public CalculadoraSimple() {
        // TODO 1: configura el marco.
        //         titulo "Calculadora", 360 x 200, EXIT_ON_CLOSE
        //         layout: new GridLayout(5, 2, 5, 5)

        // TODO 2: crea y agrega, en este orden:
        //           JLabel "Numero A:"   + txtA
        //           JLabel "Numero B:"   + txtB
        //           JLabel "Operacion:"  + cboOperacion con {"+", "-", "*", "/"}
        //           JLabel "Resultado:"  + lblResultado (texto inicial "0.0")
        //           btnCalcular ("Calcular") + un JLabel vacio para rellenar la celda

        // TODO 3: registra el ActionListener de btnCalcular.
        //         Dentro de actionPerformed:
        //           a) lee los dos campos y conviertelos con Double.parseDouble
        //           b) lee la operacion con cboOperacion.getSelectedItem().toString()
        //           c) resuelve con un switch sobre la operacion
        //           d) muestra con lblResultado.setText(String.valueOf(resultado))

        // TODO 4: protege dos casos que el usuario SI va a provocar:
        //           - texto que no es numero  -> NumberFormatException
        //           - division entre cero     -> avisa en lblResultado, no revientes
    }

    public static void main(String[] args) {
        // TODO 5: crea la ventana, centrala con setLocationRelativeTo(null)
        //         y hazla visible.
    }
}
