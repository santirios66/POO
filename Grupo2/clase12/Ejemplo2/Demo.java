package Grupo2.clase12.Ejemplo2;

public class Demo {
    
    public static void main(String[] args) {
        
        Vehiculo v1 = new Auto("toyota", 4);
        Vehiculo v2 = new Moto("Yamaha");

        v1.acelerar();
        v2.acelerar();

        System.out.println(v1.info());
        System.out.println(v2.info());
    }
}
