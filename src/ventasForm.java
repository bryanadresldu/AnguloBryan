import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ventasForm extends JFrame {

    private JPanel ventasPanel;
    private JTextField cantidad_textField;
    private JTextField codigoBuscar_textField;
    private JLabel producto_cargar;
    private JLabel precio_cargar;
    private JButton calcularButton;
    private JLabel subtotal_calcular;
    private JLabel totalPagar_calcular;
    private JButton regresarAlMenuButton;


    public ventasForm() {
        setTitle(" Ventas");
        setContentPane(ventasPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        for (Producto p : ListaProductos.getListaProductos()) {
            String codigo=p.getCodigo();
            String nombre=p.getNombre();
            double precio=p.getPrecioUnitario();
            codigoBuscar_textField.setText(codigo);
            producto_cargar.setText(nombre);
            precio_cargar.setText(String.valueOf(precio));


        }

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int cantidad=Integer.parseInt(cantidad_textField.getText());
                double precio=Double.parseDouble(codigoBuscar_textField.getText());

                double subtotal=cantidad*precio;
                subtotal_calcular.setText(String.valueOf(subtotal));
                double totalPagar=subtotal*1.15;
                totalPagar_calcular.setText(String.valueOf(totalPagar));





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
