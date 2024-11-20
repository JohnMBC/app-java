import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Tela extends JFrame {
    private JTextField txtNome = null;
    private JTextField txtEmail = null;
    private JButton btnEnviar = null;
    private Font fonte = null;

    public Tela() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocation(new Point(500, 400));

        txtNome = new JTextField("Johnny Michael Borges Carvalho");
        txtEmail = new JTextField("johnny.michael.b.carvalho@gmail.com");
        btnEnviar = new JButton("Enviar") {
            @Override
            protected void paintComponent(Graphics g) {
                if (g instanceof Graphics2D) {
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    GradientPaint gp = new GradientPaint(0, 0, Color.BLUE, 0, getHeight(), Color.CYAN);
                    g2d.setPaint(gp);
                    g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
                }
                super.paintComponent(g);
            }
        };
        txtNome.setFont(new Font("Serif", Font.BOLD, 12));

        fonte = txtNome.getFont();
        btnEnviar.setFont(fonte);
        btnEnviar.setForeground(Color.WHITE); // Define a cor do texto do botão
        btnEnviar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20)); // Adiciona um padding ao botão

        add(txtNome);
        add(txtEmail);
        add(btnEnviar);

        pack();
    }

    public static void main(String[] args) {
        new Tela().setVisible(true);
    }
}
