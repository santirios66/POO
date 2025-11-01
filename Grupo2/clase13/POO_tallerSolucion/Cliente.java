package Grupo2.clase13.POO_tallerSolucion;

import java.util.Date;

public class Cliente {

    private int cedula;
    private String nombre;
    private int telefono;
    private String correo;
    private String dirreccion;
    private Date fechaRegistro;

    public Cliente(int cedula, String nombre, String dirreccion, int telefono, String correo, Date fechaRegistro) {

        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.dirreccion = dirreccion;
        this.fechaRegistro = fechaRegistro;

    }

    

}
