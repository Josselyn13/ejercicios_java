import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomatico {

    CuentaBancaria cuentaBancariaActual;

    CajeroAutomatico(String identificador, String contrasenia){
        double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0,50000);
        cuentaBancariaActual = new CuentaBancaria("Nombre cualquiera", cantidadAleatoria);

    }
    void mostrarSaldo(){
        System.out.println("Su saldo es " + cuentaBancariaActual.obtenerSaldo());
    }

    void ingresarDinero(){
        System.out.println("¿Cuánto dinero quiere ingresar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        cuentaBancariaActual.ingresarDinero(cantidad);
    }
    void sacarDinero(){
        System.out.println("¿Cuánto dinero quiere sacar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        cuentaBancariaActual.sacarDinero(cantidad);
    }
    void consultarUltimosMovimientos(){
        GeneradorAleatorioDeMovimientos generadorAleatorioDeMovimientos = new GeneradorAleatorioDeMovimientos();
        System.out.println("¿Cuántos movimientos quiere consultar?");
        Scanner scanner = new Scanner(System.in);
        int numeroDeMovimientos = scanner.nextInt();
        ArrayList<String> movimientos = generadorAleatorioDeMovimientos.obtenerMovimientos(numeroDeMovimientos, "pesos");
        mostrarMovimientos(movimientos);
    }
    void mostrarMovimientos(ArrayList<String> movimientos){
        for (String movimiento: movimientos){
            System.out.println(movimiento);
        }
    }
    void salir(){
        System.out.println("Gracias por usar nuestros servicios");
    }

}
