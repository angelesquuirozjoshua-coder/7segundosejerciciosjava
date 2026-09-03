import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número del mes (1-12): ");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Enero - Tiene 31 días");
                break;
            case 2:
                System.out.println("Febrero - Tiene 28 días");
                break;
            case 3:
                System.out.println("Marzo - Tiene 31 días");
                break;
            case 4:
                System.out.println("Abril - Tiene 30 días");
                break;
            case 5:
                System.out.println("Mayo - Tiene 31 días");
                break;
            case 6:
                System.out.println("Junio - Tiene 30 días");
                break;
            case 7:
                System.out.println("Julio - Tiene 31 días");
                break;
            case 8:
                System.out.println("Agosto - Tiene 31 días");
                break;
            case 9:
                System.out.println("Septiembre - Tiene 30 días");
                break;
            case 10:
                System.out.println("Octubre - Tiene 31 días");
                break;
            case 11:
                System.out.println("Noviembre - Tiene 30 días");
                break;
            case 12:
                System.out.println("Diciembre - Tiene 31 días");
                break;
            default:
                System.out.println("Error: El número debe estar comprendido entre 1 y 12.");
                break;
        }
        scanner.close();
    }
}