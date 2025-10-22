package Grupo2.clase12.trabajo;

public class ejecutarTransporte {
    
    public static void main(String[] args) {
        // aqui voy acrear los objetos de cada tipo de bus el metro y el taxi.
        bus bus001 = new bus(30, "bus", "Deoccidente", 80.0, true, 5, true, false, 20, "carlos", 5000);
        Metro metro = new Metro(200, "Metro", "Metro de medelin", 100.0, true, 3, 25);
        Taxi taxi = new Taxi(4, "Taxi", "Taxis Libres", 120.0, true, "TX-458", 4000, 1200, "santiago", true);


        System.out.println("=== Información de transportes ===");
        bus001.describir();
        metro.describir();
        taxi.describir();

        System.out.println("--------------------------------------");

        Transporte t1 = bus001;
        Transporte t2 = metro;
        Transporte t3 = taxi;

        System.out.println("=== Usando polimorfismo ===");
        t1.describir(); // ejecuta la versión del bus
        t2.describir(); // ejecuta la del metro
        t3.describir(); // ejecuta la del taxi

        System.out.println("--------------------------------------");

        bus001.iniciarRuta();
        metro.abrirPuertas();
        taxi.cambiarDisponibilidad(false);

        System.out.println("Programa finalizado correctamente ");
    }

}
