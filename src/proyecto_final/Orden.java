package proyecto_final;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Orden {
    int idOrden;
    int contadorProductos;
    Producto productos[];
    /*
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            Producto producto = this.productos[i];
            total += producto.getPrecio(); // SUMA TODOS LOS PRECIOS
        }
        return total;
    }*/

    
    private Calendar fechaCreacion = Calendar.getInstance();
    private Cliente cliente;
    private List<Item> lstItem = new ArrayList<>();
    private double montoTotal;
    private double totalPagar;

    public Orden(Cliente cliente, double montoTotal, double totalPagar) {
        this.cliente = cliente;
        this.montoTotal = montoTotal;
        this.totalPagar = totalPagar;
    }

    public Orden(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public Date getFechaCreacion() {
        return fechaCreacion.getTime();
    }

    public void setFechaCreacion(Calendar fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getLstItem() {
        return lstItem;
    }

    public void setLstItem(List<Item> lstItem) {
        this.lstItem = lstItem;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public void agregarItem(Item item) {
        this.lstItem.add(item);

    }

    StringBuffer sb = new StringBuffer();

    @Override
    public String toString() {

        sb.append("\t***********************************Proyecto***********************************\n");
        sb.append("\t  Fecha:       " + this.fechaCreacion.getTime() + "\n");
        sb.append("\t  Cliente:     " + this.getCliente().getNombre() + "\n");
        sb.append("\t*********************************************************************************\n");
        sb.append("\t tCant:" +  "Tipo producto:\t" + "\tPrecio:\t" + "\tImpuesto:" + "\tSubtotal:\n");
        for (Item item : this.lstItem) {
            this.montoTotal = this.montoTotal + item.calcularSubtotal();
            this.totalPagar = (this.montoTotal + (this.montoTotal * item.getProducto().getImpuesto()));
            sb.append("\t " + item.getCantidad() + "\t " + item.getProducto().getTipoProducto()+ "\t" + item.getProducto().getPrecio() + "\t\t" + item.calcularSubtotal() + "\n");
        }
        sb.append("\t" + "\n");
        sb.append("\t\n");
        sb.append("\t****************************************************************************************************************************\n");
        sb.append("\t\t\t\tSubtotal:\t     " + this.montoTotal + "\n");
        //sb.append("\t\t\t\tImpuesto:\t     " + this.calcularImpuesto() + "%\n");
        sb.append("\t\t\t\tTotal:\t\t     " + this.totalPagar  + "\n");
        sb.append("\t****************************************************************************************************************************\n");
       
        sb.append("\t****************************************************************************************************************************\n");

        return sb.toString();
    }
    
}
