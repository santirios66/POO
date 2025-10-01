package Grupo2.clase9;

public class OperacionesMatematicas {

    // Atributos.
    private int n1;
    private int n2;
    private int options_operation;
    private double n3;

    // Constructor de la clase. permite inicializar la clase.
    // Tiene el mismo nombre de la clase.
    /*
        Firma del metodo constructor:
        visibilidad : publico
        nombre : OperacionesMatematicas.
        Cuantos parametros:4
        De que tipo son los parametros.
            Parametro 1 tipo ENTERO.
            Parametro 2 tipo ENTERO.
            Parametro 3 tipo ENTERO.
            Parametro 4 tipo DOUBLE.
    */ 
    public OperacionesMatematicas(int n1, int n2, int options_operation, double n3) {

        this.n1 = n1; // this signifIca una auto referencia al atributo de la clase.
        this.n2 = n2;
        this.options_operation = options_operation;
        this.n3 = n3;

    }

    // Metodos de operaciones básicas.
    public int sumar(){
        return n1 + n2;
    }
    
    public int resta(){
        return n1 - n2;
    }

    public int multi(){
        return n1 * n2;
    }

    public double dividir(){
        double result = 0.0;
        if (n2 == 0){
            result = 0;
        }else {
            result =  (double) n1 / n2; // conversión para que no se pierdan decimales
        }
        return result;
    }

    // Metodos de potencias
    public double elevado_cuadrado(){
        return Math.pow(n3, 2);
    }
    
    public double elevado_cubo(){
        return Math.pow(n3, 3);
    }

    public double elevadoN(double n){
        return Math.pow(n3, n);
    }

    // Metodos de raíces
    public double raizCuadrada(){
        return Math.sqrt(n3);
    }

    public double raizCubo(){
        return Math.cbrt(n3);
    }

    public double raizN(double n){
        return Math.pow(n3, 1.0 / n);
    }
}