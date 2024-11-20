import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Tela extends JFrame implements ItemListener {

    private JTextField txtTexto = null;
    private Font fntItalico = null;
    private Font fntNormal = null;
    private Font fntNegrito = null;
    private Font fntItalicoNegrito = null;

    private JRadioButton radioItalico = null;
    private JRadioButton radioNegrito = null;
    private JRadioButton radioItalicoNegrito = null;
    private JRadioButton radioNormal = null;
    private ButtonGroup grupo = null;

    public Tela() {
        super("Tipo de Fontes");

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocation(500, 300);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        txtTexto = new JTextField("FEC-TI Johnny Michael Borges Carvalho", 35);
        radioNormal = new JRadioButton("Normal", true);
        radioItalico = new JRadioButton("Itálico", false);
        radioNegrito = new JRadioButton("Negrito", false);
        radioItalicoNegrito = new JRadioButton("Itálico e Negrito", false);

        fntNormal = new Font("Arial", Font.PLAIN, 12);
        fntItalico = new Font("Arial", Font.ITALIC, 12);
        fntNegrito = new Font("Arial", Font.BOLD, 12);
        fntItalicoNegrito = new Font("Arial", Font.BOLD | Font.ITALIC, 12);

        grupo = new ButtonGroup();
        grupo.add(radioNormal);
        grupo.add(radioItalico);
        grupo.add(radioNegrito);
        grupo.add(radioItalicoNegrito);

        /* A cada mudança do radio button, a fonte será alterada */
        radioNormal.addItemListener(this);
        radioItalico.addItemListener(this);
        radioNegrito.addItemListener(this);
        radioItalicoNegrito.addItemListener(this);

        contentPane.add(txtTexto);
        contentPane.add(radioNormal);
        contentPane.add(radioItalico);
        contentPane.add(radioNegrito);
        contentPane.add(radioItalicoNegrito);

        txtTexto.setFont(fntNormal);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == radioNormal) {
            txtTexto.setFont(fntNormal);
        } else if (e.getSource() == radioItalico) {
            txtTexto.setFont(fntItalico);
        } else if (e.getSource() == radioNegrito) {
            txtTexto.setFont(fntNegrito);
        } else if (e.getSource() == radioItalicoNegrito) {
            txtTexto.setFont(fntItalicoNegrito);
        }
    }
}
