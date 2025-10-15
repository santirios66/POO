package Grupo2.Clase11.VersionA;

public class Principal {
    public static void main(String[] args) {

        // Crear una cuenta válida
        CuentaBancaria cuenta1 = new CuentaBancaria("Santiago", "123456", 1000.0);

        // Probar los métodos
        cuenta1.depositar(500);   // Aumenta saldo
        cuenta1.retirar(300);     // Resta saldo
        cuenta1.retirar(2000);    // Caso: saldo insuficiente

        // Mostrar información final
        System.out.println("Saldo final: " + cuenta1.getSaldo());
    }
}
