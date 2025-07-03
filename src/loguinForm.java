import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loguinForm extends JFrame{
    private JPanel loginPanel;
    private JTextField usuario_textField;
    private JPasswordField contrasenia_passwordField;
    private JButton limpiarButton;
    private JButton accesoButton;

    public static void main(String[] args) {
        new loguinForm();
    }

    public loguinForm(){
        setTitle(" Loguin");
        setContentPane(loginPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);


        accesoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String usuario = usuario_textField.getText().trim();
                String contrasenia = String.valueOf(contrasenia_passwordField.getPassword());
                if (usuario.isEmpty() || contrasenia.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ERROR: Usuario o contrasenia vacios");

                } else{
                    if (usuario.equals("angulo") && contrasenia.equals("123")) {
                        new menuForm();
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR: Usuario o contrasenia ingresados incorrectamente");
                    }
                }

            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usuario_textField.setText("");
                contrasenia_passwordField.setText("");
            }
        });
    }
}
