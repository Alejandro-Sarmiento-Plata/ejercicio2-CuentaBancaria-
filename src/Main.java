public class Main {
    public static void main(String[] args) {

        // 1. Constructor por defecto
        CuentaBancaria cuenta1 = new CuentaBancaria();
        System.out.println("Cuenta creada con constructor por defecto:");
        cuenta1.mostrarDetalles();

        System.out.println();

        // 2. Constructor con dos parámetros
        CuentaBancaria cuenta2 = new CuentaBancaria("1234567890", "Corriente");
        System.out.println("Cuenta creada con constructor de 2 parámetros:");
        cuenta2.mostrarDetalles();

        System.out.println();

        // 3. Constructor con tres parámetros
        CuentaBancaria cuenta3 = new CuentaBancaria("9876543210", 1500000.50, "Ahorros");
        System.out.println("Cuenta creada con constructor de 3 parámetros:");
        cuenta3.mostrarDetalles();

        System.out.println();
        System.out.println("Usando toString():");
        System.out.println(cuenta3);
    }
}