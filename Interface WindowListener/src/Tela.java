import java.awt.BorderLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tela extends JFrame implements WindowListener {
    private JTextField textField = null;

    public Tela() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textField = new JTextField(20);
        addWindowListener(this);
        add(textField, BorderLayout.NORTH);
        pack();
        setLocationRelativeTo(this);
    }

    public void windowOpened(WindowEvent e) {
        JOptionPane.showMessageDialog(rootPane, "Programa iniciado");
    }

    public void windowClosing(WindowEvent e) {
        JOptionPane.showMessageDialog(rootPane, "Programa encerrado");
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
        JOptionPane.showMessageDialog(rootPane, "Programa minimizado");

    }

    public void windowDeiconified(WindowEvent e) {
        JOptionPane.showMessageDialog(rootPane, "Programa maximizado");
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }
}