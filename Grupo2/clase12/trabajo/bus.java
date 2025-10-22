package Grupo2.clase12.trabajo;

public class bus extends Transporte {

    private int numeroRuta;
    private boolean tieneWifi;
    private boolean tieneAire;
    private int numeroParadas;
    private String conductor;
    private double tarifa;

    public bus(int capacidad, String tipo, String empresa, double velocidad, boolean enServicio, int numeroRuta,
            boolean tieneWifi, boolean tieneAire, int numeroParadas, String conductor, double tarifa) {

        super(capacidad, tipo, empresa, velocidad, enServicio);
        this.numeroRuta = numeroRuta;
        this.tieneWifi = tieneWifi;
        this.tieneAire = tieneAire;
        this.numeroParadas = numeroParadas;
        this.conductor = conductor;
        this.tarifa = tarifa;
    }

    @Override
    public void describir() {
        System.out.println(" Bus de la empresa " + empresa +
                "\nRuta: " + numeroRuta +
                "\nConductor: " + conductor +
                "\nNúmero de paradas: " + numeroParadas +
                "\nCapacidad: " + capacidad +
                "\nVelocidad máx: " + velocidadMax + " km/h" +
                "\nEn servicio: " + (enServicio ? "Sí" : "No") +
                "\nWifi: " + (tieneWifi ? "Disponible" : "No disponible") +
                "\nAire acondicionado: " + (tieneAire ? "Sí" : "No") +
                "\nTarifa: $" + tarifa);
    }

    @Override
    public void iniciarRuta() {
        System.out.println("El bus ha iniciado su ruta");
    }

    @Override
    public void finalizarRuta() {
        System.out.println("El bus ha finalizado su ruta");
    }
}
