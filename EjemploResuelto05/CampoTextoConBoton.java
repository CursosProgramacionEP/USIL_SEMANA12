// ============================================================================
//  CampoTextoConBoton - el primer evento
//  Objetivo: que una linea de codigo NO se ejecute cuando la escribes, sino
//            cuando el usuario hace clic.
// ============================================================================

import javax.swing.*;        // JFrame, JTextField, JButton
import java.awt.*;           // FlowLayout
import java.awt.event.*;     // ActionListener y ActionEvent: los eventos

public class CampoTextoConBoton extends JFrame {

    // Los componentes son ATRIBUTOS, no variables locales del constructor.
    // Razon: el metodo actionPerformed (mas abajo) tiene que poder leerlos,
    // y una variable declarada dentro del constructor muere al terminarlo.
    private JTextField campoTexto;
    private JButton boton;

    public CampoTextoConBoton() {
        // ---- Configuración del marco -----------------------------------
        setTitle("Ejemplo de Campo de Texto y Botón");   // barra de titulo
        setSize(300, 150);                               // ancho x alto en pixeles
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // la X termina el programa
        setLayout(new FlowLayout());                     // componentes en fila,
                                                         // uno tras otro

        // ---- Crear campo de texto ---------------------------------------
        campoTexto = new JTextField(15);   // 15 = ancho en columnas (caracteres),
                                           // NO es un limite de escritura
        add(campoTexto);                   // se agrega al marco

        // ---- Crear botón --------------------------------------------------
        boton = new JButton("Mostrar Texto");   // el texto que se ve en el boton
        add(boton);

        // ---- Agregar ActionListener al botón -------------------------------
        // Esto NO ejecuta nada ahora: solo deja registrado un objeto que sabra
        // que hacer cuando alguien pulse el boton.
        // new ActionListener() { ... } es una CLASE ANONIMA: una clase sin
        // nombre que implementa la interfaz ahi mismo.
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Este bloque corre UNA VEZ POR CADA CLIC, no al arrancar.
                String textoIngresado = campoTexto.getText();  // lee el campo
                System.out.println("Texto ingresado: " + textoIngresado);
            }
        });
    }

    public static void main(String[] args) {
        // Crear y mostrar la ventana
        CampoTextoConBoton ventana = new CampoTextoConBoton();
        ventana.setVisible(true);
        // El main TERMINA aqui, pero el programa NO: Java deja corriendo un
        // hilo que espera eventos. Por eso la ventana sigue respondiendo.
    }
}
