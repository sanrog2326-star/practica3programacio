import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== GESTOR DE TAREAS ===");
            System.out.println("1. Mostrar mensaje");
            System.out.println("2. Sumar dos números");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Bienvenido a mi aplicación Java!");
                    break;

                case 2:
                    System.out.print("Introduce el primer número: ");
                    int num1 = scanner.nextInt();

                    System.out.print("Introduce el segundo número: ");
                    int num2 = scanner.nextInt();

                    System.out.println("Resultado: " + (num1 + num2));
                    break;

                case 3:
                    System.out.println("Cerrando aplicación...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 3);

        scanner.close();
    }
}