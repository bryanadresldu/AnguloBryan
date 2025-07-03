import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class registroForm extends JFrame {
    private JPanel registroPanel;
    private JTextField codigo_textField;
    private JTextField nombre_textField;
    private JTextField detalle_textField;
    private JTextField precioUnitario_textField;
    private JTextField stock_textField;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JButton regresarAlMenuButton;

    public registroForm() {
        setTitle(" Registro");
        setContentPane(registroPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                if (codigo_textField.getText().isEmpty()||nombre_textField.getText().isEmpty()||detalle_textField.getText().isEmpty()||precioUnitario_textField.getText().isEmpty()||stock_textField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"ERROR: Ningún campo debe estar vacío");


                } else {

                    if(Double.parseDouble(precioUnitario_textField.getText())>9999){
                        JOptionPane.showMessageDialog(null,"ERROR: El precio unitario debe tener como máximo 4 cifras.");
                    }else if (Integer.parseInt(stock_textField.getText())>999) {
                        JOptionPane.showMessageDialog(null,"ERROR: El stock debe tener como máximo 3 cifras.");
                    }else {

                        String codigo = codigo_textField.getText();
                        String nombre = nombre_textField.getText();
                        String detalle = detalle_textField.getText();
                        double precioUnitario = Double.parseDouble(precioUnitario_textField.getText());
                        int stock = Integer.parseInt(stock_textField.getText());

                        JOptionPane.showMessageDialog(null, "Producto Guardado");
                        Producto producto = new Producto(codigo, nombre, detalle, precioUnitario, stock);
                        ListaProductos.actulizarLista(producto);

                        //Limpiando
                        codigo_textField.setText("");
                        nombre_textField.setText("");
                        detalle_textField.setText("");
                        precioUnitario_textField.setText("");
                        stock_textField.setText("");
                    }

                }
            }
        });

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Limpiando
                codigo_textField.setText("");
                nombre_textField.setText("");
                detalle_textField.setText("");
                precioUnitario_textField.setText("");
                stock_textField.setText("");

            }
        });
        regresarAlMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new menuForm();
                dispose();
            }
        });
    }


}
