package Grupo2.clase12.trabajo;

public class Transporte {

    protected int capacidad;
    protected String tipo;
    protected String empresa;
    protected double velocidadMax;
    protected boolean enServicio;

    public Transporte(int capacidad, String tipo, String empresa, double velocidadMax, boolean enServicio) {

        this.capacidad = capacidad;
        this.tipo = tipo;
        this.empresa = empresa;
        this.velocidadMax = velocidadMax;
        this.enServicio = enServicio;
    }

    public void describir() {
        System.out.println("Transporte tipo: " + tipo +
                ", capacidad: " + capacidad +
                ", empresa: " + empresa +
                ", velocidad máx: " + velocidadMax + " km/h" +
                ", en servicio: " + (enServicio ? "Sí" : "No"));
    }

    public void iniciarRuta() {
        System.out.println("Este transporte no tiene ruta específica.");
    }

    public void finalizarRuta() {
        System.out.println("Finalizando ruta genérica del transporte.");
    }


    public double calcularTarifa(double km) {
        System.out.println("Este transporte no calcula tarifa.");
        return 0.0;
    }
    
    public void abrirPuertas() {
        System.out.println("Este transporte no tiene puertas configuradas.");
    }

    public void cerrarPuertas() {
        System.out.println("El metro esta cerrando sus puertas");
    }

    public void cambiarDisponibilidad(boolean estado) {
        System.out.println("Este transporte no maneja disponibilidad.");
    }

}
