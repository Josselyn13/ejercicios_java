import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un número para sacar raíz");
        double numero = scanner.nextDouble();
        double candidatoARaizCuadrada = 0.0;

        while (candidatoARaizCuadrada * candidatoARaizCuadrada <= numero){
            candidatoARaizCuadrada += 0.01;
            System.out.println("Será el numero " + candidatoARaizCuadrada + " ? " + " Su cuadrado es " + (candidatoARaizCuadrada * candidatoARaizCuadrada));
        }
        candidatoARaizCuadrada -= 0.01;
        System.out.println("La raíz cuadrada es " + candidatoARaizCuadrada);
        System.out.println("La raiz cuadrada real es: " + Math.sqrt(numero));
    }
}
