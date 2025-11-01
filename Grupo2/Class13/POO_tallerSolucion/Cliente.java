package Grupo2.Class13.POO_tallerSolucion;
import java.util.Date;

public class Cliente {

    private int cedula;
    private String nombre;
    private int telefono;
    private String correo;
    private String direccion;
    private Date fechaRegistro;

    public Cliente(int cedula, String nombre, String direccion, int telefono, String correo, Date fechaRegistro) {

        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.fechaRegistro = fechaRegistro;

    }

    // Getters 
    public int getCedula(){return cedula;}
    public String getNombre(){return nombre;}
    public int getTelefono(){return telefono;}
    public String getCorreo(){return correo;}
    public String getDireccion(){return direccion;}
    public Date getfechaRegistro(){return fechaRegistro;}


    // Setters 
    public void setCedula(int cedula){this.cedula = cedula;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setTelefono(int telefono){this.telefono = telefono;}
    public void setCorreo(String correo){this.correo = correo;}
    public void setDireccion(String direccion){this.direccion = direccion;}
    public void setFechaRegistro(Date fechaRegistro){this.fechaRegistro = fechaRegistro;}

    public void mostrarCliente(){ 
        System.out.println("Cliente: " + nombre + " (" + cedula + ")");
        System.out.println("Teléfono: " + telefono);
        System.out.println("Correo: " + correo);
        System.out.println("Dirección: " + direccion);
        System.out.println("Registrado el: " + fechaRegistro);
    }

}




