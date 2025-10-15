package Grupo2.Clase11.VersionA;

public class CuentaBancaria {

    // implementacios de atributos PRIVADOS.

    private String titular; // Nombre del dueño
    private String numeroCuenta; // El numero de la cuenta.
    private double saldo; // El saldo de la cuenta mayor a 0

    // primer constructor con sus valores por defecto
    public CuentaBancaria() {
        titular = " sin titular";
        numeroCuenta = "000000";
        saldo = 0.0;
    }

    public CuentaBancaria(String t, String n, double s) {
        if (!t.isEmpty() && n.length() >= 6 && s >= 0) { // aqui en este if se hizo la condicion que piden en cada
                                                         // atributo
            this.titular = t; // como cuales que el tiular no debe ir vacio, que el nuemrod e cuenta deberia
                              // tener un longitud mas de 6 digitos
            this.numeroCuenta = n; // y el saldo debe ser igual o mayor 0
            this.saldo = s;
        } else {
            // Y si los datos no son validos , se le asgnass los valores por defecto.
            titular = " sin titular";
            numeroCuenta = "000000";
            saldo = 0.0;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("El nombre de titular no debe estar vacio.");
        }
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        if (numeroCuenta != null && numeroCuenta.length() >= 6) {
            this.numeroCuenta = numeroCuenta;
        } else {
            System.out.println("Numero de cuenta invalido");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito exitoso. Nuevo saldo : " + saldo);
        } else {
            System.out.println("Monto invalido.No se peude depositar.");
        }

    }

    public void retirar(double monto) {
        if (saldo == 0) {
            System.out.println("Su saldo es : " + saldo);
        } else if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Su retiro fue un exito. Su saldo es " + saldo);
        } else {
            System.out.println("Disculpe su saldo es insuficiente. Vuelvalo a intentar. su saldo : " + saldo);
        }
    }

    
    public String toString() {
        return "Titular: " + titular +
                ", Número de cuenta: " + numeroCuenta +
                ", Saldo: " + saldo;
    }

}
