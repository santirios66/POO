package Grupo2.Clase11.Parte1;

public class Parte1_Conceptual {

    /*
     * 
     * 1. ¿Qué es la encapsulación y por qué es importante en la Programación
     * Orientada a Objetos?
     * r/{La encapsulacion es una parte importante en la programacion orientada
     * objetos ya que es la
     * que nos permite ocultar los datos de una clase usando atributos privados y
     * acceder a estos con ayuda de metodos publicos.
     * bueno y es importante por que protege la informacion, evita cambios que no
     * deberian hacer, permiten mejor control y seguridad del codigo. }
     * 
     * 2. ¿Qué diferencia hay entre un método y un constructor?
     * r/{bueno la diferencia es que uno sirve para iniciar un objecto que es el
     * cosntrucutor siempre debe tener el mismo nombre de la clase y no tine un
     * void.
     * en cambio el metodo sirve para que el objecto haga alguna una accion, puede
     * tener cualqueir nombre y si tiene tipo de retorno como el void y solo se
     * ejecuta caundo lo llaman.}
     * 
     * 3.¿Por qué los atributos deben ser privados y no públicos?
     * r/{deben ser privado para protoger los datos por que si fueran publicos
     * cualquiera podria cambiarlos directamente, y eso puede causar errores o dañar
     * lo datos del objecto.}
     * 
     * 4. ¿Qué función cumplen los getters y setters?
     * r/{Bueno la funcion de estos dos metodos el getter sirve para obtner o
     * mostrar el valor de un atributo y el setters sirve para modificar o asignar
     * un nuevo valor a un atributo.}
     * 
     * 5. Verdadero o falso: “Un método setter no debe validar los datos que
     * recibe.” Justifique
     * r/{ es falso si dbe validar los datos que recibe por que su funcion no es
     * solo cambiar el valor si no tambien asegurarse de que el dato sea correcto
     * antes de guardarlo.}
     * 
     * 
     * 
     * 
     * Parte II – Modelado (15 %)
     * --------------------------------------------------------
     * | Nombre       | Tipo de dato | Visibilidad | Descripción |
     * --------------------------------------------------------
     * | titular      | String       | private     | Nombre del dueño |
     * | numeroCuenta | String       | private     | Número de la cuenta |
     * | saldo        | double       | private     | Dinero disponible >= 0 |
     * --------------------------------------------------------
     * -------------------------------------------------------------
     * | Nombre del método | Parámetros     | Retorno | Descripción                         |
     * -------------------------------------------------------------
     * | CuentaBancaria()    | Ninguno      | —       | Constructor por defecto             |
     * | CuentaBancaria(...) | t, n, s      | —       | Constructor con validaciones        |
     * | depositar()         | double monto | void    | Aumenta el saldo si monto > 0       |
     * | retirar()           | double monto | void    | Resta si hay saldo suficiente       |
     * | getTitular()        | Ninguno      | String  | Devuelve el nombre del titular      |
     * | setTitular()        | String t     | void    | Asigna titular si no está vacío     |
     * | getNumeroCuenta()   | Ninguno      | String  | Devuelve el número de cuenta        |
     * | setNumeroCuenta()   | String n     | void    | Asigna si tiene al menos 6 dígitos  |
     * | getSaldo()          | Ninguno      | double  | Devuelve el saldo actual            |
     * | setSaldo()          | double s     | void    | Asigna saldo si es mayor o igual a 0|
     * | toString()          | Ninguno      | String  | Muestra la información de la cuenta |
     * -------------------------------------------------------------
     */
}
