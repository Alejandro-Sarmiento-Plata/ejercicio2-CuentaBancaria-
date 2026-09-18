public class CuentaBancaria {

    // Atributos privados
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // 1. Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "0000000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Ahorros";
    }

    // 2. Constructor parametrizado con dos parámetros
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0.0; // Se inicializa el saldo en 0 por defecto
    }

    // 3. Constructor sobrecargado con tres parámetros
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // Método para mostrar los detalles de la cuenta
    public void mostrarDetalles() {
        System.out.println("===== Detalles de la Cuenta Bancaria =====");
        System.out.println("Número de cuenta: " + this.numeroCuenta);
        System.out.println("Saldo: $" + this.saldo);
        System.out.println("Tipo de cuenta: " + this.tipoCuenta);
        System.out.println("==========================================");
    }

    // Método toString (muy útil para el proyecto final)
    @Override
    public String toString() {
        return "CuentaBancaria [Número: " + numeroCuenta +
                ", Saldo: $" + saldo +
                ", Tipo: " + tipoCuenta + "]";
    }

    // Getters y Setters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
}