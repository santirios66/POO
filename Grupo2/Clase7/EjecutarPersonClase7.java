package Grupo2.Clase7;

public class EjecutarPersonClase7 {

    public static void main(String[] args) {

        // Creacion del objecto
        // El operador "new" me permite instanciar(crear) el objeto
        Person objPerson1;
        objPerson1 = new Person(1113784573, "santiago", "Patiño Rios", 17, 168, 64.3);

        Person objPerson2 = new Person(1113784789, "Samuel", "Cruz", 14, 1.56, 50.3);

        System.out.println(objPerson2.Estudiar("Ingenieria de sistemas"));

        // Tarea : Implemtar losmetodos get y set en la clase Persona.
        // dichos metodos utiizarlos en la clase EjecutarPeersonClase7.

        // Uso de getters
        System.out.println("El nombre de la persona 1 es: " + objPerson1.getNombre());
        System.out.println("La edad de Samuel es: " + objPerson2.getEdad());

        // Uso de setters (modificar valores)
        objPerson1.setEdad(18); // cambiar edad
        objPerson2.setPeso(52.5); // cambiar peso

        // Comprobar cambios
        System.out.println("Nueva edad de " + objPerson1.getNombre() + " es: " + objPerson1.getEdad());
        System.out.println("Nuevo peso de " + objPerson2.getNombre() + " es: " + objPerson2.getPeso());
        // Los atributos de la clase son privados, por lo tanto
        // no se pueden acceder directamente desde fuera.
        //
        // El método GET permite CONSULTAR el valor de un atributo privado.
        // Ejemplo: obj.getEdad() devuelve la edad actual del objeto.
        //
        // El método SET permite MODIFICAR el valor de un atributo privado.
        // Ejemplo: obj.setEdad(18) cambia la edad dentro del objeto a 18.
        //
        // Con esto se aplica el principio de ENCAPSULACIÓN en POO,
        // ya que los atributos están protegidos y solo se pueden leer o modificar
        // de forma controlada a través de estos métodos.
    }
}
