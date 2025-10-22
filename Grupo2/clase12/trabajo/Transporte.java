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

    public void arrancar() {
        System.out.println("El " + tipo + " está arrancando.");
    }

    public void detener() {
        System.out.println("El " + tipo + " se ha detenido.");
    }
}
