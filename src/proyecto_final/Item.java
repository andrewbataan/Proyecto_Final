package proyecto_final;

public class Item {

    private int cantidad;
    private Producto producto;
    private double subTotal;

    public Item(int cantidad, Producto producto, double subTotal) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.subTotal = subTotal;
    }

    public Item(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;

    }
    
    public double calcularSubtotal() {
        double subTotal = (this.getProducto().getPrecio()*this.cantidad);
        return subTotal;
    }

}
