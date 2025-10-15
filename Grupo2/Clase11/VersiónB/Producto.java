package Grupo2.Clase11.VersiónB;

public class Producto {

    // atributos privados

    private String codigo;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    // constructor por defecto
    public Producto() {
        codigo = "0000";
        descripcion = "Sin descripción";
        cantidad = 1;
        precioUnitario = 0.0;
    }

    // Constructor parametrizado con validaciones
    public Producto(String c, String d, int cant, double precio) {
        if (c != null && !c.isEmpty() &&
                d != null && !d.isEmpty() &&
                cant >= 1 && precio >= 0) {

            this.codigo = c;
            this.descripcion = d;
            this.cantidad = cant;
            this.precioUnitario = precio;

        } else {
            System.out.println("Datos inválidos. Se asignan valores por defecto.");
            codigo = "0000";
            descripcion = "Sin descripción";
            cantidad = 1;
            precioUnitario = 0.0;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.isEmpty()) {
            this.codigo = codigo;
        } else {
            System.out.println("Código inválido.");
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion != null && !descripcion.isEmpty()) {
            this.descripcion = descripcion;
        } else {
            System.out.println("Descripción inválida.");
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 1) {
            this.cantidad = cantidad;
        } else {
            System.out.println("La cantidad debe ser mayor o igual a 1.");
        }
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario >= 0) {
            this.precioUnitario = precioUnitario;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }

    //  Método para calcular el subtotal
    public double calcularSubtotal() {
        return cantidad * precioUnitario;
    }

    //  Método para aplicar descuento (0% - 50%)
    public double aplicarDescuento(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 50) {
            double descuento = (porcentaje / 100) * calcularSubtotal();
            return calcularSubtotal() - descuento;
        } else {
            System.out.println("Descuento inválido. Debe estar entre 0 y 50%.");
            return calcularSubtotal();
        }
    }

    // Método para incrementar cantidad
    public void incrementarCantidad(int valor) {
        if (valor > 0) {
            cantidad += valor;
            System.out.println("Cantidad aumentada. Nueva cantidad: " + cantidad);
        } else {
            System.out.println("El incremento debe ser mayor a 0.");
        }
    }

    // 🧾 Método toString para mostrar información
    public String toString() {
        return "Código: " + codigo +
                "\nDescripción: " + descripcion +
                "\nCantidad: " + cantidad +
                "\nPrecio Unitario: " + precioUnitario +
                "\nSubtotal: " + calcularSubtotal();
    }
}
