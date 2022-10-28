import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;

        do {
            System.out.println("Introduzca un número y mostraremos raíz. Para salir presione el 0");
            numero = scanner.nextDouble();
            if (numero == 0){
                System.out.println("Adiós para siempre");
            } else {
                System.out.println("La raíz cuadrada de " + numero + " es " + Math.sqrt(numero));
            }

        }while (numero != 0);
    }
}
