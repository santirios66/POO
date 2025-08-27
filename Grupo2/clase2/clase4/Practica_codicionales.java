package clase4;

public class Practica_codicionales {
    public static void main(String[] args) {
        /*
        Ejercio 4.1.a


        entrada = angulo 
        proceso : validar si el angulo es igual a 90 grado
        saliad: obtener el menaje si es o no s un angulo recto 
        */
    int  angulo = 80 ;

    if(angulo == 90){

        System.out.println("el angulo es un angulo recto");

    }else {

        System.out.println("el angulo no es un angulo recto");

    }
    /* 
        ejercios 4.1.b
         Si la temperatura es superior a 100 grados, visualizar el mensaje “por encima del punto de ebullición del agua” sino visualizar el mensaje “por
        debajo del punto de ebullición del agua”.
        entrada = temperatura
        ¿condicion = si  temperatura es mayor 100 grados imprimer es por encima del puento de ebullicion si no decir que esta pro debajo del peuntod e ebulicon
         */
    
    double temperatura = 105.6;

     if (temperatura > 100){

        System.out.println("la temperatura esta por encima del punto de ebullicion.");

    }else{

        System.out.println("la temperatura esta por debajo del punto de ebullicion.");

         }
    }
}
