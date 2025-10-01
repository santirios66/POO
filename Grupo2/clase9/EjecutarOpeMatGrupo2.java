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

        System.out.println("Digite el numero deseado para las operaciones : ");
        int d = sc.nextInt();
        
        // Menú de opciones
        System.out.println("Elige la operacion que desea realizar:");
        System.out.println("1: elevar al cuadrado");
        System.out.println("2: elevar al cubo");
        System.out.println("3: elevar ala n");
        System.out.println("4: raiz cuadrada");
        System.out.println("5: raiz al cubo");
        System.out.println("6: raiz de n");
        int c = sc.nextInt();

        /*
         * para leer enteros : nextInt() o nextLong()
         * para leer reales : nextDouble() o nextFloat()
         * para leer cadenas : next() o nextLine()
         * para leer booleanos : nextBoolean()
         */

        OperacionesMatematicas objOp = new OperacionesMatematicas(a, b, c, d);

        // Operaciones básicas
        System.out.println("El resultado de la suma es: " + objOp.sumar());
        System.out.println("El resultado de la resta: " + objOp.resta());
        System.out.println("El resultado de la multiplicacion es: " + objOp.multi());
        System.out.println("El resultado de la division es: " + objOp.dividir());

        // Operaciones de potencia y raíz con switch
        switch (c) {
            case 1:
                System.out.println("Su numero elevado al cuadrado es : " + objOp.elevado_cuadrado());
                break;
            case 2:
                System.out.println("Su numero elevado al cubo es : " + objOp.elevado_cubo());
                break;
            case 3:
                System.out.println("Digite el numero n a elevar su digitado anteriormente....");
                int n = sc.nextInt();
                System.out.println("Su numero " + d + " elevado a la " + n + " es : " + objOp.elevadoN(n));
                break;
            case 4:
                System.out.println("Resultado: " + objOp.raizCuadrada());
                break;
            case 5:
                System.out.println("Resultado: " + objOp.raizCubo());
                break;
            case 6:
                System.out.print("Digite el valor de n para la raíz: ");
                int raiz = sc.nextInt();
                System.out.println("La raiz " + raiz + " de " + d + " es: " + objOp.raizN(raiz));
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        sc.close();

        /*
         * Tarea: implementar lo metodos
         * -elevar al cuadrado elevar al cubo
         * -elevar a la n
         * - sacar la raiz cuadrada
         * - sacar la raiz cubica
         * -sacar la raiz n
         * -todo lo anterior con un menu de opcion.
         */

    }
}