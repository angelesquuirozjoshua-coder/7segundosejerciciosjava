import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la hora (0 a 23): ");
        int hora = scanner.nextInt();

        if (hora >= 0 && hora <= 23) {
            if (hora >= 6 && hora <= 12) {
                System.out.println("Buenos días");
            } else if (hora >= 13 && hora <= 20) {
                System.out.println("Buenas tardes");
            } else {
                System.out.println("Buenas noches");
            }
        } else {
            System.out.println("Hora fuera del rango válido (0-23).");
        }
        scanner.close();
    }
}