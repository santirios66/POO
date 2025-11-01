package Grupo2.Class13.POO_tallerSolucion;

import java.util.Date;

public class Pedido {

    private Cliente cliente;
    private Producto[] productos;
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, Producto[] productos, Date fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public Cliente getCliente() { return cliente; }
    public Producto[] getProductos() { return productos; }
    public Date getFecha() { return fecha; }
    public int getNumeroTarjetaCredito() { return numeroTarjetaCredito; }

    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public void setProductos(Producto[] productos) { this.productos = productos; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
    public void setNumeroTarjetaCredito(int numeroTarjetaCredito) { this.numeroTarjetaCredito = numeroTarjetaCredito; }

    public void mostrarPedido() {
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Fecha: " + fecha);
        System.out.println("Productos:");
        for (Producto p : productos) {
            p.mostrarProducto();
            System.out.println("-------------------");
        }
    }
}
