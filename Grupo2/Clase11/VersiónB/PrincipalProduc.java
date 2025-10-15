package Grupo2.Clase11.VersiónB;

public class PrincipalProduc {
    public static void main(String[] args) {

        Producto p1 = new Producto("A12345", "Audifonos", 3, 85000);

        System.out.println(p1);
        System.out.println("Subtotal: " + p1.calcularSubtotal());
        System.out.println("Total con 10% de descuento: " + p1.aplicarDescuento(10));

        p1.incrementarCantidad(2);
        System.out.println(p1);
    }
}
