package src.jimg.banco;

public class Main1 {
    public static void main(String[] args) {
    CuentaBancaria cuentaDeJuan = new CuentaBancaria();

    cuentaDeJuan.titular = "Juan Martín";
    cuentaDeJuan.tipoDeCuenta = TipoDeCuenta.AHORRO;
    cuentaDeJuan.saldo = 23500;

    //Esta forma de mandar llamar los métodos no es adecuada, pues no siempre queremos que las variables de instancia puedan ser modificadas o consultadas

//    cuentaDeJuan.sacarDinero(500);
//        System.out.println("Ahora cuentaDeJuan tiene: " + cuentaDeJuan.saldo);

//    cuentaDeJuan.ingresaDinero(1000);
//        System.out.println("Después de ingresar dinero cuentaDeJuan tiene: " + cuentaDeJuan.saldo);

//    cuentaDeJuan.cambiarTipoDeCuenta("ahorro");

        //Nuevo método, sin necesidad de acceder a la variable de instancia
        double saldo = cuentaDeJuan.obtenerSaldo();
        System.out.println("El saldo de juan es: " + saldo);

        //en este caso return sirve para salir prematuramente de un método, en este caso como la cantidad es negativa, no hace nada
        cuentaDeJuan.sacarDinero(-1000);
        System.out.println("El saldo de Juan tras sacar una cantidad negativa es :" + cuentaDeJuan.obtenerSaldo());


    }
}
