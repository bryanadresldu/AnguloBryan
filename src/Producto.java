public class Producto {

    private  String codigo;
    private  String nombre;
    private  String detalle;
    private  double precioUnitario;
    private  int stock;

    public Producto(String codigo, String nombre, String detalle, double precioUnitario, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.detalle = detalle;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getStock() {
        return stock;
    }
}
