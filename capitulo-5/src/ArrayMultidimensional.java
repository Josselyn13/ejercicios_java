public class ArrayMultidimensional {
    public static void main(String[] args) {

        int miArrayDeUnaDimension[] = new int[20];
        int miArrayDeDosDimensiones[][] = new int[10][20];
        int miArrayDeTresDimensiones[][][] = new int[5][15][8];

        int tablaDeMultiplicacion[][] = new int[10][10];

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                tablaDeMultiplicacion[i][j] = i * j;

            }
        }
        System.out.println("El resultado de multiplicar 4 por 5 está en la posición [4][5] " + tablaDeMultiplicacion[4][5]);

        int miArrayMultidimensiones[][] = {{2, 5, -9}, {-7, 25, 0}};

    }
}
