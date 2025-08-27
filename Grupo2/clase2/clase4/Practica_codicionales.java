package clase4;

import java.util.Scanner;

public class Practica_codicionales {
    public static void main(String[] args) {
        /*
         * Ejercio 4.1.a
         * 
         * 
         * entrada = angulo
         * proceso : validar si el angulo es igual a 90 grado
         * saliad: obtener el menaje si es o no s un angulo recto
         */
        int angulo = 80;

        if (angulo == 90) {

            System.out.println("el angulo es un angulo recto");

        } else {

            System.out.println("el angulo no es un angulo recto");

        }
        /*
         * ejercios 4.1.b
         * Si la temperatura es superior a 100 grados, visualizar el mensaje “por encima
         * del punto de ebullición del agua” sino visualizar el mensaje “por
         * debajo del punto de ebullición del agua”.
         * entrada = temperatura
         * ¿condicion = si temperatura es mayor 100 grados imprimer es por encima del
         * puento de ebullicion si no decir que esta pro debajo del peuntod e ebulicon
         */

        double temperatura = 105.6;

        if (temperatura > 100) {

            System.out.println("la temperatura esta por encima del punto de ebullicion.");

        } else {

            System.out.println("la temperatura esta por debajo del punto de ebullicion.");

        }
        /*
         * Si el número es positivo, sumar el número a total
         * de positivos, sino sumar al total de negativos.
         */
        int numero = 3;

        int total_postivos = 0;

        int total_negativos = 0;

        if (numero > 0) {

            total_postivos += numero;

            System.out.println("el nuemro " + numero + " es psitivo y se suma al total de positvos.");

        } else {

            total_negativos += numero;

            System.out.println(" el numero " + numero + "es negativo asi que suma al total de nuemros negativos ");

        }

        System.out.println("total de positvos son : " + total_postivos);
        System.out.println(" el total de nuemro negativos son : " + total_negativos);

        Scanner scanner = new Scanner(System.in);
        int x = 4;
        int y = 2;
        int z = 22;

        if (x > y && z < 20) {

            System.out.println("las condiciones se cumplen .");

            System.out.println("Introduce un valor para 'p':");

            int p = scanner.nextInt();

            System.out.println("el valor de p es " + p);

        } else {

            System.out.println("Las condiciones no se cumplen para asignarle un valor a p.");

        }
        scanner.close();

        /*
         * Si distancia es mayor que 20 y menos que 35,
         * leer un valor para tiempo.
         */
        Scanner scanner2 = new Scanner(System.in);

        int distancia = 25;

        if (distancia > 20 && distancia < 35) {

            System.out.println("cumple la condicion para darle unvalor a tiempo");

            System.out.println("ingresa el valor de tiempo :");

            int tiempo = scanner2.nextInt();

            System.out.println("el tiemo es de  :" + tiempo);

        } else {

            System.out.println("no cumple las condidciones para agregarle un timepo");
        }

        scanner2.close();

        /*
         * Ejercio 4.9 Un ángulo se considera agudo si es menor de 90
         * grados, obtuso si es mayor de 90 grados y recto si
         * es igual a 90 grados. Utilizando esta información,
         * escribir un algoritmo que acepte un ángulo en grados
         * y visualice el tipo de ángulo correspondiente a los
         * grados introducidos.
         * 
         * entrada : angulo
         * proceso: validr si el angulo esta entre los siguientes rangos
         * angulo < 90 , angulo > 90 angulo == 90
         * salida. mpstra si es un angulo agudo , obtuso o recto
         */

        int a = 90;

        if (a < 90) {

            System.out.println("angulo agudo.");

        } else if (a > 90) {

            System.out.println("angulo obtuso.");

        } else {

            System.out.println(" es un angulo recto.");

        }
    }

}
