public class ArrayDeUnaDimension {
    public static void main(String[] args) {
        String diasDeLaSemana[] = new String[7];
        diasDeLaSemana[0] = "lunes";
        diasDeLaSemana[1] = "martes";
        diasDeLaSemana[2] = "miércoles";
        diasDeLaSemana[3] = "jueves";
        diasDeLaSemana[4] = "viernes";
        diasDeLaSemana[5] = "sábado";
        diasDeLaSemana[6] = "domingo";

        System.out.println("El segundo día de la semana es " + diasDeLaSemana[1]);

        int numeros[] = {8, 9, 85, -6};

        int minimo, maximo;
        minimo = maximo = numeros[0];

        for (int i = 0; i <= numeros.length - 1; i++){
            if (numeros[i] > maximo) maximo = numeros[i];
            if (numeros[i] < minimo) minimo = numeros[i];
        }
        System.out.println("El valor mínimo del array es " + minimo + " y el valor máximo es " + maximo);
    }

}
