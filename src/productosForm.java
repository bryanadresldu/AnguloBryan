import javax.sound.sampled.Port;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class productosForm extends JFrame {

    private JPanel productosPanel;
    private JButton regresarButton;
    private JLabel codigo_cargar;
    private JLabel nombre_cargar;
    private JLabel detalle_cargar;
    private JLabel stock_cargar;

    public productosForm() {
        setTitle(" Productos");
        setContentPane(productosPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        for (Producto p : ListaProductos.getListaProductos()) {
            String codigo=p.getCodigo();
            String nombre=p.getNombre();
            String detalle=p.getDetalle();
            int stock=p.getStock();
            codigo_cargar.setText(codigo);
            nombre_cargar.setText(nombre);
            detalle_cargar.setText(detalle);
            stock_cargar.setText(String.valueOf(stock));
        }


        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new menuForm();
                dispose();
            }
        });
    }
}
