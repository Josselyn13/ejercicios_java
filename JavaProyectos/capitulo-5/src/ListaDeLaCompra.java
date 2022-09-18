import java.util.ArrayList;

public class ListaDeLaCompra {
    public static void main(String[] args) {
        ArrayList<String> miListaDeLaCompra = new ArrayList<String>();
        miListaDeLaCompra.add("Patatas");
        miListaDeLaCompra.add("Leche");
        miListaDeLaCompra.add("Manzanas");

        System.out.println("Mi lista contiene " + miListaDeLaCompra);

        ArrayList<String> miListaDeEnero = new ArrayList<>(miListaDeLaCompra);

        miListaDeEnero.add("Harina");

        System.out.println("miListaDeLaCompra: " + miListaDeLaCompra + " miListaDeEnero: " + miListaDeEnero);
    }
}
