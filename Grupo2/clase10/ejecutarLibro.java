package Grupo2.clase10;

public class ejecutarLibro {
    public static void main(String[] args) {

        // Creacion del primer objeto ( Instancia )
        System.out.println(" --- Anadiendo 'Cien Anos de Soledad'  ---");
        Libro libro1 = new Libro(" Cien Anos de Soledad ", " Gabriel Garcia Marquez ", 1967,
                496);

        // Uso del toString () y un getter
        System.out.println(" Datos iniciales : " + libro1);
        System.out.println(" Autor : " + libro1.getAutor());
        System.out.println(" ano publicacion : " + libro1.getAnioPublicacion());

        // Uso de un setter y un metodo de negocio
        libro1.setAnioPublicacion(1970);
        libro1.setNumeroPaginas(55);
        libro1.getNumeroPaginas();
        libro1.prestar();

        // Verificar estado con toString ()
        System.out.println(" Estado final : " + libro1);

        libro1.devolver();
        System.out.println(" Estado final : " + libro1);

        // Creacion de un segundo objeto
        System.out.println("\n--- Anadiendo ’El Senor de los Anillos ’ ---");
        Libro libro2 = new Libro("El Senor de los Anillos ", "J.R.R. Tolkien ", 1954,
                1216);
        libro2.prestar();
        System.out.println(" Autor : " + libro2.getAutor());
        System.out.println(" Estado Final : " + libro2);

        libro2.devolver();

        System.out.println("Estado Final : " + libro2);

        libro2.setTitulo(" El principito ");
        System.out.println("Estado Final : " + libro2);
        libro2.prestar();
        libro2.prestar();

    }

}
