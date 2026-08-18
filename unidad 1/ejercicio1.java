public class ejercicio1 {
    public static void main(String[] args){
        CuentaBancaria c1= new CuentaBancaria("Teo", "001", 100.00);
        CuentaBancaria c2= new CuentaBancaria("Luis", "002", 200.00);

        System.out.println("=== ESTADO INICIAL ===\n" + c1 + "\n---\n" + c2 + "\n\n=== OPERACIONES ===");
        c1.depositar(500.0);
        c1.retirar(200.);
        c2.retirar(600.0);
        c2.depositar(300.);
        System.out.println("\n=== Estado Final ===\n" + c1 + "\n---\n" + c2);
    }
}

class CuentaBancaria{
    private final String titular, numeroCuenta;
    private double saldo;
    public CuentaBancaria(String titular, String numeroCuenta, double saldo){
        this.titular = titular;
        this.numeroCuenta= numeroCuenta;
        this.saldo = saldo;
    }
    public void depositar(double monto){
        if (monto > 0) saldo += monto;
        else System.out.println("Fondos insuficientes o monto invalido. ");
    }
    public void retirar(double monto){
        if (monto>0 && monto <= saldo) saldo -= monto;
        else System.out.println("Fondos insuficientes o monto invalido.");
    }
    @Override
    public String toString(){
        return "Titular: " + titular + " | Cuenta: " + numeroCuenta + " | Saldo: $" + saldo;
    }
}