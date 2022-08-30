import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {
        int opcionSeleccionada;

        do {
            System.out.println("Elija una de las siguientes opciones: ");
            System.out.println("    Escriba 1 para consultar su saldo");
            System.out.println("    Escriba 2 para ingresar dinero");
            System.out.println("    Escriba 3 para sacar dinero");
            System.out.println("    Escriba 4 para consultar sus últimos movimientos");
            System.out.println("Una vez elegida la opción, pulse la tecla Enter");
            System.out.println("Para salir escriba cualquier otro número");

            Scanner sc = new Scanner(System.in);

            //asigna variable a la que se ingrese
            opcionSeleccionada = sc.nextInt();

            switch (opcionSeleccionada){
                case 1:
                    System.out.println("La opción que ha elegido es consultar su saldo");
                    break;
                case 2:
                    System.out.println("La opción que ha elegido es ingresar dinero");
                    break;
                case 3:
                    System.out.println("La opción que ha elegido es sacar dinero");
                    break;
                case 4:
                    System.out.println("La opción que ha elegido es consultar sus últimos movimientos");
                    break;
                default:
                    System.out.println("Muchas gracias por usar nuestros servicios");
            }


        } while(opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3 || opcionSeleccionada ==4);


    }

}
