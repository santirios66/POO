package Grupo2.clase10;

public class Libro {
    // 1. Atributos ( Encapsulamiento con ’private ’)

    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int numeroPaginas;
    private boolean prestado; // 2. Constructor

    public Libro(String titulo, String autor, int anioPublicacion, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.numeroPaginas = numeroPaginas;
        this.prestado = false; // Estado inicial
    }
     // 3. Getters ( Lectura )

    public String getTitulo() {
        return titulo;
    } 
    public String getAutor(){
        return autor;
    }
    public int getAnioPublicacion(){
        return anioPublicacion;
    }
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    // 3. Setters ( Escritura / Modificacion )

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setAnioPublicacion(int anio) {
        if (anio <= 2025 && anio > 0) {
            this.anioPublicacion = anio;
        } else {
            System.out.println(" Error : Ano de publicacion invalido .");
        }
    }
    public void setNumeroPaginas(int paginas){
        if(paginas > 0){
        this.numeroPaginas = paginas;
        }else{
            System.out.println("Error : El numero de paginas  es cero. 'Invalido'.");
        }
    }

    
    // 4. Metodos de Negocio ( Comportamiento )

    public boolean prestar() {
        if (!this.prestado) {
            this.prestado = true;
            System.out.println("El libro ’" + this.titulo +    "’ ha sido prestado exitosamente .");
            return true;
        } else {
            System.out.println("El libro ’" + this.titulo + "’ ya esta prestado .");
            return false;
        }
    }
    public boolean devolver() {
    if (this.prestado) {
        this.prestado = false;
        System.out.println("El libro '" + this.titulo + "' ha sido devuelto correctamente.");
        return true;
    } else {
        System.out.println("El libro '" + this.titulo + "' no estaba prestado.");
        return false;
    }
}

    // 5. Metodo toString ()
    @Override
    public String toString() {
        String estado = this.prestado ? " PRESTADO " : " DISPONIBLE ";

        return " Libro [ Titulo : " + titulo +
                ", Autor : " + autor +
                ", Ano: " + anioPublicacion +
                ", Paginas : " + numeroPaginas +
                ", Estado : " + estado +
                "]";
    }
}
