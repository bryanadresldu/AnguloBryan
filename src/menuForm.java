import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuForm extends JFrame {
    private JPanel menuPanel;
    private JButton registroButton;
    private JButton ventasButton;
    private JButton verProductosButton;

    public menuForm () {
        setTitle("Menu");
        setContentPane(menuPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);


        registroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new registroForm();
                dispose();
            }
        });


        ventasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ventasForm();
                dispose();
            }
        });


        verProductosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new productosForm();
                dispose();
            }
        });
    }
}
