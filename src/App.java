import java.util.Scanner;
import models.Libro;
import models.Disco;

public class App {
    public static void main(String[] args) {

        // Atributos para Libro
        String tituloLibro;
        double precioLibro;
        int numeroPaginas;
        int anioPublicacion;

        // Atributos para Disco
        String tituloDisco;
        double precioDisco;
        float duracionMinutos;

        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("EDITORIAL - La de algo");
        System.out.println("========================================\n");

        // Entrada de datos para Libro
        System.out.println("--- Libro ---");
        System.out.print("Ingrese el título del libro: ");
        tituloLibro = scanner.nextLine();

        System.out.print("Ingrese el precio: ");
        precioLibro = scanner.nextDouble();

        System.out.print("Ingrese el numero de paginas: ");
        numeroPaginas = scanner.nextInt();

        System.out.print("Ingrese el año de publicación: ");
        anioPublicacion = scanner.nextInt();
        System.out.println("-------------------------\n");

        scanner.nextLine(); // Scanner Scans and scans and fails

        // Entrada de datos para Disco
        System.out.println("--- Disco ---");
        System.out.print("Ingrese el titulo del disco: ");
        tituloDisco = scanner.nextLine();

        System.out.print("Ingrese el precio: ");
        precioDisco = scanner.nextDouble();

        System.out.print("Ingrese la duracion (minutos): ");
        duracionMinutos = scanner.nextFloat();
        System.out.println("-------------------------\n");

        scanner.close();

        Libro libro = new Libro(tituloLibro, precioLibro, numeroPaginas, anioPublicacion);
        Disco disco = new Disco(tituloDisco, precioDisco, duracionMinutos);

        System.out.println(libro);
        System.out.println(disco);
    }
}
