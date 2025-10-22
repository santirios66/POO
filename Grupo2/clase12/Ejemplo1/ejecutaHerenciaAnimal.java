package Grupo2.clase12.Ejemplo1;

public class ejecutaHerenciaAnimal {

    public static void main(String[] args) {
        
        Animal tomoe = new Gato();
        Animal doki = new Perro();

        tomoe.hacerSonido();
        doki.hacerSonido();
    }
    
}
