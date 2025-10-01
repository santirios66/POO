package Grupo2.clase9;

import java.util.Scanner;

public class EjecutarOpeMatGrupo2 {
    public static void main(String[] args) {

        /* clase Scanner para leer datos del teclado */
        Scanner sc = new Scanner(System.in);

        System.out.println("digite el primer numero...");
        int a = sc.nextInt();// con el objeto sc llamamos los metodos de la clase scanner, por ejemplo
                             // sc.nextInt()

        System.out.println("digite el segundo  numero...");
        int b = sc.nextInt();

        /*
         * para leer enteros : nextInt() o nextLong()
         * para leer reales : nextDouble() o nextFloat()
         * para leer cadenas : next() o nextLine()
         * para leer booleanos : nextBoolean()
         */

        OperacionesMatematicas objOp = new OperacionesMatematicas(a, b);

        System.out.println("El resultado de la suma es: " + objOp.sumar());
        System.out.println("el resultado de la resta: " + objOp.resta());
        System.out.println("El resultado de la multiplicacion es: " + objOp.multi());
        System.out.println("El resultado de la division es: " + objOp.dividir());

        sc.close();
    }
}
