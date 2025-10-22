package Grupo2.clase12.trabajo;

public class Taxi extends Transporte {

    private String numeroLicencia;
    private double tarifaBase;
    private double tarifaPorKm;
    private String conductor;
    private boolean disponible;
    private double KmRecorridos;

    public Taxi(int capacidad, String tipo, String empresa, double velocidadMax, boolean enServicio,
            String numeroLicencia, double tarifaBase, double tarifaPorKm, String conductor, boolean disponible) {

        super(capacidad, tipo, empresa, velocidadMax, enServicio);

        this.numeroLicencia = numeroLicencia;
        this.tarifaBase = tarifaBase;
        this.tarifaPorKm = tarifaPorKm;
        this.conductor = conductor;
        this.disponible = disponible;
    }

    @Override
    public void describir() {
        System.out.println(" Taxi conducido por " + conductor +
                " (Licencia: " + numeroLicencia + "). " +
                "Tarifa base: $" + tarifaBase +
                ", por km: $" + tarifaPorKm +
                ". Empresa: " + empresa +
                ". Estado: " + (disponible ? "Disponible" : "Ocupado") + "kilometros recorridos : " + KmRecorridos);
    }

    @Override
    public double calcularTarifa(double km) {
        KmRecorridos += km;
        double total = tarifaBase + (tarifaPorKm * km);
        System.out.println("El taxi ha recorrido " + KmRecorridos + " km.");
        return total;
    }

    @Override
    public void cambiarDisponibilidad(boolean estado) {
        this.disponible = estado;
        System.out.println("El taxi ahora está " + (estado ? "disponible" : "ocupado"));
    }
}
