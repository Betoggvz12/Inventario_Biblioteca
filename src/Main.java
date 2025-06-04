import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
                Biblioteca biblioteca = new Biblioteca(); // Se crea objeto para poder acceder a la clase publica de biblioteca.
                Scanner scanner = new Scanner(System.in); // Se crea el Scanner para poder hacer una peticiond de datos.
                System.out.println("¡Bienvenido al Sistema de Gestión de Biblioteca!");
                boolean salir = false;
                while (!salir) {
                    System.out.println("\nMenú Principal:");
                    System.out.println("1. Gestionar Libros");
                    System.out.println("2. Gestionar Usuarios");
                    System.out.println("3. Gestionar Préstamos");
                    System.out.println("4. Salir");
                    System.out.print("Elige una opción: ");
                    
                    int opcion = scanner.nextInt();
                    switch (opcion) {
                        case 1:
                            biblioteca.getGestorLibros().menu(scanner);
                            break;
                        case 2:
                            biblioteca.getGestorUsuarios().menu(scanner);
                            break;
                        case 3:
                            biblioteca.getGestorPrestamos().menu(scanner);
                            break;
                        case 4:
                            salir = true;
                            System.out.println("Gracias por usar el sistema. ¡Adiós!");
                            break;
                        default:
                            System.out.println("Opción inválida.");
                    }
                }
                scanner.close();
    }
}
