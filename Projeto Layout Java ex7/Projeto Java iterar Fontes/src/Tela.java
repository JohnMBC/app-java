
import java.awt.GraphicsEnvironment;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.FlowLayout;

public class Tela extends JFrame {

    public Tela() {
        super("Lista Fontes");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(200, 300);

        String listaFontes[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        int i = listaFontes.length;
        getContentPane().setLayout(new FlowLayout());
        JLabel jb;
        Font f;

        for (int j = 0; j < i; j++) {
            jb = new JLabel("<<" + listaFontes[j] + " >> ");
            f = new Font(listaFontes[j], Font.PLAIN, 20);
            jb.setFont(f);
            add(jb);
        }
        pack();
    }

}