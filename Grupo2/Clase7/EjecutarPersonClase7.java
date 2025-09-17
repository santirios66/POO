package Grupo2.Clase7;

public class EjecutarPersonClase7 {
    
    public static void main(String[] args) {
        
        //Creacion del objecto 
        // El operador "new" me permite instanciar(crear) el objeto
        Person objPerson1;
        objPerson1 = new Person(1113784573, "santiago", "Patiño Rios", 17, 168, 64.3);
    
        Person objPerson2 = new Person(1113784789, "Samuel", "Cruz", 14, 1.56, 50.3);

        System.out.println(objPerson2.Estudiar("Ingenieria de sistemas"));
    }
}
