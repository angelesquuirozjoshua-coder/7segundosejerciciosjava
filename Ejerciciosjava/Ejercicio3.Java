import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MENÚ DE ÁREAS ===");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        System.out.println("4. Círculo");
        System.out.print("Seleccione una opción (1-4): ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese la longitud del lado: ");
                double lado = scanner.nextDouble();
                System.out.println("El área del cuadrado es: " + (lado * lado));
                break;
            case 2:
                System.out.print("Ingrese la base: ");
                double baseR = scanner.nextDouble();
                System.out.print("Ingrese la altura: ");
                double alturaR = scanner.nextDouble();
                System.out.println("El área del rectángulo es: " + (baseR * alturaR));
                break;
            case 3:
                System.out.print("Ingrese la base: ");
                double baseT = scanner.nextDouble();
                System.out.print("Ingrese la altura: ");
                double alturaT = scanner.nextDouble();
                System.out.println("El área del triángulo es: " + ((baseT * alturaT) / 2));
                break;
            case 4:
                System.out.print("Ingrese el radio: ");
                double radio = scanner.nextDouble();
                System.out.println("El área del círculo es: " + (Math.PI * radio * radio));
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        scanner.close();
    }
}