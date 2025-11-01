package Grupo2.Class13.POO_tallerSolucion;

import java.util.ArrayList;
import java.util.Date;

public class MainTallerSolucion {
    public static void main(String[] args) {

        Foto f1 = new Foto("foto1.png");
        Foto f2 = new Foto("foto2.png");
        ArrayList<Foto> fotos = new ArrayList<>();
        fotos.add(f1);
        fotos.add(f2);

        Impresion impresion = new Impresion(1, "Impresión Color", 5000, "Fotos tamaño carta", 10, "Rojo", fotos);
        Camara camara = new Camara(2, "Cámara digital", 250000, "Cámara profesional", 5, "Canon", "EOS 200D");

        Date fechaRegistro = new Date();
        Cliente cliente = new Cliente(123456789, "Santiago", "Cali", 311456789, "santi@gmail.com", fechaRegistro);

        Producto[] productos = {impresion, camara};
        Pedido pedido = new Pedido(cliente, productos, new Date(), 987654321);

        System.out.println("---Pedido Registrado ---");
        pedido.mostrarPedido();
    }
}