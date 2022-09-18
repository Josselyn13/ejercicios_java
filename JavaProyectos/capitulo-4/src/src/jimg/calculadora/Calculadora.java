package src.jimg.calculadora;

public class Calculadora {
    double calcularAreaCirculo(double radio){
        return Math.PI * radio * radio;
    }
    //crear un método con 3 parámetros
    double calcularVolumenPrismaRectangular(double altura, double anchura, double profundidad){
        return altura * anchura * profundidad;
    }
    //los 3 puntos indican tamaño de parámetros indefinido
    double calcularMedia(double ... numeros){
        if(numeros.length == 0){
            return 0.0;
        }

        double suma = 0.0;
        for(int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        return suma / numeros.length;
    }


}
