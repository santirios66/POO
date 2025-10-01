package Grupo2.clase9;

public class OperacionesMatematicas {

    // Atributos.
    private int n1;
    private int n2;

    // Constructor de la clase. permite inicializar la clase.
    // Tiene el mismo nombre de la clase.
    /*irma del emtodo constructor.
    visibilidad : publico
    nombre : OperacionesMatematicas.
    Cuantos parametros:2
    De que tipo son los parametros.
        Parametro 1 tipo ENTERO.
        Parametro 2 tipo ENTERO.
    */ 
    public OperacionesMatematicas(int n1, int n2) {

        this.n1 = n1; // this signifIca una auto referencia al atributo de la clase.
        this.n2 = n2;

    }

    // Metodos.
    public int sumar(){
        return n1 + n2;
    }
    
}