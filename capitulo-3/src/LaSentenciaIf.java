import java.util.Scanner;

public class LaSentenciaIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroPensado = 5;
        System.out.println("Adivina el número que estoy pensando del 1 al 10");
        int numerointroducido = scanner.nextInt();
        String color;

        if (numerointroducido == numeroPensado) {
            color = "\033[0;36m";
            System.out.println(color + "Felicidades");

        } else {
            color = "\033[0;31m";
            System.out.println(color + "Error!");
        }

    }
}
