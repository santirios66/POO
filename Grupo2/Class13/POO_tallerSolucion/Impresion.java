package Grupo2.Class13.POO_tallerSolucion;

import java.util.ArrayList;

public class Impresion extends Producto {

    private String color;
    private ArrayList<Foto> fotos;

    public Impresion(int numero, String nombre, double precio, String descripcion, int stock, String color, ArrayList<Foto> fotos) {
        super(numero, nombre, precio, descripcion, stock);
        setColor(color);
        setFotos(fotos);
    }

    //Getters

    public String getColor(){
        return color;
    }
    public ArrayList<Foto> getFotos(){
        return fotos;
    }

    //setters
    public void setColor(String color){
        if (color == null|| color.trim().isEmpty()){
            throw new IllegalArgumentException("El color no puede estar vacio.");
        }
        this.color = color.trim();
    }

    public void setFotos(ArrayList<Foto> fotos){
        if (fotos == null || fotos.isEmpty()){
            throw  new IllegalArgumentException("Dbe tener al menos una foto para la impresion.");
        }
        this.fotos = fotos;
    }

    @Override
    public void mostrarProducto() {
        super.mostrarProducto(); // Muestra info del producto base
        System.out.println("Color: " + color);
        System.out.println("Cantidad de fotos: " + fotos.size());
        System.out.println("Listado de fotos:");
        for (Foto f : fotos) {
            System.out.println(" - " + f.getFichero());
        }
}
}