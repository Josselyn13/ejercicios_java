import java.util.Scanner;

public class BucleFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduzca el promer número");
        int primerOperando = scanner.nextInt();
        System.out.println("Por favor, introduzca el segundo número");
        int segundoOperando = scanner.nextInt();
        int resultado = 0; //se declara y se inicializa

        for (int i = 0; i < segundoOperando; i++){
            System.out.println("Iteración número: " + i);
            resultado = resultado + primerOperando;
        }
        System.out.println("El resultado de multiplicar " + primerOperando + " por " + segundoOperando + " es " + resultado);

        int suma = 0;
        for (int i=1, j=100; i<j; i++, j--){

            System.out.println("Iteración número " + i + " sumando " + i + " y " + i);
        }
        System.out.println("El resultado de sumar los números del 1 al 100 es " + suma);

    }
}
