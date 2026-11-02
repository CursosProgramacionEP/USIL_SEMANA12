import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Caso: la ventana de acceso del sistema academico. Usuario, clave
// enmascarada, y tres intentos. Al tercer intento fallido se bloquea el boton.
public class LoginUsuario extends JFrame {

    private static final String USUARIO_VALIDO = "admin";
    private static final String CLAVE_VALIDA = "usil2026";

    private JTextField txtUsuario;
    private JPasswordField txtClave;
    private JButton btnIngresar;
    private JLabel lblMensaje;
    private int intentos = 0;

    public LoginUsuario() {
        // TODO 1: configura el marco: "Acceso al sistema", 360 x 180,
        //         EXIT_ON_CLOSE, GridLayout(4, 2, 5, 5).

        // TODO 2: crea y agrega:
        //           JLabel "Usuario:" + txtUsuario
        //           JLabel "Clave:"   + txtClave (JPasswordField)
        //           btnIngresar ("Ingresar") + JLabel vacio
        //           lblMensaje ocupando la ultima fila

        // TODO 3: en el ActionListener de btnIngresar:
        //         - lee el usuario con getText()
        //         - lee la clave con new String(txtClave.getPassword())
        //           OJO: getPassword() devuelve char[], no String. Averigua por que.
        //         - si coinciden, lblMensaje muestra "Acceso concedido" en verde
        //           (lblMensaje.setForeground(Color.GREEN))

        // TODO 4: si NO coinciden, incrementa intentos y muestra
        //         "Credenciales incorrectas. Intento X de 3" en rojo.

        // TODO 5: al tercer intento fallido, deshabilita el boton con
        //         btnIngresar.setEnabled(false) y muestra "Cuenta bloqueada".
    }

    public static void main(String[] args) {
        // TODO 6: muestra la ventana centrada.
    }
}
