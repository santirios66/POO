package Grupo2.Class13.POO_tallerSolucion;
public class Foto {
    private String fichero;

    public Foto(String fichero) {
        setFichero(fichero);
    }

    public String getFichero() {
        return fichero;
    }

    public void setFichero(String fichero) {
        if (fichero == null || fichero.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del fichero no puede estar vacío.");
        }
        this.fichero = fichero.trim();
    }

    public void mostrarFoto() {
        System.out.println("Imprimiendo foto: " + fichero);
    }
}
