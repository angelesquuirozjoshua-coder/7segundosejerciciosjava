import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de personas: ");
        int personas = scanner.nextInt();

        System.out.print("Ingrese el día de la semana (1=Lunes, 2=Martes, 3=Miércoles, 4=Jueves, 5=Viernes, 6=Sábado, 7=Domingo): ");
        int dia = scanner.nextInt();

        System.out.print("¿Cuenta con membresía? (s/n): ");
        char tieneMembresia = scanner.next().toLowerCase().charAt(0);

        double total = 0;

        switch (dia) {
            case 3: // Miércoles de promoción
                total = personas * 30;
                break;
            case 4: // Jueves de pareja
                int parejas = personas / 2;
                int individuales = personas % 2;
                total = (parejas * 75) + (individuales * 50);
                break;
            default: // Resto de días
                total = personas * 50;
                break;
        }

        if (tieneMembresia == 's') {
            total = total * 0.90; // 10% de descuento
        }

        System.out.println("El precio total a pagar es: $" + total + " pesos");
        scanner.close();
    }
}