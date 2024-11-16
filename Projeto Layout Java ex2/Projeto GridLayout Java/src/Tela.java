
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Tela extends JFrame {

    private GridLayout layout = null;

    public Tela() {
        super("Testando GridLayout");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 400));
        layout = new GridLayout(3, 3);
        getContentPane().setLayout(layout);

        for (int i = 0; i < 10; i++) {
            add(new JButton("Button -" + i));
        }
        pack();

    }
}
