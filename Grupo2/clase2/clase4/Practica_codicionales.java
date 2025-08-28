package clase4;

import java.util.Scanner;

public class Practica_codicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
         * 4.1.c
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

        /*
         * Si x es mayor que y, y z es menor que 20, leer
         * un valor para p.
         */

        Scanner scanner = new Scanner(System.in);
        int x = 4;
        int y = 2;
        int z = 22;

        if (x > y && z < 20) {

            System.out.println("las condiciones se cumplen .");

            System.out.println("Introduce un valor para 'p':");

            int p = sc.nextInt();

            System.out.println("el valor de p es " + p);

        } else {

            System.out.println("Las condiciones no se cumplen para asignarle un valor a p.");

        }

        /*
         * 4.1.d
         * Si distancia es mayor que 20 y menos que 35,
         * leer un valor para tiempo.
         */

        int distancia = 25;

        if (distancia > 20 && distancia < 35) {

            System.out.println("cumple la condicion para darle unvalor a tiempo");

            System.out.println("ingresa el valor de tiempo :");

            int tiempo = sc.nextInt();

            System.out.println("el tiemo es de  : " + tiempo);

        } else {

            System.out.println("no cumple las condidciones para agregarle un timepo");
        }

        /*
         * 4.2. Escribir un programa que solicite al usuario introducir
         * dos números. Si el primer número introducido es mayor que el segundo número,
         * el programa debe imprimir el mensaje El primer número es el mayor,
         * en caso contrario el programa debe imprimir el mensaje El primer número es el
         * más pequeño.
         * Considerar el caso de que ambos números sean iguales e imprimir el
         * correspondiente mensaje.
         */
        // primer numero ingresado

        System.out.println("porfvaor ingrese el nuemro 1:");
        int n1 = sc.nextInt();

        // segundo nuemro ingresado

        System.out.println("porfvaor ingrese el numero 2:");
        int n2 = sc.nextInt();

        if (n1 > n2) {

            System.out.println("el primer numero : " + n1 + " es mayor que el segundo numero : " + n2);

        } else if (n1 < n2) {

            System.out.println("el segundo nuemro : " + n2 + " es mayor que el primer numero : " + n1);

        } else {

            System.out.println("Ambos numeros son iguales ");

        }

        /*
         * 4.3. Dados tres números deducir cuál es el central.
         */
        int n_1 = 8;
        int n_2 = 5;
        int n_3 = 6;

        if ((n_1 > n_2 && n_1 < n_3) || (n_1 < n_2 && n_1 > n_3)) {

            System.out.println("el primer nuemro es el cetral  : " + n_1);

        } else if ((n_2 > n_1 && n_2 < n_3) || (n_2 < n_1 && n_2 > n_3)) {

            System.out.println("el segundo nuemro es el central :  " + n_2);

        } else if ((n_3 > n_1 && n_3 < n_2) || (n_3 < n_1 && n_3 > n_2)) {

            System.out.println(" el tercer numero es el central : " + n_3);

        } else {
            System.out.println("no hay numero central");
        }

        /*
         * 4.4. Calcular la raíz cuadrada de un número y escribir su
         * resultado. Considerando el caso en que el número sea
         * negativo.
         */
        double numero_1 = -14;
        double raiz_cuadrada;

        if (numero_1 < 0) {

            System.out.println("no se puede calcualr la raiz cuadrada de un nuemro menor a cero");

        } else {
            raiz_cuadrada = Math.sqrt(numero_1);
            System.out.println("la raiz cuadrada de " + numero_1 + "es : " + raiz_cuadrada);
        }

        /*
         * 4.5. Escribir un programa que lea un número e
         * indique si es par o impar.
         */

        int numero_par_or_impar = 6;

        if (numero_par_or_impar % 2 == 0) {

            System.out.println(" el numero " + numero_par_or_impar + " es un numero par");

        } else {

            System.out.println("el numero " + numero_par_or_impar + " es un nuemro impar");

        }
        /*
         * 4.6. Diseñar un programa en el que a partir de una fecha
         * introducida por teclado con el formato DIA, MES,
         * AÑO se obtenga la fecha del día siguiente.
         * 
         */
        int dia = 28;
        int mes = 2;
        int año = 2024;

        int diasEnMes;

       
        // Determinar los días del mes con if
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            diasEnMes = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diasEnMes = 30;
        } else {
            // mes == 2
            boolean esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
            if (esBisiesto) {
                diasEnMes = 29;
            } else {
                diasEnMes = 28;
            }
        }

        // Calcular el día siguiente
        if (dia < diasEnMes) {
            dia = dia + 1;
        } else {
            dia = 1;
            if (mes == 12) {
                mes = 1;
                año = año + 1;
            } else {
                mes = mes + 1;
            }
        }
        System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + año);

        /*
         * Se desea realizar una estadística de los pesos de los
         * alumnos de un colegio de acuerdo a la siguiente tabla:
         * Alumnos de menos de 40 kg.
         * Alumnos entre 40 y 50 kg.
         * Alumnos de más de 50 kg y menos de 60 kg.
         * Alumnos de más o igual a 60 kg si se peude hacer con el if.
         */
        int peso = 55;
        if (peso < 40) {

            System.out.println("alumno de menos de 40 kg.");

        } else if (peso >= 40 && peso < 50) {

            System.out.println("alumno entre 40 y 50 kg.");

        } else if (peso >= 50 && peso < 60) {

            System.out.println("alumno de mas de 50 kg y menos de 60 kg.");

        } else {

            System.out.println("alumno de mas o igual a 60 kg.");

        }
        /*
         * Realizar un algoritmo que averigüe si dados dos números introducidos por
         * teclado uno es divisor del otro.
         */
        int num1 = 20;
        int num2 = 5;
        if (num1 % num2 == 0) {
            System.out.println("el numero " + num2 + " es divisor de " + num1);
        } else if (num2 % num1 == 0) {
            System.out.println("el numero " + num1 + " es divisor de " + num2);
        } else {
            System.out.println("ningun numero es divisor del otro");
        }

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
        /*
         * 4.10. El sistema de calificación americano (de Estados
         * Unidos) se suele calcular de acuerdo al siguiente
         * cuadro:
         */

        int calificacion = 90;
        if (calificacion >= 90 && calificacion <= 100) {
            System.out.println("su nota es A .");
        } else if (calificacion < 90 && calificacion >= 80) {
            System.out.println("su nota es B ");
        } else if (calificacion < 80 && calificacion >= 70) {
            System.out.println(("su nata es C"));
        } else if (calificacion < 70 && calificacion >= 60) {
            System.out.println("su nota es D");
        } else {
            System.out.println("su califciacion es menor que 69 entonces su nota es F");
        }

        /*
         * Escribir un programa que seleccione la operación
         * aritmética a ejecutar entre dos números dependiendo
         * del valor de una variable denominada seleccionOp.
         * 
         */

        int nume_1 = 6;
        int nume_2 = 2;
        System.out.println("por favor ingrese la operacion artimetica que desea realizar");
        String operacion = sc.next();

        if (operacion.equals("+")) {

            System.out.println("la suma entre  " + nume_1 + " y " + nume_2 + " es : " + (nume_1 + nume_2));

        } else if (operacion.equals("-")) {

            System.out.println("la resta entre " + nume_1 + " y " + nume_2 + " es : " + (nume_1 - nume_2));

        } else if (operacion.equals("/")) {
            System.out.println("la division entre " + nume_1 + " y " + nume_2 + " es : " + (nume_1 / nume_2));
        } else if (operacion.equals("*")) {

            System.out.println("la multiplicacion entre " + nume_1 + " y " + nume_2 + " es : " + (nume_1 * nume_2));

        } else {
            System.out.println("operacion no valida");
        }
        /*
         * 4.12. Escribir un programa que acepte dos números reales
         * de un usuario y un código de selección. Si el código
         * introducido de selección es 1, entonces el programa
         * suma los dos números introducidos previamente y se
         * visualiza el resultado; si el código de selección es 2,
         * los números deben ser multiplicados y visualizado
         * el resultado; y si el código seleccionado es 3, el primer número se debe
         * dividir por el segundo número
         * y visualizarse el resultado.
         */

        System.out.print("usuario por favor ingrese el primer numero entero o real : "); // Aqui yo le quite ln al print
                                                                                         // ya que sirve para que el
                                                                                         // scanner quede para ingresar
                                                                                         // en esa mismas linea donde se
                                                                                         // pide el numero
        float numero1 = sc.nextFloat();
        System.out.print("usuario por favor ingrese el segundo numero entero o real : ");
        float numero2 = sc.nextFloat();

        System.out.print(
                "usuario ingrese: ------- '1': suma ------- '2': multiplicacion ---------- '3': division entre numero 1 y numero 2\nno se permite otro numero difenrente a 1, 2  y 3 : ");
        String operacion_matematica = sc.next();

        if (operacion_matematica.equals("1")) {
            System.out.printf("su desicion fue '1' suma entre %.2f y %.2f . resultado es %.2f: ", numero1, numero2,
                    (numero1 + numero2));
        } else if (operacion_matematica.equals("2")) {
            System.out.printf("Su decisión fue '2' multiplicación entre %.2f y %.2f. Resultado es: %.2f%n",
                    numero1, numero2, (numero1 * numero2));
        } else if (operacion_matematica.equals("3")) {
            System.out.printf("Su decisión fue '3' división entre %.2f y %.2f. Resultado es: %.2f%n",
                    numero1, numero2, (numero1 / numero2));
        }

    }

}