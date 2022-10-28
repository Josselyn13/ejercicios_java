import java.util.Scanner;

public class LaEscaleraIfElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un número entero y te daré información sobre él");
        int numeroIntroducido = scanner.nextInt();

        if (numeroIntroducido < 3){
            System.out.println("El número introducido es menor que 3");
        } else if (numeroIntroducido < 5) {
            System.out.println("El número está entre 3 y 5");

        } else if (numeroIntroducido < 8) {
            System.out.println("El número está entre 5 y 8");

        } else {
            System.out.println("El número es mayor que 8");
        }
    }
}
