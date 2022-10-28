import java.util.Scanner;

public class EstructuraSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduzca el día de la semana en que quiere su cita");
        String dia = scanner.nextLine();

        switch (dia){
            case "lunes":
                System.out.println("El lunes puede venir de 11:00 a 12:30");
                break;
            case "martes":
                System.out.println("El martes puede venir de 12:00 a 14:30");
                break;
            case "miercoles":
                System.out.println("El miércoles puede venir de 12:00 a 18:30");
                break;
            case "jueves":
                System.out.println("El jueves puede venir de 12:00 a 16:30");
                break;
            case "viernes":
                System.out.println("El viernes puede venir de 11:00 a 14:30");
                break;
            case "sabado":
                System.out.println("El sábado sólo hay casos urgentes");
                break;
            case "domingo":
                System.out.println("El domingo no hay servicio");
                break;
            default:
                System.out.println("Usted no ha introducido un día válido");
        }
    }
}
