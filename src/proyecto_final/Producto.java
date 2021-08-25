package proyecto_final;

public class Producto {

    String descripcion;
    String tipoProducto;
    double impuesto;
    double peso;
    int precio;

    public Producto() {
    }

    public Producto(String tipoProducto, double peso, int precio, double impuesto, String descripcion) {
        this.tipoProducto = tipoProducto;
        this.peso = peso;
        this.precio = precio;
        this.impuesto = impuesto;
        this.descripcion = descripcion;
    }
    
    //metodo para calcular el impuesto
    public double calcularImpuesto() {
        double impuestoTotal = this.getImpuesto() * 100;
        return impuestoTotal;
    }
    
    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
