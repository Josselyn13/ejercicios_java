package src.jimg.calculadora;

public class Main {
    public static void main(String[] args) {
        //se crea el objeto
        Calculadora calculadora = new Calculadora();
        double radio = 4.0;
        double area = calculadora.calcularAreaCirculo(radio);

        System.out.println("El área de un círculo de radio 4 es " + area);

        System.out.println("El volumen de un prisma de 5 por 4 por 8 es: " + calculadora.calcularVolumenPrismaRectangular(5,4,8));

        System.out.println("La media de 4 números es: " + calculadora.calcularMedia(2.6, 2, 5.9, 8));


    }
}
