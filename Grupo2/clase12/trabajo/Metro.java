package Grupo2.clase12.trabajo;

public class Metro extends Transporte {

    private int lineas;
    private int estaciones;

    public Metro(int capacidad, String tipo, String empresa, double velocidad, boolean enServicio, int lineas,
            int estaciones) {

        // aqui lo que estoy haciendo es llamar al constructor del padre con super()
        super(capacidad, tipo, empresa, velocidad, enServicio);

        this.lineas = lineas;
        this.estaciones = estaciones;
    }

    @Override
    public void describir(){
        System.out.println("Metro de la empresa " + empresa +
                " con " + lineas + " líneas y " + estaciones + " estaciones." +
                " Capacidad: " + capacidad +
                ", Velocidad máx: " + velocidadMax + " km/h." +
                " En servicio: " + (enServicio ? "Sí" : "No"));
    }

    public void abrirPuertas(){
        System.out.println("El metro esta abriendo las puertas");
    }
    public void cerrarPuertas(){
        System.out.println("El metro esta cerrando sus puertas");
    }

}
