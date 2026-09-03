import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        System.out.print("Elija el sabor de la tarta (manzana, fresa, chocolate): ");
        String sabor = scanner.next().toLowerCase();

        switch (sabor) {
            case "manzana":
                total += 200;
                break;
            case "fresa":
                total += 250;
                break;
            case "chocolate":
                System.out.print("¿Qué tipo de chocolate prefiere? (negro/blanco): ");
                String tipoChocolate = scanner.next().toLowerCase();
                if (tipoChocolate.equals("negro")) {
                    total += 280;
                } else if (tipoChocolate.equals("blanco")) {
                    total += 300;
                } else {
                    System.out.println("Tipo de chocolate no válido.");
                }
                break;
            default:
                System.out.println("Sabor no válido.");
                break;
        }

        System.out.print("¿Desea agregar snacks? (s/n): ");
        char snack = scanner.next().toLowerCase().charAt(0);
        if (snack == 's') {
            System.out.print("¿Cuántos snacks desea añadir?: ");
            int numSnacks = scanner.nextInt();
            total += (numSnacks * 25);
        }

        System.out.print("¿Desea personalizar con un nombre? (s/n): ");
        char nombre = scanner.next().toLowerCase().charAt(0);
        if (nombre == 's') {
            total += 30;
        }

        System.out.println("El presupuesto total de la tarta es: $" + total + " pesos");
        scanner.close();
    }
}