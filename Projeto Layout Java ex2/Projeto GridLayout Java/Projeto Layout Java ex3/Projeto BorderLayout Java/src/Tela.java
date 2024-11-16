
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Tela extends JFrame {
    private BorderLayout layout = null;

    public Tela() {
        super("Testando BorderLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setPreferredSize(new Dimension(400, 200));

        layout = new BorderLayout();

        setLayout(layout);

        layout.setHgap(5);
        layout.setVgap(5);

        add(new JButton("Norte(componente)"), BorderLayout.NORTH);
        add(new JButton("Sul  (componente)"),
                BorderLayout.SOUTH);
        add(new JButton("Leste(componente)"), BorderLayout.EAST);
        add(new JButton("Oeste(componente)"), BorderLayout.WEST);
        add(new JButton("Centro(componente)"), BorderLayout.CENTER);
        
        pack();

    }

}
