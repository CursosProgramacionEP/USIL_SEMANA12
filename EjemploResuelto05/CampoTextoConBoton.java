import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CampoTextoConBoton extends JFrame {
    private JTextField campoTexto;
    private JButton boton;

    public CampoTextoConBoton() {
        // Configuración del marco
        setTitle("Ejemplo de Campo de Texto y Botón");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Crear campo de texto
        campoTexto = new JTextField(15);
        add(campoTexto);

        // Crear botón
        boton = new JButton("Mostrar Texto");
        add(boton);

        // Agregar ActionListener al botón
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoIngresado = campoTexto.getText();
                System.out.println("Texto ingresado: " + textoIngresado);
            }
        });
    }

    public static void main(String[] args) {
        // Crear y mostrar la ventana
        CampoTextoConBoton ventana = new CampoTextoConBoton();
        ventana.setVisible(true);
    }
}
