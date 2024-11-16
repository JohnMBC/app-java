
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.plaf.DimensionUIResource;

public class Tela extends JFrame {
    public Tela() {
        super("Title Layout");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new DimensionUIResource(400, 200));
        getContentPane().setLayout(new FlowLayout());
        for (int i = 0; i < 6; i++) {
            add(new JButton("Botão -" + i));
        }
        pack();

        // Obtive o painel setei o layout com uma instância do FlowLayout
    }

}
