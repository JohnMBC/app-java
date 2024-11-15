import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Tela extends JFrame {
    private JTextField txtNome = null;
    private JTextField txtEmail = null;
    private JButton btnEnviar = null;
    
    public Tela() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocation(new Point(500, 400));

        txtNome = new JTextField("Johnny Michael Borges Carvalho");
        txtEmail = new JTextField("hX2bM@example.com");
        btnEnviar = new JButton("Enviar");

        txtNome.setFont(new Font("Arial", Font.BOLD, 20));
        txtEmail.setFont(new Font("Arial", Font.BOLD, 20));
        btnEnviar.setFont(new Font("Arial", Font.BOLD, 20));    

        add(txtNome);
        add(txtEmail);
        add(btnEnviar);
pack();

    }   
}
