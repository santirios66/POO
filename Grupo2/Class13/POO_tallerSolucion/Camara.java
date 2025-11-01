package Grupo2.Class13.POO_tallerSolucion;

public class Camara extends Producto{
    private String marca;
    private String modelo;

    public Camara(int numero, String nombre, double precio, String descripcion, int stock,String marca , String modelo){

        super(numero,  nombre,  precio, descripcion,  stock);
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters 
    public String getCamara(){return marca;}
    public String getModelo(){return modelo;}

    //Setters

    public void  setMarca(String marca){
        if (marca == null || marca.trim().isEmpty()){
            throw new IllegalArgumentException("La marca no puede estar vacia.");
        }
        this.marca = marca;
    }

    public void setModelo(String modelo){
        if(modelo == null || modelo.trim().isEmpty()){
            throw new IllegalArgumentException("El modelo nopeude estar vacio");
        }
        this.modelo = modelo;
    }

    public  void mostrarCamara(){
        super.mostrarProducto();
        System.out.println("Marca : " + marca);
        System.out.println("Modelo : " + modelo);
    }
}
