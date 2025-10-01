package Grupo2.clase9;

public class EjecutarOpeMatGrupo2 {
    public static void main(String[] args) {

        OperacionesMatematicas objOp = new OperacionesMatematicas(8, 6);

        System.out.println("El resultado de la suma es: "+ objOp.sumar());
        System.out.println("el resultado de la resta: " + objOp.resta());
        System.out.println("El resultado de la multiplicacion es: " + objOp.multi());
        System.out.println("El resultado de la division es: " + objOp.dividir());
    }
}
