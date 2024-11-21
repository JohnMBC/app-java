import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Tela extends JFrame implements ActionListener {

    private JButton btn1 = null;
    private JButton btn2 = null;
    private JTextField texto = null;

    public Tela() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        btn1 = new JButton("Click-me");
        btn2 = new JButton("Clear/Limpar");
        texto = new JTextField(10);

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        add(btn1);
        add(btn2);
        add(texto);

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Click-me")) {
            texto.setText("Clicado");
        } else {
            texto.setText(null);
        }
    }

    public static void main(String[] args) {
        new Tela();
    }
}

