package Grupo2.Clase7;

public class Person {

    // Los Atributos siempre deben de ser privados.

    // Atributos.

    private int Identificacion;
    private String Nombre;
    private String Apellidos;
    private int Edad;
    private double Estatura;
    private double Peso;

    // Metodo constructor de la clase se reconcoe por que tine el mismo nombre de la
    // clase.
    // El constructor de la clase me permite inicializar laclase
    // la palabra reservada "this " se utiliza para autoreferenciar el atributo de
    // la clase.
    public Person(int Identificacion, String Nombre, String Apellidos, int Edad, double Estatura, double Peso) {
        this.Identificacion = Identificacion;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.Estatura = Estatura;
        this.Peso = Peso;
    }
    // Los metodos son siempre publicos.
    // Metodos.

    public static void Caminar() {
        System.out.println("caminar");
    }

    public static boolean Jugar() {
        return true;
    }

    public static void Comer() {
        System.out.println("Comiendo");
    }

    public static String Estudiar(String carrera) {
        return "Usted esta estudiando: " + carrera;
    }

    // Tarea consultar sobre el metodo toString.

    // Geters and Setters

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.Identificacion = identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        this.Apellidos = apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        this.Edad = edad;
    }

    public double getEstatura() {
        return Estatura;
    }

    public void setEstatura(double estatura) {
        this.Estatura = estatura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        this.Peso = peso;
    }

}