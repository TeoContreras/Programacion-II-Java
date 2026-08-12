public class ejercicio1 {
    public static void main(String[] args) {
    CuentaBancaria cuenta1 = new CuentaBancaria("Teo", "001", 1000.0);
    cuenta1.mostrarEstado();    
    }
}
    
class CuentaBancaria{
    private String titular;
    private String numeroCuenta;
    private double saldo;
    
    public CuentaBancaria(String titular, String numeroCuenta, double saldo){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void mostrarEstado() {
    System.out.println("Titular: " + titular);
    System.out.println("Numero de cuenta: " + numeroCuenta);
    System.out.println("Saldo: " + saldo);
    }

    public void depositar(double monto) {
    saldo += monto;
    }

    public void retirar(double monto) {
    if (monto <= saldo) {
        saldo -= monto;
    } else {
        System.out.println("Fondos insuficientes");
    }
    }
}  