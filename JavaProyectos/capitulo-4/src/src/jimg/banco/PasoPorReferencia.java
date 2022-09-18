package src.jimg.banco;

import src.jimg.banco.CuentaBancaria;

public class PasoPorReferencia {
    public static void main(String[] args) {
        int variable1 = 23;
        int variable2 = variable1;

        System.out.println("El valor de variable1 es " + variable1);
        System.out.println("El valor de variable2 es " + variable2);

        variable2 = 78;
        System.out.println("El valor de variable1 es " + variable1);
        System.out.println("El valor de variable2 es " + variable2);

        CuentaBancaria cuentaDeJuan = new CuentaBancaria();
        cuentaDeJuan.saldo = 23500;

        CuentaBancaria cuentaDeAna = cuentaDeJuan;
        cuentaDeAna.saldo = 10000;

        //Ambas variables guardan referencia al mismo objeto
        //Por esto es necesario crear consttructores, de la clase de la que queremos el objeto y no variables de referencia
        System.out.println("Saldo Juan: " + cuentaDeJuan.saldo);
        System.out.println("Saldo Ana: " + cuentaDeAna.saldo);
    }
}
