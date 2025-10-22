package Grupo2.clase12.trabajo;

public class ejecutarTransporte {

    public static void main(String[] args) {
        // aqui voy acrear los objetos de cada tipo de bus el metro y el taxi.
        Transporte bus001 = new bus(30, "bus", "Deoccidente", 80.0, true, 5, true, false, 20, "carlos", 5000);
        Transporte metro = new Metro(200, "Metro", "Metro de medelin", 100.0, true, 3, 25);
        Transporte taxi = new Taxi(4, "Taxi", "Taxis Libres", 120.0, true, "TX-458", 4000, 1200, "santiago", true);
        Transporte taxi2 = new Taxi(4, "taxi", "Taxi Libres", 120.0, true, "PD-556", 4000, 1200, "Victor", true);

        System.out.println("=== Información de transportes ===");
        bus001.describir();
        metro.describir();
        taxi.describir();

        System.out.println("--------------------------------------");

        bus001.iniciarRuta();
        metro.abrirPuertas();
        taxi.cambiarDisponibilidad(false);

        System.out.println("--------------------------------------");
        taxi2.describir();
        double precio1 = taxi2.calcularTarifa(10); // aqui estoy incializando el emtdo de calcular tarifa y ala vez
                                                   // asignandole valor a kmrecorridos.
        System.out.println("El total del viaje : " + precio1);

        taxi2.describir();

        System.out.println("Programa finalizado correctamente ");
    }

}
