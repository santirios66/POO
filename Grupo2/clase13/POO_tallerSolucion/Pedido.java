package Grupo2.clase13.POO_tallerSolucion;

public class Pedido {
    
    private Cliente cliente;
    private Producto[] productos;
    private Date fecha;
    private int numeroTarjectaCredito;

    public Pedido(Cliente cliente, Producto[] productos,Date fecha , int numeroTarjectaCredito){

        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numeroTarjectaCredito = numeroTarjectaCredito;
    }

    public Cliente getcliente(){
        return cliente;
    }

    class Producto[]  getProductos(){
        return productos;
    }

    class fecha getFecha(){

        return fecha;
    }

    class numeroTarjectaCredito getNumeroTarjectaCredito(){
        return numeroTarjectaCredito;
    }

    public void toSring(){
        System.out.println("Cliente : " +  cliente.getcliente());
        System.out.println("Fecha : " +  fecha);
        System.out.println("Productos : "));
        for(Producto p : productos){
            System.out.println("- " + p);
        }
    }

}
